package com.sc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(VaultException.class)
    public final ResponseEntity<ErrorDetails> handleAllException(Exception ex, WebRequest request){
        return new ResponseEntity<>( CustomResponseEntityExceptionHandler.errorMessage(ex), HttpStatus.NOT_FOUND);
    }

    private static ErrorDetails errorMessage(Exception exception){
        return new ErrorDetails(LocalDateTime.now(),exception.getMessage());
    }
}
