package com.andrejalbrecht;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class HelloWorldTask extends DefaultTask {
    @TaskAction
    public void greet() {
        HelloWorldPluginExtension extension = getProject().getExtensions().findByType(HelloWorldPluginExtension.class);
        if (extension == null) {
            extension = new HelloWorldPluginExtension();
        }

        String message = extension.getMessage();
        HelloWorld helloWorld = new HelloWorld(message);
        System.out.println(helloWorld.greet());
    }
}
