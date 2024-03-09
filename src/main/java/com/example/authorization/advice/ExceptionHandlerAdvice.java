package com.example.authorization.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> invalidCredentials () {
        return new ResponseEntity<>("InvalidCredentials", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> unauthorizedUser () {
        return new ResponseEntity<>("UnauthorizedUser", HttpStatus.UNAUTHORIZED);
    }
}
