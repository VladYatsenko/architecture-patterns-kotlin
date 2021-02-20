package behavioral.iterator

/*
* Получение последовательного доступа к элементам коллекции
* */
fun main(){

    val developer = Developer("Ivan", arrayOf("OOP", "Java", "Patterns", "English"))

    println("Developer: ${developer.name}")
    println("Skills:")
    val iterator = developer.iterator()
    while (iterator.hasNext()){
        println(iterator.next())
    }
}