package com.pvags.models;

import com.pvags.pojos.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author IVAN.ROCHA
 */
public class ValidatorUser implements Validator{
    
    @Override
    public boolean supports(Class<?> type) {
        return User.class.isAssignableFrom(type);
    }

    /*Core de las validaciones del formulario*/
    @Override
    public void validate(Object o, Errors errors) {
        User user = (User)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user", "required.user", "El campo usuario es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pwd", "required.pwd", "El campo contraseña es obligatorio");
    }
}
