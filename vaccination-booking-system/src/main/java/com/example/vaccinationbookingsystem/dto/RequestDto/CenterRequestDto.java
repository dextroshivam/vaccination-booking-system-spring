package com.example.vaccinationbookingsystem.dto.RequestDto;

import com.example.vaccinationbookingsystem.Enum.CenterType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CenterRequestDto {

    String centerName;

    CenterType centerType;

    String address;

}
