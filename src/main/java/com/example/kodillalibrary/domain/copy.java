package com.example.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity(name = "products")
public class copy {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "id_productt")
    private int id_cat;

    @Column(name = "status")
    private String status;
}
