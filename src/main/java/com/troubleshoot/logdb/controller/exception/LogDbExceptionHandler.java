package com.troubleshoot.logdb.controller.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class LogDbExceptionHandler extends ResponseEntityExceptionHandler {
    
    @ResponseBody
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleExceptions(ResponseStatusException e) {
        ErrorResponse errorResponse = new ErrorResponse() {
            @Override
            public HttpStatusCode getStatusCode() {
                return e.getStatusCode();
            }
            
            @Override
            public ProblemDetail getBody() {
                return e.getBody();
            }
        };
        return new ResponseEntity<>(errorResponse, e.getStatusCode());
    }
    
}