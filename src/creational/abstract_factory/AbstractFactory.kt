package creational.abstract_factory

import creational.abstract_factory.factory.ClassicFurnitureFactory
import creational.abstract_factory.factory.FurnitureFactory
import creational.abstract_factory.factory.ModernFurnitureFactory
import creational.abstract_factory.factory.VictorianFurnitureFactory

/**
 * https://refactoring.guru/ru/design-patterns/abstract-factory
 */
fun main() {

    val factory: FurnitureFactory

    val modelTypes = hashMapOf(0 to "Victorian", 1 to "Modern", 2 to "Classic")
    modelTypes.forEach { (number, name) -> println("$number - $name") }

    var selectedModel: Int
    do {
        println("Select model type: ")
        selectedModel = readLine()?.toInt() ?: -1
    } while (!modelTypes.containsKey(selectedModel))
    println("Selected model type: ${modelTypes[selectedModel]}")

    factory = when(modelTypes[selectedModel]){
        "Victorian" -> VictorianFurnitureFactory()
        "Modern" -> ModernFurnitureFactory()
        else -> ClassicFurnitureFactory()
    }

    val furnitureTypes = hashMapOf(0 to "Chair", 1 to "Table", 2 to "Sofa")
    furnitureTypes.forEach { (number, name) -> println("$number - $name") }

    var selectedFurniture: Int
    do {
        println("Select furniture type: ")
        selectedFurniture = readLine()?.toInt() ?: -1
    } while (!furnitureTypes.containsKey(selectedFurniture))
    println("Selected furniture type: ${furnitureTypes[selectedFurniture]}")

    factory.apply {
        when(furnitureTypes[selectedFurniture]){
            "Chair" -> {
                val chair = createChair()
                chair.sitOn()
            }
            "Table" -> {
                val table = createTable()
                table.putOn()
            }
            "Sofa" -> {
                val sofa = createSofa()
                sofa.lieOn()
            }
        }
    }

}