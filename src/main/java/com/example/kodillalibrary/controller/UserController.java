package com.example.kodillalibrary.controller;

import com.example.kodillalibrary.controller.domain.User;
import com.example.kodillalibrary.controller.domain.UserDto;
import com.example.kodillalibrary.mapper.UserMapper;
import com.example.kodillalibrary.service.UserDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UserController {

    private final UserMapper userMapper;

    private final UserDbService service;

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers(){
        List<User> users = service.getAllUsers();
        return ResponseEntity.ok(userMapper.mapToUserDtoList(users));
    }

    @GetMapping(value = "{userId}")
    public ResponseEntity<UserDto> getUser(@PathVariable Long userId) throws Exception {
            return ResponseEntity.ok(userMapper.mapToUserDto(service.getUser(userId)));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createUser(@RequestBody UserDto userDto){
        User user = userMapper.mapToUser(userDto);
        service.saveUser(user);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId){
        service.deleteUser(userId);
        return ResponseEntity.ok().build();
    }
}
