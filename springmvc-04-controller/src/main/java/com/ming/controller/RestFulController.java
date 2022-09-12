package com.ming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {

    //原来风格：http://localhost:8080/add?a=1&b=3
    //RestFule风格：http://localhost:8080/add/a/b
//    @RequestMapping("/add/{a}/{b}")
//    public String test(@PathVariable int a,@PathVariable int b, Model model){
//        int res = a + b;
//        model.addAttribute("msg","结果为" + res);
//        return "test";
//    }

//    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
//    public String test(@PathVariable int a,@PathVariable int b, Model model){
//        int res = a + b;
//        model.addAttribute("msg","结果为" + res);
//        return "test";
//    }

    @PostMapping(value = "/add")
    public String test(int a,int b, Model model){
        int res = a + b;
        model.addAttribute("msg","结果1为" + res);
        return "test";
    }

    @GetMapping(value = "/add/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable int b, Model model){
        int res = a + b;
        model.addAttribute("msg","结果2为" + res);
        return "test";
    }
}
