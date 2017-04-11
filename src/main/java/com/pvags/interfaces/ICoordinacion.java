package com.pvags.interfaces;

import java.util.List;
import com.pvags.pojos.Coordinacion;

/**
 *
 * @author IVAN.ROCHA
 */
public interface ICoordinacion {
    
    public List<Coordinacion>  getCoordinaciones(String tipo);
    
}
