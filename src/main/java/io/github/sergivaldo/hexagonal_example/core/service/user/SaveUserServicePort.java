package io.github.sergivaldo.hexagonal_example.core.service.user;

import io.github.sergivaldo.hexagonal_example.core.domain.UserEntity;

public interface SaveUserServicePort {
    UserEntity saveUser(UserEntity User);
}
