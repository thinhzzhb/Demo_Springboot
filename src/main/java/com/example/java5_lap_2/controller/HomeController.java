package com.example.java5_lap_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ctrl")
public class HomeController {
    @RequestMapping()
    public String ok(Model model) {
        model.addAttribute("btnClicked",false);
        model.addAttribute("textColor","text-danger");
        return "ok";
    }
    @PostMapping(value = "/ok")
    public String m1(Model model) {
        model.addAttribute("btnClicked",true);
        model.addAttribute("message", "Phương thức được gọi => m1");
        model.addAttribute("textColor","text-primary");

        return "ok";
    }
    @GetMapping(value = "/ok")
    public String m2(Model model) {
        model.addAttribute("btnClicked",true);
        model.addAttribute("message", "Phương thức được gọi => m2");
        model.addAttribute("textColor","text-warning");

        return "ok";
    }
    @RequestMapping(value = "/ok", params = "x", method = RequestMethod.POST)
    public String m3(Model model) {
        model.addAttribute("btnClicked",true);
        model.addAttribute("message", "Phương thức được gọi => m3");
        model.addAttribute("textColor","text-success");

        return "ok";
    }
}
