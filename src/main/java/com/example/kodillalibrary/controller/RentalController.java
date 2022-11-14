package com.example.kodillalibrary.controller;

import com.example.kodillalibrary.domain.Categori;
import com.example.kodillalibrary.domain.CategoriDto;
import com.example.kodillalibrary.domain.Rental;
import com.example.kodillalibrary.domain.RentalDto;
import com.example.kodillalibrary.mapper.RentalMapper;
import com.example.kodillalibrary.service.RentalDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/rental")
@RequiredArgsConstructor
@CrossOrigin("*")
public class RentalController {

    private RentalMapper rentalMapper;

    private RentalDbService rentalDbService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createRental(@RequestBody RentalDto rentalDto){
        Rental rental = rentalMapper.mapToRental(rentalDto);
        rentalDbService.saveRental(rental);
        return ResponseEntity.ok().build();
    }
}
