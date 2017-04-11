package com.pvags.controllers;
import com.pvags.models.ValidatorUser;
import com.pvags.pojos.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author IVAN.ROCHA
 */

@Controller
@RequestMapping("login.htm")
public class LoginController {
    
    private ValidatorUser userValidate;

    public LoginController() {
        this.userValidate = new ValidatorUser();
    }

     
   @RequestMapping(method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        mav.addObject("log", new Usuario());
        return mav;
    }
    
    /*Valida el formulario al momento de enviarlo mediante la clase de spring validator*/
    @RequestMapping(method = RequestMethod.POST)
    public String form(@ModelAttribute("log") Usuario log, BindingResult result, SessionStatus status){
        this.userValidate.validate(log, result);
        ModelAndView mav = new ModelAndView();
        if(!result.hasErrors()){
            return "redirect:/inicio.html";
            //añade parametros para ser usados en la vista
//            mav.addObject("user", u.getUser());
//            mav.addObject("pwd", u.getPwd());
        }
        return "login";
    }
}
