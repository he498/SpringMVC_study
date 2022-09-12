package com.ming.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class loginController {
    @RequestMapping ("/tologin")
    public String toString(){
        return "login";
    }

    @RequestMapping("/main")
    public String tomain(){
        return "main";
    }

    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session){
        //把用户信息存在session中
        session.setAttribute("userLoginInfo",username);
        return "main";
    }

    @RequestMapping("/goOut")
    public String goOut(HttpSession session){
        session.removeAttribute("userLoginInfo");
        return "login";
    }
}
