package com.selam.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.print.attribute.standard.RequestingUserName;

/**
 * Created by Bereketdeb on 5/8/2017.
 */
@Controller
public class CopyController {


    @RequestMapping("/about")
    public String about(){

        return "copy/about";  //copy is the about view folder in the template folder
    }
}
