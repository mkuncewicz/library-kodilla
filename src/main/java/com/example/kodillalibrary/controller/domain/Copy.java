package com.example.kodillalibrary.controller.domain;

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
@Entity(name = "copies")
public class Copy {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "id_product")
    private int id_product;

    @Column(name = "status")
    private String status;
}
