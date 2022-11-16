package com.example.kodillalibrary.mapper;

import com.example.kodillalibrary.controller.domain.Product;
import com.example.kodillalibrary.controller.domain.ProductDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {

    public Product mapToProduct(ProductDto productDto){
        return new Product(
                productDto.getId(),
                productDto.getId_cat(),
                productDto.getName(),
                productDto.getAuthor(),
                productDto.getYear(),
                productDto.getRating(),
                productDto.getType()
        );
    }

    public ProductDto mapToProductDto(Product product){
        return new ProductDto(
                product.getId(),
                product.getId_cat(),
                product.getName(),
                product.getAuthor(),
                product.getYear(),
                product.getRating(),
                product.getType()
        );
    }

    public List<ProductDto> mapToRentalDtoList(List<Product> productList){
        return productList.stream()
                .map(this::mapToProductDto)
                .collect(Collectors.toList());
    }
}
