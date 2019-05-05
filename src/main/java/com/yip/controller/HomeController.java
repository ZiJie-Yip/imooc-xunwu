package com.yip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Title: HomeController
 * @author: Vincent.Yip
 * @Description: TODO
 * @date 2019/5/5 16:41
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name", "Vincent-Yip");
        return "index";
    }

}
