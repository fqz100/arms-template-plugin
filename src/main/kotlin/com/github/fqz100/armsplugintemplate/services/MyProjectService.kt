package com.github.fqz100.armsplugintemplate.services

import com.github.fqz100.armsplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
