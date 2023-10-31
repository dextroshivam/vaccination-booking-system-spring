package com.example.vaccinationbookingsystem.exception;

public class CenterNotFoundException extends RuntimeException{

    public CenterNotFoundException(String message){
        super(message);
    }
}
