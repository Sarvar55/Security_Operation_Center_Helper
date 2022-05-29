package com.example.easysoc.service.Impl;

import com.example.easysoc.exceptions.ResourceNotValidException;
import com.example.easysoc.repo.UrlRepository;
import com.example.easysoc.service.abstracts.DomainAddressService;
import com.example.easysoc.util.JsonUtil;
import com.example.easysoc.util.RegexUtil;
import org.json.simple.JSONArray;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: EasySoc
 * @author: Sarvar55
 */
@Service
public class DomainAddressServiceImpl implements DomainAddressService {
    private final UrlRepository repository;

    public DomainAddressServiceImpl(UrlRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<String> urlConcatDomain(String domainAddress) {
        JSONArray jsonArray = null;
        if (!RegexUtil.isValidDomainAddress(domainAddress)) {
            throw new ResourceNotValidException(domainAddress);
        }
        List<String> urls = new ArrayList<>();
        if (repository.getAllDomainAddress().isPresent()) {
            for (String url : repository.getAllDomainAddress().get()) {
                urls.add(url.concat(domainAddress));
            }
            jsonArray = JsonUtil.converToJson(urls);
        }
        return jsonArray;
    }
}
