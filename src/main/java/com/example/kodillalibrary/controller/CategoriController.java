package com.example.kodillalibrary.controller;

import com.example.kodillalibrary.domain.Categori;
import com.example.kodillalibrary.domain.CategoriDto;
import com.example.kodillalibrary.mapper.CategoriMapper;
import com.example.kodillalibrary.service.CategoriDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/category")
@RequiredArgsConstructor
@CrossOrigin("*")
public class CategoriController {

    private CategoriMapper categoriMapper;

    private CategoriDbService categoriDbService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createCategory(@RequestBody CategoriDto categoriDto){
            Categori categori = categoriMapper.mapToCategori(categoriDto);
            categoriDbService.saveCategory(categori);
            return ResponseEntity.ok().build();
    }
}
