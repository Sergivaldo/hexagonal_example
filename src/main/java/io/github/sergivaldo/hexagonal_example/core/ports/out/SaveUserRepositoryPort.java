package io.github.sergivaldo.hexagonal_example.core.ports.out;

import io.github.sergivaldo.hexagonal_example.core.domain.UserEntity;

public interface SaveUserRepositoryPort {
    UserEntity saveUser(UserEntity userEntity);
}
