package com.pvags.controllers;

import javax.ws.rs.core.MediaType;
import com.pvags.services.CoordinacionService;
import com.pvags.commons.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author IVAN.ROCHA
 */
@RestController
public class ServiceController {
    
    @Autowired
    @Qualifier("coordinacionesService")
    private CoordinacionService coordinaciones;
    
    @RequestMapping(value = "/getData.do", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
    public Response getData(@RequestParam(value = "tipo") String tipo) {
        return coordinaciones.getDataCoordinaciones(tipo);
    }
    
}
