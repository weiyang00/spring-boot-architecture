package com.example.springbootdemo.utils;

import com.google.gson.Gson;
/**
 * Created by weiyang on 2018/8/4.
 *
 * @Author: weiyang
 * @Package com.example.springbootdemo.utils
 * @Project: spring-boot-demo
 * @Title:
 * @Description: Please fill description of the file here
 * @Date: 2018/8/4 14:37
 */

public class JSONTool {
    private static Gson gson = new Gson();

    public JSONTool() {
    }

    public static String toJSON(Object content) {
        return gson.toJson(content);
    }

    public static Gson getGson() {
        return gson;
    }
}
