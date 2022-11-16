package com.example.kodillalibrary.mapper;

import com.example.kodillalibrary.controller.domain.Categori;
import com.example.kodillalibrary.controller.domain.CategoriDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoriMapper {

    public Categori mapToCategori(CategoriDto categoriDto){
        return new Categori(
                categoriDto.getId(),
                categoriDto.getName()
        );
    }

    public CategoriDto mapToCategoriDto(Categori categori){
        return new CategoriDto(
                categori.getId(),
                categori.getName()
        );
    }

    public List<CategoriDto> mapToUserDtoList(List<Categori> categoriList){
        return categoriList.stream()
                .map(this::mapToCategoriDto)
                .collect(Collectors.toList());
    }
}
