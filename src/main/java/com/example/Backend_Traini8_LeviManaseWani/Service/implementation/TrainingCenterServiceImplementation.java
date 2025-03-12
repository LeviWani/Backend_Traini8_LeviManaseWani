package com.example.Backend_Traini8_LeviManaseWani.Service.implementation;

import com.example.Backend_Traini8_LeviManaseWani.Dto.SearchDto;
import com.example.Backend_Traini8_LeviManaseWani.Dto.TrainingCenterDto;
import com.example.Backend_Traini8_LeviManaseWani.Entities.TrainingCenter;
import com.example.Backend_Traini8_LeviManaseWani.Mapper.TrainingCenterMapper;
import com.example.Backend_Traini8_LeviManaseWani.Repository.TrainingCenterRepo;
import com.example.Backend_Traini8_LeviManaseWani.Service.ServiceInterface.TrainingCenterInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrainingCenterServiceImplementation implements TrainingCenterInterface {

    @Autowired
    private TrainingCenterRepo repo;
    @Autowired
    private TrainingCenterMapper trainingCenterMapper;
    ////add center
    @Override
    public TrainingCenterDto addCenter(TrainingCenterDto trainingCenterDto) {
        TrainingCenter trainingCenter = trainingCenterMapper.toEntity(trainingCenterDto);
        TrainingCenter savedCenter = repo.save(trainingCenter);
        return trainingCenterMapper.toDto(savedCenter);
    }

    ///getallcenters

    @Override
    public List<TrainingCenterDto> getAllCenters() {
        List<TrainingCenter> expenses = repo.findAll();
        return expenses.stream().map((temp)->trainingCenterMapper.toDto(temp)).toList();

    }
//search or filter
    @Override
    public List<SearchDto> search(String keyword){
        List<SearchDto> list = repo.filter(keyword);
        return list;
    }
@Override
    public Page<TrainingCenter> pagination(int offset, int pageSize){
        Page<TrainingCenter> page = repo.findAll(PageRequest.of(offset, pageSize));
        return  page;

    }








}
