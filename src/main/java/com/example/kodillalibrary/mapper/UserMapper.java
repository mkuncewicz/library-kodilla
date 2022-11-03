package com.example.kodillalibrary.mapper;

import com.example.kodillalibrary.domain.User;
import com.example.kodillalibrary.domain.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserMapper {

    public User mapToUser(UserDto userDto){
        return new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getLastName(),
                userDto.getData_zalozenia()
        );
    }

    public UserDto mapToUserDto(User user){
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getLastName(),
                user.getDate_create()
        );
    }

    public List<UserDto> mapToUserDtoList(List<User> userList){
        return userList.stream()
                .map(this::mapToUserDto)
                .collect(Collectors.toList());
    }
}
