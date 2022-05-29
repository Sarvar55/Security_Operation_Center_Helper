package com.example.easysoc.util;

import com.example.easysoc.config.AppConstant;
import org.springframework.context.annotation.Bean;

import java.util.regex.Pattern;

/**
 * @project: EasySoc
 * @author: Sarvar55
 */
public class RegexUtil {

    public static boolean isValidDomainAddress(String domain) {
        Pattern pattern = Pattern.compile(AppConstant.DOMAIN_NAME_PATTERN);
        return pattern.matcher(domain).find();
    }

}
