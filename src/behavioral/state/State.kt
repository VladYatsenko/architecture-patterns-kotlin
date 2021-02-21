package behavioral.state

/*
* Управление поведением объекта в зависимости от состояния
*
* Check this site https://refactoring.guru/uk/design-patterns/state/java/example
* */
fun main(){

    val activity = Sleeping()
    val developer = Developer()

    developer.changeActivityState(activity)

    repeat(10){
        developer.justDoIt()
        developer.changeActivity()
    }

}