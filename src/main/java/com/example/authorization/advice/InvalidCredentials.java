package com.example.authorization.advice;

public class InvalidCredentials extends RuntimeException {

    public InvalidCredentials(String msg) {
        super(msg);
    }
}
