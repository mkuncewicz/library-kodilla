package com.example.kodillalibrary.service;

import com.example.kodillalibrary.controller.domain.Copy;
import com.example.kodillalibrary.repository.CopyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CopyDbService {

    private CopyRepository copyRepository;

    public Copy saveCopy(Copy copy){
        return copyRepository.save(copy);
    }

    public List<Copy> getAllCopies(){
        return copyRepository.findAll();
    }

    public Copy getCopy(long id) throws Exception{
        return copyRepository.findById(id).orElseThrow(Exception::new);
    }
    public void deleteCopy(long id){
        copyRepository.deleteById(id);
    }
}
