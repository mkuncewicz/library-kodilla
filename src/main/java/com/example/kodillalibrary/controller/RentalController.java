package com.example.kodillalibrary.controller;

import com.example.kodillalibrary.controller.domain.Rental;
import com.example.kodillalibrary.controller.domain.RentalDto;
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

    private final RentalMapper rentalMapper;

    private final RentalDbService service;

    

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createRental(@RequestBody RentalDto rentalDto){
        Rental rental = rentalMapper.mapToRental(rentalDto);
        service.saveRental(rental);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "{rentalId}")
    public ResponseEntity<Void> deleteRental(@PathVariable Long rentalId){
        service.deleteRental(rentalId);
        return ResponseEntity.ok().build();
    }
}
