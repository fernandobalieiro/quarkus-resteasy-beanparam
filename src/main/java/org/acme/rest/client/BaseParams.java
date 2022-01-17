package org.acme.rest.client;

import javax.ws.rs.QueryParam;

public class BaseParams {

    public static final String SEPARATOR = ",";

    @QueryParam("param1")
    private String param1;

    @QueryParam("param2")
    private String param2;

    public String getParam1() {
        return param1;
    }

    public String getParam2() {
        return param2;
    }
}
