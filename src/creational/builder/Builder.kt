package creational.builder

fun main(){

    val simpleHome = Home.builder("Home").build()
    println(simpleHome.toString())

    val homeWithGarden = Home.builder("Home with garden").setFloorsNumber(2).hasGarden(true).build()
    println(homeWithGarden.toString())


}