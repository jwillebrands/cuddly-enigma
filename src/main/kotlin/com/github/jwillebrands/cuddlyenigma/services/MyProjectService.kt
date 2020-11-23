package com.github.jwillebrands.cuddlyenigma.services

import com.intellij.openapi.project.Project
import com.github.jwillebrands.cuddlyenigma.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
