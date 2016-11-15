package com.andrejalbrecht;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class HelloWorldGradlePlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getExtensions().create("demoSetting", HelloWorldPluginExtension.class);
        project.getTasks().create("helloworld", HelloWorldTask.class);
    }
}
