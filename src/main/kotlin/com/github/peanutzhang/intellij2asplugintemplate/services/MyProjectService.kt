package com.github.peanutzhang.intellij2asplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.peanutzhang.intellij2asplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
