package behavioral.memento

/*
* Вынесение внутреннего состояние объекта за его пределы для последующего возможного восстановления объекта без нарушения принципа инкапсуляции
* */
fun main(){

    val project = Project()
    val repo = GithubRepository()

    println("Creating new project...")
    project.setVersionAndDate("Version 1.0")

    println(project.toString())

    println("Save to git project...")
    repo.save = project.save()

    println("Writing code")
    project.setVersionAndDate("Version 1.1")
    println("Something went wrong...")

    println("Rolling back to 1.0")
    project.load(repo.save)

    println("Project after roll back")
    println(project.toString())


}