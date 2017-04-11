package com.pvags.services;

import java.util.List;
import com.pvags.commons.Response;
import com.pvags.interfaces.IUsuario;
import com.pvags.pojos.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author IVAN.ROCHA
 */

@Service("usuariosService")
public class ServiceUsuario {
    
    @Autowired
    @Qualifier("usuariosDao")
    private IUsuario usuarios;
    
    public Response getDataUsuarios() {
        List<Usuario> usuariosList = usuarios.getUsuarios();
        Response respuesta = new Response(usuariosList);
        return respuesta;
    }
    
}
