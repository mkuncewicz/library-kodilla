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
@Entity(name = "products")
public class Product {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "id_cat")
    private int id_cat;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "year")
    private int year;

    @Column(name = "rating")
    private int rating;

    @Column(name = "type")
    private String type;
}
