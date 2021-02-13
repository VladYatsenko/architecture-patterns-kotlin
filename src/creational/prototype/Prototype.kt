package creational.prototype

fun main(){

    val tamara = Person("Tamara", 17)
    println("tamara = $tamara")

    val sameTamara = tamara.copy()
    println("sameTamara = $sameTamara")

}