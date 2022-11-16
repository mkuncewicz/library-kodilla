package com.example.kodillalibrary.controller.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity(name = "rentals")
public class Rental {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "id_cope")
    private int id_cope;

    @Column(name = "id_user")
    private int id_user;

    @Column(name = "rentel")
    private Date rentel;

    @Column(name = "recovery")
    private Date recovery;

    @Column(name = "status")
    private String status;
}
