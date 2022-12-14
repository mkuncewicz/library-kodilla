package com.example.kodillalibrary.service;

import com.example.kodillalibrary.controller.domain.Rental;
import com.example.kodillalibrary.repository.RentalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentalDbService {

    private RentalRepository rentalRepository;

    public Rental saveRental(Rental rental){
        return rentalRepository.save(rental);
    }

    public void deleteRental(long id){
        rentalRepository.deleteById(id);
    }
}
