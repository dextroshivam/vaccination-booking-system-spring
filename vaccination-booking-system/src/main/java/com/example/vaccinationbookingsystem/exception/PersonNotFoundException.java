package com.example.vaccinationbookingsystem.exception;

public class PersonNotFoundException extends RuntimeException{

    public PersonNotFoundException(String message){
        super(message);
    }
}
