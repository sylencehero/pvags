package com.pvags.services;

import java.util.List;
import com.pvags.interfaces.ICoordinacion;
import com.pvags.pojos.Coordinacion;
import com.pvags.commons.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author IVAN.ROCHA
 */

@Service("coordinacionesService")
public class CoordinacionService {
    
    @Autowired
    @Qualifier("coordinacionesDao")
    private ICoordinacion coordinaciones;
    
    public Response getDataCoordinaciones(String tipo) {
        List<Coordinacion> coordinacionesList = coordinaciones.getCoordinaciones(tipo);
        Response respuesta = new Response(coordinacionesList);
        return respuesta;
    }
    
}
