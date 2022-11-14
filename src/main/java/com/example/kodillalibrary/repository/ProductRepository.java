package com.example.kodillalibrary.repository;

import com.example.kodillalibrary.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Optional<Product> findById(long productId);
    List<Product> findAll();
    Product save(Product product);
}
