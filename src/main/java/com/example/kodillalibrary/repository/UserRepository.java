package com.example.kodillalibrary.repository;

import com.example.kodillalibrary.controller.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findById(long UserId);
    User save(User user);

    List<User> findAll();
}
