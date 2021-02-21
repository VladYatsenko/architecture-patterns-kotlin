package behavioral.visitor.project_element

import behavioral.visitor.developer.Developer

class Database: ProjectElement {
    override fun beWritten(developer: Developer) {
        developer.create(this)
    }

}

class ProjectClass: ProjectElement {
    override fun beWritten(developer: Developer) {
        developer.create(this)
    }

}

class Test: ProjectElement {
    override fun beWritten(developer: Developer) {
        developer.create(this)
    }

}