package com.andrejalbrecht

import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import static org.junit.Assert.*

class HelloWorldPluginTest {
    @Test
    public void hello_world_plugin_should_add_task_to_project() {
        Project project = ProjectBuilder.builder().build()
        project.getPlugins().apply 'com.andrejalbrecht.helloworld.plugin'

        assertTrue(project.tasks.helloworld instanceof HelloWorldTask)
    }
}
