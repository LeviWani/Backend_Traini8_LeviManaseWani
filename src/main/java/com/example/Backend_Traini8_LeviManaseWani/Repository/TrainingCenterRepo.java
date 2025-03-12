package com.example.Backend_Traini8_LeviManaseWani.Repository;

import com.example.Backend_Traini8_LeviManaseWani.Dto.SearchDto;
import com.example.Backend_Traini8_LeviManaseWani.Dto.TrainingCenterDto;
import com.example.Backend_Traini8_LeviManaseWani.Entities.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainingCenterRepo extends JpaRepository<TrainingCenter, Long> {

    @Query("SELECT new com.example.Backend_Traini8_LeviManaseWani.Dto.SearchDto(" +
            "t.id, t.centerName, t.centerCode, t.contactEmail, t.contactPhone) " +
            "FROM TrainingCenter t " +
            "WHERE LOWER(t.centerName) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
            "OR LOWER(t.centerCode) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
            "OR LOWER(t.contactEmail) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
            "OR LOWER(t.contactPhone) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<SearchDto> filter(String keyword);




}
