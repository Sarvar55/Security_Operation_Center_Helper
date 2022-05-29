package com.example.easysoc.controller;

import com.example.easysoc.response.ResponseUrl;
import com.example.easysoc.service.abstracts.DomainAddressService;
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
@RequestMapping("/api/v1/domain")
public class DomainController {
    public final DomainAddressService service;

    public DomainController(DomainAddressService service) {
        this.service = service;
    }

    @GetMapping("/{domainAddress}")
    public ResponseEntity<ResponseUrl<String>> getDomainAddress(@PathVariable String domainAddress) {
        return ResponseEntity.ok(new ResponseUrl<String>(service.urlConcatDomain(domainAddress), HttpStatus.OK, "Succesfully"));
    }
}
