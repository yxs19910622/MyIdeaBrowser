package com.github.yxs19910622.myideabrowser.services

import com.intellij.openapi.project.Project
import com.github.yxs19910622.myideabrowser.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
