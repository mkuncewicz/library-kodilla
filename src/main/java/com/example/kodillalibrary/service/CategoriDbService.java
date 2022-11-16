package com.example.kodillalibrary.service;

import com.example.kodillalibrary.controller.domain.Categori;
import com.example.kodillalibrary.repository.CategoriRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriDbService {

    private final CategoriRepository categoriRepository;

    public Categori saveCategory(Categori categori){
            return categoriRepository.save(categori);
    }

    public Categori getCategory(long id) throws Exception{
        return categoriRepository.findById(id).orElseThrow(Exception::new);
    }

    public List<Categori> getAllCategories(){
        return  categoriRepository.findAll();
    }

    public void deleteCategory(long id){
        categoriRepository.deleteById(id);
    }

}
