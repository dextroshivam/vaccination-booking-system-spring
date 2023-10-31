package com.example.vaccinationbookingsystem.dto.RequestDto;

import com.example.vaccinationbookingsystem.Enum.DoseType;
import lombok.*;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookDose1RequestDto {

    int personId;

    DoseType doseType;
}
