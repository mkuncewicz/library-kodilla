package com.example.kodillalibrary.repository;

import com.example.kodillalibrary.controller.domain.Copy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CopyRepository extends CrudRepository<Copy, Long>{
    Optional<Copy> findById(Long copyId);
    List<Copy> findAll();
    Copy save(Copy copy);
}
