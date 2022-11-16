package com.example.kodillalibrary.service;

import com.example.kodillalibrary.controller.domain.Product;
import com.example.kodillalibrary.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductDbService {

    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public Product getProduct(long id) throws Exception{
        return productRepository.findById(id).orElseThrow(Exception::new);
    }
    public List<Product> getAllBooks(){
        return productRepository.findByType("book");
    }

    public List<Product> getAllMovies(){
        return productRepository.findByType("movie");
    }

    public void deleteProduct(long id){
        productRepository.deleteById(id);
    }
}
