package com.example.vaccinationbookingsystem.controller;

import com.example.vaccinationbookingsystem.dto.RequestDto.DoctorRequestDto;
import com.example.vaccinationbookingsystem.dto.ResponseDto.DoctorResponseDto;
import com.example.vaccinationbookingsystem.repository.DoseRepository;
import com.example.vaccinationbookingsystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @PostMapping("/add")
    public ResponseEntity addDoctor(@RequestBody DoctorRequestDto doctorRequestDto){

        try{
           DoctorResponseDto doctorResponseDto = doctorService.addDoctor(doctorRequestDto);
           return new ResponseEntity(doctorResponseDto,HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/get_by_age_greater_than")
    public List<String> getByAgeGreaterThan(@RequestParam("age") int age){
        List<String> doctors = doctorService.getByAgeGreaterThan(age);
        return doctors;
    }

    // get the doctor with highest number of appointments

    // get the list of doctors who belong to a particular center

    // api to update email and/or age of a doctor

}
