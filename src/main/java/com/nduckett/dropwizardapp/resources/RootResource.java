package com.nduckett.dropwizardapp.resources;

import com.nduckett.dropwizardapp.Config;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class RootResource {

    private final Config config;

    public RootResource(Config config) {
        this.config = config;
    }

    @GET
    public String sayHello() throws InterruptedException {
        Thread.sleep((long) (Math.random() * 200));
        return "Hello " + config.getName();
    }
}
