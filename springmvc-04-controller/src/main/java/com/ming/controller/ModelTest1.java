package com.ming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ModelTest1 {

//    无需视图解析器，测试前将解析器注释掉
    @RequestMapping("/m1/t1")
    public String test1(){
        //转发
        return "/index.jsp";
    }

    @RequestMapping("/rsm/t2")
    public String test2(){
        return "forward:/index.jsp";
    }

    @RequestMapping("/rsm/t3")
    public String test3(){
        return "redirect:/index.jsp";
    }
//    试图解析器

    @RequestMapping("/rsm2/t1")
    public String test4(Model model){

        model.addAttribute("msg","forword");
        //默认为转发
        return "test";
    }

    @RequestMapping("/rsm2/t2")
    public String test5(Model model){
        model.addAttribute("msg","ModelTest1");
        //重定向要加redirect
        return "redirect:/index.jsp";
    }
}
