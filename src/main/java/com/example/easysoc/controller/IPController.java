package com.example.easysoc.controller;

import com.example.easysoc.response.ResponseUrl;
import com.example.easysoc.service.abstracts.IpAddressService;
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
@RequestMapping("/api/v1/ip")
public class IPController {
    private final IpAddressService service;

    public IPController(IpAddressService service) {
        this.service = service;
    }

    @GetMapping("/{ipAddress}")
    public ResponseEntity<ResponseUrl<String>> getIpAddress(@PathVariable String ipAddress) {
        return  ResponseEntity.ok(new ResponseUrl<String>(service.urlConcatIp(ipAddress), HttpStatus.OK, "Succesfully"));
    }
}
