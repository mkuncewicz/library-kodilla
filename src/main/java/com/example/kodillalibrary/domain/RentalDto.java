package com.example.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class RentalDto {
    private int id;
    private int id_cope;
    private int id_user;
    private Date rentel;
    private Date recovery;
    private String status;
}
