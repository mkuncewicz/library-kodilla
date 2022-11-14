package com.example.kodillalibrary.controller;

import com.example.kodillalibrary.domain.Categori;
import com.example.kodillalibrary.domain.CategoriDto;
import com.example.kodillalibrary.domain.Product;
import com.example.kodillalibrary.domain.ProductDto;
import com.example.kodillalibrary.mapper.ProductMapper;
import com.example.kodillalibrary.service.ProductDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/product")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ProductController {

    private ProductMapper productMapper;

    private ProductDbService productDbService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createCategory(@RequestBody ProductDto productDto){
        Product product = productMapper.mapToProduct(productDto);
        productDbService.saveProduct(product);
        return ResponseEntity.ok().build();
    }
}
