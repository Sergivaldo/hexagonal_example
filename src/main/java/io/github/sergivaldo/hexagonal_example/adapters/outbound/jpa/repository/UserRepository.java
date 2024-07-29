package io.github.sergivaldo.hexagonal_example.adapters.outbound.jpa.repository;

import io.github.sergivaldo.hexagonal_example.adapters.outbound.jpa.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {}
