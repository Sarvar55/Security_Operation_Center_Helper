package com.example.easysoc.service.Impl;

import com.example.easysoc.config.AppConstant;
import com.example.easysoc.repo.UrlRepository;
import com.example.easysoc.service.abstracts.HashService;
import com.example.easysoc.util.JsonUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: EasySoc
 * @author: Sarvar55
 */
@Service
public class HashServiceImpl implements HashService {
    private final UrlRepository repository;

    public HashServiceImpl(UrlRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<String> urlConcatHash(String hash) {
        List<String> hashList = new ArrayList<>();
        if (repository.getAllHashAddress().isPresent()) {
            for (String url : repository.getAllHashAddress().get()) {
                if (url.contains(AppConstant.HASH_CONTROL_TEXT)) {
                    hashList.add(url.replaceAll(AppConstant.HASH_CONTROL_TEXT, hash));
                } else
                    hashList.add(url.concat(hash));
            }
        }
        return JsonUtil.converToJson(hashList);
    }
}
