package com.example.easysoc;

import com.example.easysoc.config.AppConstant;
import com.example.easysoc.repo.UrlRepository;
import com.example.easysoc.service.Impl.IpAddressServiceImpl;
import com.example.easysoc.util.FileUtil;
import io.netty.util.internal.StringUtil;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.nio.file.FileSystem;
import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class EasySocApplication implements CommandLineRunner {
    @Autowired
    private IpAddressServiceImpl service;

    @Autowired
    private UrlRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(EasySocApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

    }


    @Bean
    void testUrl() {
        JSONObject urlDetails = new JSONObject();
        JSONObject object = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        int index = 0;
        String[] urls = null;
        if (repository.getAllIpAddress().isPresent()) {
            for (String url : repository.getAllHashAddress().get()) {
//                urlDetails.put("fullpath", url.concat("585858"));
//                urlDetails.put("website", urlDetails.put("url", url.concat("475747")));
//                jsonArray.add(urlDetails);
//                System.out.println(jsonArray.toJSONString());

                System.out.println(url.replaceAll(AppConstant.HASH_CONTROL_TEXT, "jfksjn"));


            }
        }
    }
}
