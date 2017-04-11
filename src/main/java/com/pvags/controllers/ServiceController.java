package com.pvags.controllers;

import javax.ws.rs.core.MediaType;
import com.pvags.commons.Response;
import com.pvags.services.ServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author IVAN.ROCHA
 */
@RestController
public class ServiceController {
    
    @Autowired
    @Qualifier("usuariosService")
    private ServiceUsuario usuarios;
    
    @RequestMapping(value = "/getUsers.do", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
    public Response getUsuarios() {
        return usuarios.getDataUsuarios();
    }
    
}
