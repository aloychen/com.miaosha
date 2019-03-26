package com.aloychen.miaosha.controller;

import com.aloychen.miaosha.result.CodeMsg;
import com.aloychen.miaosha.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {
    //*.idea;*.mvn;*.gitignore;
    //..
    //、、
    @RequestMapping("/")
    @ResponseBody
    public String home(){
        System.err.println("hello");
        return "hello1";
    }

    @RequestMapping("/hello")
    public Result<String> hello(){
        return Result.success("hello,miaosha");
    }

    @RequestMapping("/helloError")
    public Result<String> helloError(){
        return Result.error(CodeMsg.SERVER_ERROR);
    }

    @RequestMapping("/thymeleaf")
    public String  thymeleaf(Model model) {
        model.addAttribute("name", "Joshua");
        return "hello";
    }
}
