package com.example.fetureflagsdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties()
class MessageProperties {
    private String test;

    public String getMessage() {
        return test;
    }

    public void setMessage(String message) {
        this.test = message;
    }
}