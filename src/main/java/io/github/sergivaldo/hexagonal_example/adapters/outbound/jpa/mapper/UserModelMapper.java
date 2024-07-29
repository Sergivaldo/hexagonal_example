package io.github.sergivaldo.hexagonal_example.adapters.outbound.jpa.mapper;

import io.github.sergivaldo.hexagonal_example.adapters.outbound.jpa.model.UserModel;
import io.github.sergivaldo.hexagonal_example.core.domain.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserModelMapper {

    public UserModel toJpaModel(UserEntity userEntity) {
        return new UserModel(userEntity.getId(), userEntity.getName(), userEntity.getEmail());
    }

    public UserEntity toDomain(UserModel user){
        return new UserEntity(user.getId(),user.getName(),user.getEmail());
    }
}
