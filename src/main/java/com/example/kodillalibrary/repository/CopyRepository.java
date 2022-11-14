package com.example.kodillalibrary.repository;

import com.example.kodillalibrary.domain.Copy;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CopyRepository extends CrudRepository<Copy, Long>{
    Optional<Copy> findById(Long copyId);
    List<Copy> findAll();
    Copy save(Copy copy);
}
