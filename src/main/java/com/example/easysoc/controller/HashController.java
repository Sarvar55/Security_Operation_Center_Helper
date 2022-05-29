package com.example.easysoc.controller;

import com.example.easysoc.response.ResponseUrl;
import com.example.easysoc.service.abstracts.HashService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: EasySoc
 * @author: Sarvar55
 */
@RestController
@RequestMapping("api/v1/hash")
public class HashController {
    private final HashService service;

    public HashController(HashService service) {
        this.service = service;
    }
    @GetMapping("/{hash}")
    public ResponseEntity<ResponseUrl<String>> getHash(@PathVariable String hash) {
        return  ResponseEntity.ok(new ResponseUrl<String>(service.urlConcatHash(hash), HttpStatus.OK, "Succesfully"));
    }
}
