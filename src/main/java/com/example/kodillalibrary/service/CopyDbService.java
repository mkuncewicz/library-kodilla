package com.example.kodillalibrary.service;

import com.example.kodillalibrary.domain.Categori;
import com.example.kodillalibrary.domain.Copy;
import com.example.kodillalibrary.repository.CopyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CopyDbService {

    private CopyRepository copyRepository;

    public Copy saveCopy(Copy copy){
        return copyRepository.save(copy);
    }
}
