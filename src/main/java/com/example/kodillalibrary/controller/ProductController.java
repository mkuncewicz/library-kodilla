package com.example.kodillalibrary.controller;

import com.example.kodillalibrary.controller.domain.Product;
import com.example.kodillalibrary.controller.domain.ProductDto;
import com.example.kodillalibrary.mapper.ProductMapper;
import com.example.kodillalibrary.service.ProductDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/product")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ProductController {

    private ProductMapper productMapper;

    private ProductDbService service;

    @GetMapping
    public ResponseEntity<List<ProductDto>> getProducts() {
        List<Product> products = service.getAllProducts();
        return ResponseEntity.ok(productMapper.mapToRentalDtoList(products));
    }

    @GetMapping(value = "{ProductId}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable long prodId) throws  Exception{
        return ResponseEntity.ok(productMapper.mapToProductDto(service.getProduct(prodId)));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createProduct(@RequestBody ProductDto productDto){
        Product product = productMapper.mapToProduct(productDto);
        service.saveProduct(product);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long productId){
        service.deleteProduct(productId);
        return ResponseEntity.ok().build();
    }
}
