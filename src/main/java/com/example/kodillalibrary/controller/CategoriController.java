package com.example.kodillalibrary.controller;

import com.example.kodillalibrary.controller.domain.Categori;
import com.example.kodillalibrary.controller.domain.CategoriDto;
import com.example.kodillalibrary.mapper.CategoriMapper;
import com.example.kodillalibrary.service.CategoriDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/category")
@RequiredArgsConstructor
@CrossOrigin("*")
public class CategoriController {

    private final CategoriMapper categoriMapper;

    private final CategoriDbService service;


    @GetMapping
    public ResponseEntity<List<CategoriDto>> getAvailableProducts() {
        List<Categori> categories = service.getAllCategories();
        return ResponseEntity.ok(categoriMapper.mapToUserDtoList(categories));
    }

    @GetMapping(value = "{catId}")
    public ResponseEntity<CategoriDto> getCategory(Long catId) throws Exception{
        return ResponseEntity.ok(categoriMapper.mapToCategoriDto(service.getCategory(catId)));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createCategory(@RequestBody CategoriDto categoriDto){
            Categori categori = categoriMapper.mapToCategori(categoriDto);
            service.saveCategory(categori);
            return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "{categoryId}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long catId){
        service.deleteCategory(catId);
        return ResponseEntity.ok().build();
    }

}
