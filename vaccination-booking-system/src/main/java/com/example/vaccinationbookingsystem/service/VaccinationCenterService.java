package com.example.vaccinationbookingsystem.service;

import com.example.vaccinationbookingsystem.Model.VaccinationCenter;
import com.example.vaccinationbookingsystem.dto.RequestDto.CenterRequestDto;
import com.example.vaccinationbookingsystem.dto.ResponseDto.CenterResponseDto;
import com.example.vaccinationbookingsystem.repository.VaccinationCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccinationCenterService {

    @Autowired
    VaccinationCenterRepository centerRepository;

    public CenterResponseDto addCenter(CenterRequestDto centerRequestDto) {

        // request dto -> entity
        VaccinationCenter center = new VaccinationCenter();
        center.setCenterName(centerRequestDto.getCenterName());
        center.setCenterType(centerRequestDto.getCenterType());
        center.setAddress(centerRequestDto.getAddress());

        // save entity to db
        VaccinationCenter savedCenter = centerRepository.save(center);

        // entity -> response Dto
        CenterResponseDto centerResponseDto = new CenterResponseDto();
        centerResponseDto.setCenterName(savedCenter.getCenterName());
        centerResponseDto.setAddress(savedCenter.getAddress());
        centerResponseDto.setCenterType(savedCenter.getCenterType());
        return centerResponseDto;

    }
}
