package io.github.sergivaldo.hexagonal_example.adapters.outbound.jpa.repository;

import io.github.sergivaldo.hexagonal_example.adapters.outbound.jpa.mapper.UserModelMapper;
import io.github.sergivaldo.hexagonal_example.core.domain.UserEntity;
import io.github.sergivaldo.hexagonal_example.core.ports.out.FindByIdUserRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FindByIdUserRepositoryAdapter implements FindByIdUserRepositoryPort {
    private final UserRepository userRepository;
    private final UserModelMapper userModelMapper;
    @Override
    public UserEntity find(Long id) {
        return userModelMapper.toDomain(
                userRepository.findById(id).orElseThrow(
                        () -> new RuntimeException("user not exists")
                )
        );
    }

}
