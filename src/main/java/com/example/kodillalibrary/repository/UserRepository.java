package com.example.kodillalibrary.repository;

import com.example.kodillalibrary.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
