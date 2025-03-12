package com.example.Backend_Traini8_LeviManaseWani.Controller;

import com.example.Backend_Traini8_LeviManaseWani.Constants.ApiConstants;
import com.example.Backend_Traini8_LeviManaseWani.Dto.SearchDto;
import com.example.Backend_Traini8_LeviManaseWani.Dto.TrainingCenterDto;
import com.example.Backend_Traini8_LeviManaseWani.Entities.TrainingCenter;
import com.example.Backend_Traini8_LeviManaseWani.Service.implementation.TrainingCenterServiceImplementation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Controller {
    @Autowired
    private TrainingCenterServiceImplementation trainingCenterServiceImplementation;


    @PostMapping(ApiConstants.ADD_CENTER)
    public ResponseEntity<TrainingCenterDto> addCenter(@Valid @RequestBody  TrainingCenterDto trainingCenterDto){
    TrainingCenterDto trainingCenterDto1 = trainingCenterServiceImplementation.addCenter(trainingCenterDto);
        System.out.println("---------" + trainingCenterDto);
    return  new ResponseEntity<>(trainingCenterDto, HttpStatus.CREATED);

    }

    @GetMapping(ApiConstants.GET_ALL_CENTERS)
    public List<TrainingCenterDto> getCenters(){
        return trainingCenterServiceImplementation.getAllCenters();
    }
    @GetMapping(ApiConstants.GET_ALL_EXPENSES_WITH_PAGINATION)
    public Page<TrainingCenter> pagination(@PathVariable int offset, @PathVariable int pagesize){
        return trainingCenterServiceImplementation.pagination(offset, pagesize);
    }
    @GetMapping(ApiConstants.FILTER)
    public List<SearchDto> search(@PathVariable String keyword){
        return trainingCenterServiceImplementation.search(keyword);
    }




}
