package com.andrejalbrecht;

public class HelloWorldPluginExtension {
    private String message = "Default Greeting from Gradle";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
