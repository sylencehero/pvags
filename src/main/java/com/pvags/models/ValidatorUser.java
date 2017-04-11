package com.pvags.models;

import com.pvags.pojos.Usuario;
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
        return Usuario.class.isAssignableFrom(type);
    }

    /*Core de las validaciones del formulario*/
    @Override
    public void validate(Object o, Errors errors) {
        Usuario user = (Usuario)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "usuario", "required.usuario", "El campo usuario es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contrasena", "required.contrasena", "El campo contraseña es obligatorio");
    }
}
