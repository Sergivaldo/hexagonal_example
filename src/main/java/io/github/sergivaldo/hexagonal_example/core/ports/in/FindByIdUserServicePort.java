package io.github.sergivaldo.hexagonal_example.core.ports.in;

import io.github.sergivaldo.hexagonal_example.core.domain.UserEntity;

public interface FindByIdUserServicePort {

    UserEntity find(Long id);
}
