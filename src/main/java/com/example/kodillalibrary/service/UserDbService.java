package com.example.kodillalibrary.service;

import com.example.kodillalibrary.controller.domain.User;
import com.example.kodillalibrary.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDbService {

    private final UserRepository userRepository;
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUser(long id) throws Exception{
        return userRepository.findById(id).orElseThrow(Exception::new);
    }
    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(long id){
        userRepository.deleteById(id);
    }
}
