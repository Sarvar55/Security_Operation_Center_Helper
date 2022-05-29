package com.example.easysoc.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.net.http.HttpRequest;

/**
 * @project: EasySoc
 * @author: Sarvar55
 */
@Getter
@Setter
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ResourceNotValidException extends RuntimeException {
    private String resourceName;

    public ResourceNotValidException(String resourceName) {
        super(String.format("%s not valid", resourceName));
        this.resourceName = resourceName;
    }
}
