package com.service.cse.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseJAXRSServerDemoCodegen", date = "2018-10-29T07:11:09.873Z")


@RestSchema(schemaId = "projecte0qe")
@Path("/cse")

@Produces({ "application/json" })
public class Projecte0qeImpl  {

    @Autowired
    private Projecte0qeDelegate projecte0qeDelegate;

    @Path("/helloworld")
    @GET
    
    @Produces({ "application/json" })
    public String helloworld(@QueryParam("name") String name) {

    	return projecte0qeDelegate.helloworld(name);
    }
}

