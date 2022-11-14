package com.example.kodillalibrary.repository;

import com.example.kodillalibrary.domain.Rental;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RentalRepository extends CrudRepository<Rental, Long> {
    Optional<Rental> findById(long rentalId);
    List<Rental> findAll();
    Rental save(Rental rental);
}
