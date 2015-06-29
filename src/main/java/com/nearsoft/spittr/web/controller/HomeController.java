package com.nearsoft.spittr.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by vtorres on 28/06/15.
 */
@Controller
@RequestMapping(value = {"/", "/homepage", "/index.jsp", "/home.jsp", "/home.html"})
public class HomeController {

    @RequestMapping(method = GET)
    public String home() {
        return "home";
    }

}
