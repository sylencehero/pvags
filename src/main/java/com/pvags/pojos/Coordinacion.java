package com.pvags.pojos;

/**
 *
 * @author IVAN.ROCHA
 */
public class Coordinacion {
    
    public int gid;
    public String cveoper;
    public String x;
    public String y;

    public Coordinacion(){}

    public Coordinacion(int gid, String cveoper, String x, String y) {
        this.gid = gid;
        this.cveoper = cveoper;
        this.x = x;
        this.y = y;
    }
    
    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getCveoper() {
        return cveoper;
    }

    public void setCveoper(String cveoper) {
        this.cveoper = cveoper;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }
    
    
}
