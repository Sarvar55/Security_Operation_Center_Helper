package com.example.easysoc.util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @project: EasySoc
 * @author: Sarvar55
 */
@Component
public class JsonUtil {

    public static JSONArray converToJson(List<String> urls) {
        JSONArray jsonArray = new JSONArray();
        for (String url : urls) {
            JSONObject urlDetails = new JSONObject();
            urlDetails.put(url.split("/")[2], url);
            JSONObject title = new JSONObject();
            title.put("url", urlDetails);
            jsonArray.add(title);
        }
        return jsonArray;
    }

}
