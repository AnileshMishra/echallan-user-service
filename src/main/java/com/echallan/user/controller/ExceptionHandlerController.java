package com.echallan.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.echallan.userl.exception.ResourceNotFoundException;

@ControllerAdvice
public class ExceptionHandlerController {

   @ExceptionHandler(ResourceNotFoundException.class)
   public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException e) {
       return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
   }

   @ExceptionHandler(Exception.class)
   public ResponseEntity<String> handleGenericException(Exception e) {
       return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred.");
   }
}