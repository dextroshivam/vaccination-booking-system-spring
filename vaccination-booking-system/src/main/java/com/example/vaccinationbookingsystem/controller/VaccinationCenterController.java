package com.example.vaccinationbookingsystem.controller;

import com.example.vaccinationbookingsystem.dto.RequestDto.CenterRequestDto;
import com.example.vaccinationbookingsystem.dto.ResponseDto.CenterResponseDto;
import com.example.vaccinationbookingsystem.service.VaccinationCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/center")
public class VaccinationCenterController {

    @Autowired
    VaccinationCenterService centerService;

    @PostMapping("/add")
    public CenterResponseDto addCenter(@RequestBody CenterRequestDto centerRequestDto){

        CenterResponseDto centerResponseDto = centerService.addCenter(centerRequestDto);
        return centerResponseDto;
    }

    // get all the doctors at centers of a particular centerType

    // get the center with highest number of doctors

    // get the center with highest number of doctors among a particular centerType

}
