package com.example.Backend_Traini8_LeviManaseWani.Mapper;

import com.example.Backend_Traini8_LeviManaseWani.Dto.TrainingCenterDto;
import com.example.Backend_Traini8_LeviManaseWani.Entities.TrainingCenter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Instant;
import java.util.Date;

public class TrainingCenterMapper {
    @Autowired
    private ModelMapper modelMapper;

    public TrainingCenter toEntity(TrainingCenterDto trainingCenterDto){
        trainingCenterDto.setCreatedOn(Instant.now().toEpochMilli());  //for epoch time
        return modelMapper.map(trainingCenterDto, TrainingCenter.class);

    }

    public TrainingCenterDto toDto(TrainingCenter trainingCenter){
        return modelMapper.map(trainingCenter, TrainingCenterDto.class);

    }

}
