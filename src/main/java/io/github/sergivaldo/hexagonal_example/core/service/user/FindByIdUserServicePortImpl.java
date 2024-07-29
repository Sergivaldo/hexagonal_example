package io.github.sergivaldo.hexagonal_example.core.service.user;

import io.github.sergivaldo.hexagonal_example.core.domain.UserEntity;
import io.github.sergivaldo.hexagonal_example.core.ports.in.FindByIdUserServicePort;
import io.github.sergivaldo.hexagonal_example.core.ports.out.FindByIdUserRepositoryPort;


public class FindByIdUserServicePortImpl implements FindByIdUserServicePort {
    private final FindByIdUserRepositoryPort findByIdUserRepositoryPort;

    public FindByIdUserServicePortImpl(FindByIdUserRepositoryPort findByIdUserRepositoryPort) {
        this.findByIdUserRepositoryPort = findByIdUserRepositoryPort;
    }

    @Override
    public UserEntity find(Long id) {
        return findByIdUserRepositoryPort.find(id);
    }
}
