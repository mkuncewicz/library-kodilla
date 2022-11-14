package com.example.kodillalibrary.repository;

import com.example.kodillalibrary.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
