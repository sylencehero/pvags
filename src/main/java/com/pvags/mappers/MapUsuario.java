package com.pvags.mappers;

import java.util.List;
import com.pvags.pojos.Usuario;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author IVAN.ROCHA
 */
public interface MapUsuario {
    
    final String sqlGetAll = "SELECT * FROM usuario";
    
   @Select(sqlGetAll)
    List<Usuario> getUsuarios();
}
