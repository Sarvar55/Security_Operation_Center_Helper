package com.example.easysoc.exceptions;

import com.example.easysoc.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @project: EasySoc
 * @author: Sarvar55
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotValidException.class)
    public ResponseEntity<ApiResponse> resourceNotValidException(ResourceNotValidException exception) {
        return new ResponseEntity<ApiResponse>(new ApiResponse(exception.getMessage(),false,404), HttpStatus.BAD_REQUEST);
    }

}
