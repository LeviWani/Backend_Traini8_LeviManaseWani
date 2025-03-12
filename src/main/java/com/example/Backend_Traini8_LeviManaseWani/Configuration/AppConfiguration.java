package com.example.Backend_Traini8_LeviManaseWani.Configuration;

import com.example.Backend_Traini8_LeviManaseWani.Mapper.TrainingCenterMapper;
import com.example.Backend_Traini8_LeviManaseWani.Service.implementation.TrainingCenterServiceImplementation;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public TrainingCenterServiceImplementation trainingCenterServiceImplementation() {
        return new TrainingCenterServiceImplementation();
    }


    @Bean
    public TrainingCenterMapper trainingCenterMapper() {
        return new TrainingCenterMapper();
    }
}