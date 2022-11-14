package com.example.kodillalibrary.service;

import com.example.kodillalibrary.domain.Categori;
import com.example.kodillalibrary.repository.CategoriRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoriDbService {

    private CategoriRepository categoriRepository;

    public Categori saveCategory(Categori categori){
            return categoriRepository.save(categori);
    }
}
