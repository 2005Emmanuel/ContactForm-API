package com.ContactFormAPI.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizedException extends ResponseEntityExceptionHandler{
    @ExceptionHandler(Exception.class)
    public final  ResponseEntity<ExceptionResponse> handleExceptions(java.lang.Exception ex, org.springframework.web.context.request.WebRequest request) throws java.lang.Exception {
        ExceptionResponse response = new ExceptionResponse(HttpStatus.INTERNAL_SERVER_ERROR.value() ,new Date(), ex.getMessage(),request.getDescription(false) );
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
      }
    
}
