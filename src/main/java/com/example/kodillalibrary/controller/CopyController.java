package com.example.kodillalibrary.controller;

import com.example.kodillalibrary.controller.domain.Copy;
import com.example.kodillalibrary.controller.domain.CopyDto;

import com.example.kodillalibrary.mapper.CopyMapper;
import com.example.kodillalibrary.service.CopyDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/copy")
@RequiredArgsConstructor
@CrossOrigin("*")
public class CopyController {

    private CopyMapper copyMapper;

    private CopyDbService service;

    @GetMapping
    public ResponseEntity<List<CopyDto>> getAvailableProducts() {
        List<Copy> copies = service.getAllCopies().stream()
                .filter(n -> n.getStatus().equalsIgnoreCase("Dostepny"))
                .collect(Collectors.toList());
        return ResponseEntity.ok(copyMapper.mapToUserDtoList(copies));
    }

    @GetMapping(value = "{copyId}")
    public ResponseEntity<CopyDto> getCopy(@PathVariable Long copyId) throws  Exception{
        return ResponseEntity.ok(copyMapper.mapToCopyDto(service.getCopy(copyId)));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createCopy(@RequestBody CopyDto copyDto){
        Copy copy = copyMapper.mapToCopy(copyDto);
        service.saveCopy(copy);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "{copyId}")
    public  ResponseEntity<Void> deleteCopy(@PathVariable long copyId){
        service.deleteCopy(copyId);
        return ResponseEntity.ok().build();
    }



}
