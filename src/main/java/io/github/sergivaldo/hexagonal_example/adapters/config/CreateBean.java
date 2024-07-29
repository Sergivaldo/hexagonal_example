package io.github.sergivaldo.hexagonal_example.adapters.config;

import io.github.sergivaldo.hexagonal_example.adapters.inbound.rest.mapper.UserModelMapper;
import io.github.sergivaldo.hexagonal_example.core.ports.in.FindByIdUserServicePort;
import io.github.sergivaldo.hexagonal_example.core.ports.out.FindByIdUserRepositoryPort;
import io.github.sergivaldo.hexagonal_example.core.ports.out.SaveUserRepositoryPort;
import io.github.sergivaldo.hexagonal_example.core.service.user.FindByIdUserServicePortImpl;
import io.github.sergivaldo.hexagonal_example.core.service.user.SaveUserServiceImpl;
import io.github.sergivaldo.hexagonal_example.core.service.user.SaveUserServicePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateBean {

    @Bean
    public SaveUserServicePort saveUserService(SaveUserRepositoryPort saveUserRepositoryPort){
        return new SaveUserServiceImpl(saveUserRepositoryPort);
    }

    @Bean public FindByIdUserServicePort findByIdUserService(FindByIdUserRepositoryPort findByIdUserRepositoryPort){
        return new FindByIdUserServicePortImpl(findByIdUserRepositoryPort);
    }

    @Bean
    public io.github.sergivaldo.hexagonal_example.adapters.outbound.jpa.mapper.UserModelMapper userJpaEntityMapper(){
        return new io.github.sergivaldo.hexagonal_example.adapters.outbound.jpa.mapper.UserModelMapper();
    }

    @Bean
    public UserModelMapper userMapper(){
        return new UserModelMapper();
    }

}
