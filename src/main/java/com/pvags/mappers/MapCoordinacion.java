package com.pvags.mappers;

import java.util.List;
import com.pvags.pojos.Coordinacion;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author IVAN.ROCHA
 */
public interface MapCoordinacion {
    
    final String sqlGetAll = "SELECT gid,cveoper FROM ${schema}.td_jz_avance where gid=#{gid}";
    final String sqlGetCE = "select x(ST_AsText(ST_Centroid(the_geom_geo))) as x, y(ST_AsText(ST_Centroid(the_geom_geo))) as y, cveoper from ${schema}.td_ce_avance";
    final String sqlGetCZ = "select x(ST_AsText(ST_Centroid(the_geom_geo))) as x, y(ST_AsText(ST_Centroid(the_geom_geo))) as y, cveoper from ${schema}.td_cz_avance";
    final String sqlGetJZ = "select x(ST_AsText(ST_Centroid(the_geom_geo))) as x, y(ST_AsText(ST_Centroid(the_geom_geo))) as y, cveoper from ${schema}.td_jz_avance";
    
    @Results({
          @Result(property = "gid", column = "GID"),
          @Result(property = "cveoper", column = "CVEOPER")
        })
    @Select(sqlGetAll)
    List<Coordinacion> getAll(@Param("schema")String schema, @Param("gid")int gid);
    
    @Select(sqlGetCE)
    List<Coordinacion> getCE(@Param("schema")String schema);
    
    @Select(sqlGetCZ)
    List<Coordinacion> getCZ(@Param("schema")String schema);
    
    @Select(sqlGetJZ)
    List<Coordinacion> getJZ(@Param("schema")String schema);
}
