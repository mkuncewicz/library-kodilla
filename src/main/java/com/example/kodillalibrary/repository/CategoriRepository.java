package com.example.kodillalibrary.repository;

import com.example.kodillalibrary.domain.Categori;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface CategoriRepository extends CrudRepository<Categori, Long> {
    Optional<Categori> findById(long categoriId);
    List<Categori> findAll();
    Categori save(Categori categori);
}
