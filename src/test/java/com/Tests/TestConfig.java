package com.Tests;

public class TestConfig {




    public final String value;

    TestConfig(String value){
        this.value = Configuration.getConfiguration().getProperty(value);

    }

}
