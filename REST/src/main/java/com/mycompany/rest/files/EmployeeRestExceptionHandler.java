/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rest.files;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author nihar
 */

@ControllerAdvice
public class EmployeeRestExceptionHandler {
    
    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> handleException(EmployeeNotFoundException ex){
        
        EmployeeErrorResponse error =new EmployeeErrorResponse();
        
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(ex.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> handleException(Exception ex){
        
        EmployeeErrorResponse error =new EmployeeErrorResponse();
        
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(ex.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        
        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }
}
