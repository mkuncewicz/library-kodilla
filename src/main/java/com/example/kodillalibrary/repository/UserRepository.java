package com.example.kodillalibrary.repository;

import com.example.kodillalibrary.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findById(long UserId);
    List<User> findBy();
    User save(User user);
}
