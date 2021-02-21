package behavioral.visitor.project_element

import behavioral.visitor.developer.Developer

interface ProjectElement {
    fun beWritten(developer: Developer)
}