package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AppController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, 
                        @RequestParam(value="age", required=false, defaultValue="0") int age, Model model) {

        model.addAttribute("age", age);
        model.addAttribute("name", name);

        return "hello";
    }
}

