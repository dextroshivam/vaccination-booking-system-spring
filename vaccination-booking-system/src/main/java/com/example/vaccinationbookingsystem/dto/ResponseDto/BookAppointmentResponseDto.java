package com.example.vaccinationbookingsystem.dto.ResponseDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookAppointmentResponseDto {

    String personName;

    String doctorName;

    String appointmentId;

    Date appointmentDate;

    CenterResponseDto centerResponseDto;
}
