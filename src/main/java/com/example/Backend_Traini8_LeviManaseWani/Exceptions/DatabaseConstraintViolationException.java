package com.example.Backend_Traini8_LeviManaseWani.Exceptions;

public class DatabaseConstraintViolationException extends RuntimeException {
    public DatabaseConstraintViolationException(String message) {
        super(message);
    }
}
