package com.nduckett.dropwizardapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.core.Configuration;

public class Config extends Configuration {
    @JsonProperty
    private String name;

    public String getName() {
        return name;
    }

}
