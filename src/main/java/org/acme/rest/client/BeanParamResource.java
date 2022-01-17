package org.acme.rest.client;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/params")
public class BeanParamResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public BaseParams hello(final @BeanParam MyParams params) {
        return params;
    }
}