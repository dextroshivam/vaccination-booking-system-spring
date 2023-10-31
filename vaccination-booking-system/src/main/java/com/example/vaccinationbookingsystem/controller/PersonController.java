package com.example.vaccinationbookingsystem.controller;

import com.example.vaccinationbookingsystem.Model.Person;
import com.example.vaccinationbookingsystem.dto.RequestDto.AddPersonRequestDto;
import com.example.vaccinationbookingsystem.dto.ResponseDto.AddPersonResponseDto;
import com.example.vaccinationbookingsystem.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/add")
    public ResponseEntity addPerson(@RequestBody AddPersonRequestDto addPersonRequestDto){
        try{
            AddPersonResponseDto personResponse = personService.addPerson(addPersonRequestDto);
            return new ResponseEntity(personResponse, HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity("Email already exists",HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/update_email")
    public ResponseEntity updateEmail(@RequestParam("oldEmail") String oldEmail,
                                      @RequestParam("newEmail") String newEmail){

        try{
          String response = personService.updateEmail(oldEmail,newEmail);
          return new ResponseEntity(response,HttpStatus.ACCEPTED);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    // get all males of age greater than a certain age

    // get all females who have taken only dose 1 not dose 2

    // get all the people who are fully vaccinated

    // get all the people who have not taken even a single dose

    // get all females whose age is greater than a particular age and who have taken only dose 1

    // get all males whose age is greater than a particular age and who have taken both
}
