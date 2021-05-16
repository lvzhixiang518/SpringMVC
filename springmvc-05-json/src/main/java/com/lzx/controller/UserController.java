package com.lzx.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lzx.pojo.User;
import com.lzx.util.JsonUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value = "/j1")
    //@ResponseBody //它就不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {
        //jackson ,ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        User user = new User("吕智翔",34,"男");
        String str = mapper.writeValueAsString(user);

        return str;
    }

    @RequestMapping(value = "/j2")
    //@ResponseBody //它就不会走视图解析器，会直接返回一个字符串
    public String json2() throws JsonProcessingException {
        //jackson ,ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        List<User> users = new ArrayList<>();

        User user1 = new User("吕智翔1",34,"男");
        User user2 = new User("吕智翔2",34,"男");
        User user3 = new User("吕智翔3",34,"男");
        User user4 = new User("吕智翔4",34,"男");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        String str = mapper.writeValueAsString(users);

        return str;
    }

    @RequestMapping(value = "/j3")
    //@ResponseBody //它就不会走视图解析器，会直接返回一个字符串
    public String json3() throws JsonProcessingException {
        //jackson ,ObjectMapper

        Date date = new Date();
        return JsonUtil.getJson(date,"yyyy-mm-dd HH:mm:ss");
    }

    @RequestMapping(value = "/j4")
    //@ResponseBody //它就不会走视图解析器，会直接返回一个字符串
    public String json4() throws JsonProcessingException {
        List<User> users = new ArrayList<>();

        User user1 = new User("吕智翔1",34,"男");
        User user2 = new User("吕智翔2",34,"男");
        User user3 = new User("吕智翔3",34,"男");
        User user4 = new User("吕智翔4",34,"男");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        String s = JSON.toJSONString(users);
        return s;
    }
}
