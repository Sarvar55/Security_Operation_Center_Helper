package com.example.easysoc.config;

import org.springframework.context.annotation.Configuration;

/**
 * @project: EasySoc
 * @author: Sarvar55
 */
@Configuration
public class AppConstant {
    public final static String IP_URLS_PATH = "IpUrls.txt";
    public final static String DOMAIN_URL_PATH = "domainUrls.txt";
    public final static String HASH_URL_PATH = "hashUrls.txt";
    public final static String HASH_CONTROL_TEXT = "SHA256 hash";
    public static final String DOMAIN_NAME_PATTERN = "^((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+[A-Za-z]{2,6}$";
}
