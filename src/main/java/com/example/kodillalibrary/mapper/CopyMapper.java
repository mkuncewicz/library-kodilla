package com.example.kodillalibrary.mapper;

import com.example.kodillalibrary.controller.domain.Copy;
import com.example.kodillalibrary.controller.domain.CopyDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CopyMapper {

    public Copy mapToCopy(CopyDto copyDto){
        return new Copy(
                copyDto.getId(),
                copyDto.getId_product(),
                copyDto.getStatus()
        );
    }

    public CopyDto mapToCopyDto(Copy copy){
        return new CopyDto(
                copy.getId(),
                copy.getId_product(),
                copy.getStatus()
        );
    }

    public List<CopyDto> mapToUserDtoList(List<Copy> copyList){
        return copyList.stream()
                .map(this::mapToCopyDto)
                .collect(Collectors.toList());
    }
}
