package com.example.kodillalibrary.repository;

import com.example.kodillalibrary.controller.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    Optional<Product> findById(long productId);
    List<Product> findAll();
    Product save(Product product);

    List<Product> findByType(String type);
}
