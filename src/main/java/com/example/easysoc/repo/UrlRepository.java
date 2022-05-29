package com.example.easysoc.repo;

import com.example.easysoc.config.AppConstant;
import com.example.easysoc.util.FileUtil;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @project: EasySoc
 * @author: Sarvar55
 */
@Repository
public class UrlRepository {

    public Optional<List<String>> getAllIpAddress() {
        return FileUtil.fileReading(AppConstant.IP_URLS_PATH);
    }

    public Optional<List<String>> getAllDomainAddress() {
        return FileUtil.fileReading(AppConstant.DOMAIN_URL_PATH);
    }

    public Optional<List<String>> getAllHashAddress() {
        return FileUtil.fileReading(AppConstant.HASH_URL_PATH);
    }

}
