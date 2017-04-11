package com.pvags.daos;

import com.pvags.interfaces.ICoordinacion;
import java.util.List;
import com.pvags.mappers.MapCoordinacion;
import com.pvags.pojos.Coordinacion;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 *
 * @author IVAN.ROCHA
 */

@Repository("coordinacionesDao")
@Profile("jdbc")
public class DaoCoordinacion implements ICoordinacion{
    
    @Autowired
    @Qualifier("schema")
    private String schema;
    
    @Autowired
    @Qualifier("sessionFactory")
    private SqlSessionFactory ssf;
    
    @Override
    public List<Coordinacion> getCoordinaciones(String tipo){
        SqlSession session = ssf.openSession();	
        MapCoordinacion mapper = session.getMapper(MapCoordinacion.class);
        List<Coordinacion> coordinaciones = null;
        try{
            if (tipo.equals("ce")) {
                coordinaciones = (List<Coordinacion>) mapper.getCE(this.schema);
            }
            if (tipo.equals("cz")) {
                coordinaciones = (List<Coordinacion>) mapper.getCZ(this.schema);
            }
            if (tipo.equals("jz")) {
                coordinaciones = (List<Coordinacion>) mapper.getJZ(this.schema);
            }
        }finally{
            session.close();
        }
        return coordinaciones;
    }
    
}
