package com.example.kodillalibrary.repository;

import com.example.kodillalibrary.controller.domain.Rental;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RentalRepository extends CrudRepository<Rental, Long> {
    Optional<Rental> findById(long rentalId);
    List<Rental> findAll();
    Rental save(Rental rental);
}
