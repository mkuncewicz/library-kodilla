package com.example.kodillalibrary.controller.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class UserDto {
    private int id;
    private String name;
    private String lastName;
    private Date date_create;
}
