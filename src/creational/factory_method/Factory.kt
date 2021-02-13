package creational.factory_method

fun main() {

    val shapeFactory = ShapeFactory()
    val shapes = listOf("CIRCLE", "TRIANGLE", "RECTANGLE")

    shapes.forEach { figureName ->
        val concreteShape = shapeFactory.getShape(figureName)
        concreteShape?.draw()
    }

}