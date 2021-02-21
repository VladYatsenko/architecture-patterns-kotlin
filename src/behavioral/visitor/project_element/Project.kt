package behavioral.visitor.project_element

import behavioral.visitor.developer.Developer

class Project: ProjectElement {

    private val projectElements: ArrayList<ProjectElement> = ArrayList()

    init {
        projectElements.add(ProjectClass())
        projectElements.add(Database())
        projectElements.add(Test())
    }

    override fun beWritten(developer: Developer) {
        projectElements.forEach {
            when(it){
                is ProjectClass -> developer.create(it)
                is Database -> developer.create(it)
                is Test -> developer.create(it)
            }

        }
    }
}