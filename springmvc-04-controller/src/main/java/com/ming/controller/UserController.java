package com.ming.controller;

import com.ming.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        //1.接受前端数据
        System.out.println("接收到前端数据为"+name);
        //2.将返回结果传递到前端 model
        model.addAttribute("msg",name);
        //3.视图跳转
        return "test";
    }

    //前端接受的是一个对象： id,name,age
    /*
    1.接受前端用户传递的参数，判断参数名字，假设名字直接再方法上可以直接使用
    2.假设传递的是一个对象user，匹配user对象中的字段名，如果名字一致则ok，否则匹配不到
    */
    @RequestMapping("/t2")
    public String test2(User user,Model model){
        System.out.println(user);
        model.addAttribute("msg",user);
        return "test";
    }

    /*
    LinkedHashMap
    ModelMap : 继承了LinkedHashMap
    Model: 精简版
     */

    @RequestMapping("/t3")
    public String test2(User user, ModelMap model){
        System.out.println(user);
        //相当于req.setAttribute("name",name);
        model.addAttribute("msg",user.getName());
        return "test";
    }
}
