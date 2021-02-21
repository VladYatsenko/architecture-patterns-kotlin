package behavioral.visitor.developer

import behavioral.visitor.project_element.Database
import behavioral.visitor.project_element.ProjectClass
import behavioral.visitor.project_element.Test

interface Developer {

    fun create(projectClass: ProjectClass)

    fun create(database: Database)

    fun create(test: Test)

}