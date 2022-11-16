package com.example.kodillalibrary.repository;

import com.example.kodillalibrary.controller.domain.Categori;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoriRepository extends CrudRepository<Categori, Long> {
    Optional<Categori> findById(long categoriId);
    List<Categori> findAll();
    Categori save(Categori categori);
}
