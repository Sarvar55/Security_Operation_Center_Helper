package com.example.easysoc.util;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @project: EasySoc
 * @author: Sarvar55
 */
@Component
public class FileUtil {
    public static Optional<List<String>> fileReading(String path) {
        List<String> urls = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                urls.add(sCurrentLine);
            }
        } finally {
            return Optional.ofNullable(urls);
        }
    }

}
