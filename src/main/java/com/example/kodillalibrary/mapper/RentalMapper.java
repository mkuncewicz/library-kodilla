package com.example.kodillalibrary.mapper;

import com.example.kodillalibrary.controller.domain.Rental;
import com.example.kodillalibrary.controller.domain.RentalDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RentalMapper {


    public Rental mapToRental(RentalDto rentalDto){
        return new Rental(
                rentalDto.getId(),
                rentalDto.getId_cope(),
                rentalDto.getId_user(),
                rentalDto.getRentel(),
                rentalDto.getRecovery(),
                rentalDto.getStatus()
        );
    }

    public RentalDto mapToRentalDto(Rental rental){
        return new RentalDto(
                rental.getId(),
                rental.getId_cope(),
                rental.getId_user(),
                rental.getRentel(),
                rental.getRecovery(),
                rental.getStatus()
        );
    }

    public List<RentalDto> mapToRentalDtoList(List<Rental> rentalList){
        return rentalList.stream()
                .map(this::mapToRentalDto)
                .collect(Collectors.toList());
    }
}
