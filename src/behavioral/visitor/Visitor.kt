package behavioral.visitor

import behavioral.visitor.developer.Junior
import behavioral.visitor.developer.Senior
import behavioral.visitor.project_element.Project

/*
* Описание действий, которые выполняются с каждым объектом в некоторой структуре
* */
fun main(){

    val project = Project()

    val jun = Junior()
    val senior = Senior()

    println("Junior in action")
    project.beWritten(jun)

    println("")
    println("Senior in action")
    project.beWritten(senior)


}