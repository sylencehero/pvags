package com.pvags.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author IVAN.ROCHA
 */

@Controller
public class IndexController {
    
    @RequestMapping(value = "/inicio.html", method = RequestMethod.GET)
    public String index(ModelMap map) {
        return "inicio";
    }
    
    
}
