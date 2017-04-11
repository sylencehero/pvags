package com.pvags.commons;

import java.util.List;

public class Response {

    private List list;

    public Response(List list) {
        this.list = list;
    }

    public Response() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
    
    
    
}
