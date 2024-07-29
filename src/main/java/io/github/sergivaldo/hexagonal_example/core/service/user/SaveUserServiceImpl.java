package io.github.sergivaldo.hexagonal_example.core.service.user;

import io.github.sergivaldo.hexagonal_example.core.domain.UserEntity;
import io.github.sergivaldo.hexagonal_example.core.ports.out.SaveUserRepositoryPort;

public class SaveUserServiceImpl implements SaveUserServicePort{
    private final SaveUserRepositoryPort saveUserRepositoryPort;

    public SaveUserServiceImpl(SaveUserRepositoryPort saveUserRepositoryPort) {
        this.saveUserRepositoryPort = saveUserRepositoryPort;
    }

    @Override
    public UserEntity saveUser(UserEntity User) {
        return saveUserRepositoryPort.saveUser(User);
    }
}
