package com.franco.curso.springboot.error.springbooterror.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
    } 
}