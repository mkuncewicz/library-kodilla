package com.example.kodillalibrary.repository;

import com.example.kodillalibrary.domain.Rental;
import org.springframework.data.repository.CrudRepository;

public interface RentalRepository extends CrudRepository<Rental, Long> {
}
