package com.andrejalbrecht

import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import static org.junit.Assert.*

class HelloWorldTaskTest {
    @Test
    public void should_be_able_to_add_task_to_project() {
        Project project = ProjectBuilder.builder().build()
        def task = project.task('demo', type: HelloWorldTask)
        
        assertTrue(task instanceof HelloWorldTask)
    }
}
