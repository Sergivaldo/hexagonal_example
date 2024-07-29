package io.github.sergivaldo.hexagonal_example.adapters.inbound.rest.mapper;

import io.github.sergivaldo.hexagonal_example.adapters.inbound.rest.dto.UserDTO;
import io.github.sergivaldo.hexagonal_example.core.domain.UserEntity;

public class UserModelMapper {


    public UserEntity toDomain(UserDTO source) {
        return new UserEntity(source.getId(), source.getName(), source.getEmail());
    }
    
    public UserDTO toDTO(UserEntity source) {
        return new UserDTO(source.getId(), source.getName(), source.getEmail());
    }
}
