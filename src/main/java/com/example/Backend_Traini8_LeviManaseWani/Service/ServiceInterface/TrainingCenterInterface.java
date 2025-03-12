package com.example.Backend_Traini8_LeviManaseWani.Service.ServiceInterface;

import com.example.Backend_Traini8_LeviManaseWani.Dto.SearchDto;
import com.example.Backend_Traini8_LeviManaseWani.Dto.TrainingCenterDto;
import com.example.Backend_Traini8_LeviManaseWani.Entities.TrainingCenter;
import org.springframework.data.domain.Page;

import java.util.List;

public interface TrainingCenterInterface {
    TrainingCenterDto addCenter(TrainingCenterDto trainingCenterDto);
    List<TrainingCenterDto> getAllCenters();
    List<SearchDto> search(String keyword);
    Page<TrainingCenter> pagination(int offset, int pageSize);

}
