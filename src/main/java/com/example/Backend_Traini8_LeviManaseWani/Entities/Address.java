package com.example.Backend_Traini8_LeviManaseWani.Entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "addressId")
    private Long addressId;

    @NotBlank(message = "Enter a valid address")

    private String fullAddress;

    @NotBlank(message = "Enter a valid city")
    private String city;

    @NotBlank(message = "Enter a valid state")
    private String state;

    @NotNull(message = "Pincode cannot be null")
    @Min(value = 100000, message = "Pincode must be a 6-digit number")
    @Max(value = 999999, message = "Pincode must be a 6-digit number")
    private Integer pincode;


}
