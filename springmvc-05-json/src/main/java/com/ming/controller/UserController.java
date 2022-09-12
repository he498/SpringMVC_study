package com.ming.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ming.pojo.User;
import com.ming.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController //不走视图解析器
public class UserController {

    //produces解决乱码
//    @RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")
    @RequestMapping("/j1")
//    @ResponseBody //不走视图解析器，直接返回一个字符串
    public String json1() throws JsonProcessingException {
        //jackson ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User("明1",3,"男");
        String str = mapper.writeValueAsString(user);
        return str;
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        List<User> userList =new ArrayList<User>();
        User user1 = new User("明1",3,"男");
        User user2 = new User("明2",3,"男");
        User user3 = new User("明3",3,"男");
        User user4 = new User("明4",3,"男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        String str = mapper.writeValueAsString(userList);
        return str;
    }

    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//        //不使用时间戳的方式
//        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
//        //自定义日期格式
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        mapper.setDateFormat(sdf);
//        Date date = new Date();
//        //ObjectMapper时间解析后的默认格式为:Timestamp 时间戳
//        return mapper.writeValueAsString(date);

        Date date = new Date();
        return JsonUtils.getJson(date);
    }

    @RequestMapping("/j4")
    public String json4(){

        List<User> userList = new ArrayList<User>();
        User user1 = new User("明1",3,"男");
        User user2 = new User("明2",3,"男");
        User user3 = new User("明3",3,"男");
        User user4 = new User("明4",3,"男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        return JsonUtils.getJson(userList);
    }

    @RequestMapping("/j5")
    public String json5(){
        List<User> userList = new ArrayList<User>();
        User user1 = new User("明1",3,"男");
        User user2 = new User("明2",3,"男");
        User user3 = new User("明3",3,"男");
        User user4 = new User("明4",3,"男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        String str = JSON.toJSONString(userList);
        return str;
    }
    /*
    System.out.println("*******Java对象 转 JSON字符串*******");
       String str1 = JSON.toJSONString(list);
       System.out.println("JSON.toJSONString(list)==>"+str1);
       String str2 = JSON.toJSONString(user1);
       System.out.println("JSON.toJSONString(user1)==>"+str2);

       System.out.println("\n****** JSON字符串 转 Java对象*******");
       User jp_user1=JSON.parseObject(str2,User.class);
       System.out.println("JSON.parseObject(str2,User.class)==>"+jp_user1);

       System.out.println("\n****** Java对象 转 JSON对象 ******");
       JSONObject jsonObject1 = (JSONObject) JSON.toJSON(user2);
       System.out.println("(JSONObject) JSON.toJSON(user2)==>"+jsonObject1.getString("name"));

       System.out.println("\n****** JSON对象 转 Java对象 ******");
       User to_java_user = JSON.toJavaObject(jsonObject1, User.class);
       System.out.println("JSON.toJavaObject(jsonObject1, User.class)==>"+to_java_user);
     */

}
