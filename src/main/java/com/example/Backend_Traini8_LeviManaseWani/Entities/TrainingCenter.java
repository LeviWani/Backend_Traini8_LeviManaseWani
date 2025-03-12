package com.example.Backend_Traini8_LeviManaseWani.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "center name cant be blank")
    @Size(max = 40, message = "center name should be less than 40 chacrcters long")
    private String centerName;

    @Size(min = 12, max = 12, message = "length of centre code should be 12")
    private String centerCode;
    @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "addressId")
   private Address address;
    @NotNull(message = "student capacity cant be blank")
    private int studentCapacity;

    private List<String> coursesOffered;

    private Long createdOn;
    @Email(message = "enter vaalid email")
    private String contactEmail;
    @NotBlank(message = "enter valid contact phone")
    @Pattern(regexp="^[0-9]{10}$", message="Phone number must be exactly 10 digits")
    private String contactPhone;

}
