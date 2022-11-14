package com.example.kodillalibrary.controller;

import com.example.kodillalibrary.domain.Categori;
import com.example.kodillalibrary.domain.CategoriDto;
import com.example.kodillalibrary.domain.Copy;
import com.example.kodillalibrary.domain.CopyDto;
import com.example.kodillalibrary.mapper.CopyMapper;
import com.example.kodillalibrary.service.CopyDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/copy")
@RequiredArgsConstructor
@CrossOrigin("*")
public class CopyController {

    private CopyMapper copyMapper;

    private CopyDbService copyDbService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createCopy(@RequestBody CopyDto copyDto){
        Copy copy = copyMapper.mapToCopy(copyDto);
        copyDbService.saveCopy(copy);
        return ResponseEntity.ok().build();
    }

}
