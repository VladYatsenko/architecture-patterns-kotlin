package behavioral.strategy

/*
* описываем набор взаимозаменяемых алгоритмов с единым интерфейсом
* */
fun main(){

    val developer = Developer()
    developer.changeActivityState(Sleeping())
    developer.executeActivity()

    developer.changeActivityState(Training())
    developer.executeActivity()

    developer.changeActivityState(Coding())
    developer.executeActivity()

    developer.changeActivityState(Reading())
    developer.executeActivity()

    developer.changeActivityState(Sleeping())
    developer.executeActivity()

}