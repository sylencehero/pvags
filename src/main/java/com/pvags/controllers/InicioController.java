/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pvags.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author IVAN.ROCHA
 */

@Controller
@RequestMapping(value = "/validaUsuario")
public class InicioController {
    
   @RequestMapping(method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/pages/inicio.html";
    }
}
