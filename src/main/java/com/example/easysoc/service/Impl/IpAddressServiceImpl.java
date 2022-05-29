package com.example.easysoc.service.Impl;

import com.example.easysoc.exceptions.ResourceNotValidException;
import com.example.easysoc.repo.UrlRepository;
import com.example.easysoc.service.abstracts.IpAddressService;
import com.example.easysoc.util.JsonUtil;
import org.apache.commons.validator.routines.InetAddressValidator;
import org.json.simple.JSONArray;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: EasySoc
 * @author: Sarvar55
 */
@Service
public class IpAddressServiceImpl implements IpAddressService {

    private final UrlRepository repository;
    private static final InetAddressValidator validator = InetAddressValidator.getInstance();

    public IpAddressServiceImpl(UrlRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<String> urlConcatIp(String ipAddress) {
        JSONArray jsonArray = null;
        if (!validator.isValidInet4Address(ipAddress)) {
            throw new ResourceNotValidException(ipAddress);
        }
        List<String> urls = new ArrayList<>();
        if (repository.getAllIpAddress().isPresent()) {
            for (String url : repository.getAllIpAddress().get()) {
                urls.add(url.concat(ipAddress));
            }
            jsonArray = JsonUtil.converToJson(urls);
        }
        return jsonArray;
    }


}
