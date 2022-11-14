package com.example.kodillalibrary.service;

import com.example.kodillalibrary.domain.User;
import com.example.kodillalibrary.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDbService {

    private UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }
}
