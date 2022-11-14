package com.example.kodillalibrary.controller;

import com.example.kodillalibrary.domain.Categori;
import com.example.kodillalibrary.domain.CategoriDto;
import com.example.kodillalibrary.domain.User;
import com.example.kodillalibrary.domain.UserDto;
import com.example.kodillalibrary.mapper.UserMapper;
import com.example.kodillalibrary.service.UserDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UserController {

    private UserMapper userMapper;

    private UserDbService userDbService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createUser(@RequestBody UserDto userDto){
        User user = userMapper.mapToUser(userDto);
        userDbService.saveUser(user);
        return ResponseEntity.ok().build();
    }
}
