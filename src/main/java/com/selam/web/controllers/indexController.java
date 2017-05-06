package com.selam.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bereketdeb on 5/6/2017.
 */
@Controller
public class indexController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }}
