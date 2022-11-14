package com.example.kodillalibrary.service;

import com.example.kodillalibrary.domain.Product;
import com.example.kodillalibrary.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductDbService {

    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
}
