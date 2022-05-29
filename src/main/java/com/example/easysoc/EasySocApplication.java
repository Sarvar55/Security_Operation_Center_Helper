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


    public static void main(String[] args) {
        SpringApplication.run(EasySocApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

    }

}
