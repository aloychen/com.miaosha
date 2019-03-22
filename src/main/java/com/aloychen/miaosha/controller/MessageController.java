package com.aloychen.miaosha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping("/message")
public class MessageController {
    @RequestMapping("/")
    public String getMessage(Model model){
        int randomNum = new Random().nextInt(8);
        model.addAttribute("num",randomNum);
        return "message/message1";
    }
}
