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

///adding center api
    @PostMapping(ApiConstants.ADD_CENTER)
    public ResponseEntity<TrainingCenterDto> addCenter(@Valid @RequestBody  TrainingCenterDto trainingCenterDto){
    TrainingCenterDto trainingCenterDto1 = trainingCenterServiceImplementation.addCenter(trainingCenterDto);
        System.out.println("---------" + trainingCenterDto);
    return  new ResponseEntity<>(trainingCenterDto, HttpStatus.CREATED);

    }
//get all centers
    @GetMapping(ApiConstants.GET_ALL_CENTERS)
    public List<TrainingCenterDto> getCenters(){
        return trainingCenterServiceImplementation.getAllCenters();
    }

    //should number of center be large, pagination should help minimize number shown per page
    @GetMapping(ApiConstants.GET_ALL_EXPENSES_WITH_PAGINATION)
    public Page<TrainingCenter> pagination(@PathVariable int offset, @PathVariable int pagesize){
        return trainingCenterServiceImplementation.pagination(offset, pagesize);
    }

    //its a filter but more like search which returns filters all centers that have a field coontaining the keyword
    @GetMapping(ApiConstants.FILTER)
    public List<SearchDto> search(@PathVariable String keyword){
        return trainingCenterServiceImplementation.search(keyword);
    }




}
