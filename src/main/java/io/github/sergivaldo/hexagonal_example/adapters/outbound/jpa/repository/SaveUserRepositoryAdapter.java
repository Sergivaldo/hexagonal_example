package io.github.sergivaldo.hexagonal_example.adapters.outbound.jpa.repository;

import io.github.sergivaldo.hexagonal_example.adapters.outbound.jpa.mapper.UserModelMapper;
import io.github.sergivaldo.hexagonal_example.core.domain.UserEntity;
import io.github.sergivaldo.hexagonal_example.core.ports.out.SaveUserRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SaveUserRepositoryAdapter implements SaveUserRepositoryPort {
    private final UserRepository userRepository;
    private final UserModelMapper userModelMapper;

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return userModelMapper.toDomain(
                userRepository.save(
                        userModelMapper.toJpaModel(userEntity)
                )
        );
    }
}
