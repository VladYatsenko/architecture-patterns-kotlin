package behavioral.visitor.developer

import behavioral.visitor.project_element.Database
import behavioral.visitor.project_element.ProjectClass
import behavioral.visitor.project_element.Test

class Junior : Developer {

    override fun create(projectClass: ProjectClass) {
        println("Writing poor code...")
    }

    override fun create(database: Database) {
        println("Drop db...")
    }

    override fun create(test: Test) {
        println("Create not reliable test...")
    }

}

class Senior : Developer {

    override fun create(projectClass: ProjectClass) {
        println("Rewrite junior code...")
    }

    override fun create(database: Database) {
        println("Fixing db...")
    }

    override fun create(test: Test) {
        println("Create reliable test...")
    }

}