package io.github.sergivaldo.hexagonal_example.adapters.inbound.rest.controller;

import io.github.sergivaldo.hexagonal_example.adapters.inbound.rest.dto.UserDTO;
import io.github.sergivaldo.hexagonal_example.adapters.inbound.rest.mapper.UserModelMapper;
import io.github.sergivaldo.hexagonal_example.core.ports.in.FindByIdUserServicePort;
import io.github.sergivaldo.hexagonal_example.core.service.user.SaveUserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final SaveUserServicePort saveUserServicePort;
    private final FindByIdUserServicePort findByIdUserServicePort;
    private final UserModelMapper userMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO create(@RequestBody UserDTO userDTO){
        return userMapper.toDTO(
                saveUserServicePort.saveUser(
                        userMapper.toDomain(userDTO)
                )
        );
    }

    @GetMapping("/{id}")
    public UserDTO findById(@PathVariable Long id){
        return userMapper.toDTO(findByIdUserServicePort.find(id));
    }

}
