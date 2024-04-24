package com.example.advice;

import com.example.exception.Exception;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AdviceController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<String> handleExceptionGlobally(Exception exception) {
        System.out.println("advise controller is started : ");
        return new ResponseEntity<>(exception.getErrorMessage(), exception.getErrorCode());
    }
}
