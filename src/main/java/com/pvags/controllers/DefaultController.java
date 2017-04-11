package com.pvags.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/", method = RequestMethod.POST)
public class DefaultController {
    

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap map) {
        boolean sesion = false;
        if(sesion){
            return "login";
        }
        else{
            return "redirect:/login.htm";
        }
    }
    
    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String index2(ModelMap map) {
        boolean sesion = false;
        if(sesion){
            return "login";
        }
        else{
            return "redirect:/login.htm";
        }
    }
   
}
