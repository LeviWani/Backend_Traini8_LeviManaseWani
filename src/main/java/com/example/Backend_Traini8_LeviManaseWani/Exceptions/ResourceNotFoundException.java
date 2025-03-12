package com.example.Backend_Traini8_LeviManaseWani.Exceptions;

public class ResourceNotFoundException extends RuntimeException {

    //added this exception as i thought filtering would create an exception but it returns an empty list
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
