package com.example.Backend_Traini8_LeviManaseWani.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class AddressDto {




    @NotBlank(message = "entgr valid address")

    private String fullAddress;

    @NotBlank(message = "enter valid city")
    private String city;

    @NotBlank(message = "enter valid state")
    private String state;

    @NotNull(message = "Pincode can not be null")
    @Min(value = 100000, message = "Pin code must be a 6 digits ")
    @Max(value = 999999, message = "Pin code must be a 6 digits ")
    private Integer pincode;

}
