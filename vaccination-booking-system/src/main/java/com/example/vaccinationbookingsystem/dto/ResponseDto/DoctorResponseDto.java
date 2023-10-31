package com.example.vaccinationbookingsystem.dto.ResponseDto;

import com.example.vaccinationbookingsystem.Model.VaccinationCenter;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DoctorResponseDto {

    String name;

    String message;

   CenterResponseDto centerResponseDto;
}
