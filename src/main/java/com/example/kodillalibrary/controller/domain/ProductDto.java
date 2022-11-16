package com.example.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProductDto {
    private int id;
    private int id_cat;
    private String name;
    private String author;
    private int year;
    private int rating;
    private String type;
}
