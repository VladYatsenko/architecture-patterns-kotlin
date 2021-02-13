package creational.factory_method

import creational.factory_method.shape.Circle
import creational.factory_method.shape.Rectangle
import creational.factory_method.shape.Shape
import creational.factory_method.shape.Triangle

class ShapeFactory {

    fun getShape(shapeType: String?): Shape? {
        return when {
            shapeType.equals("CIRCLE", ignoreCase = true) -> {
                Circle()
            }
            shapeType.equals("RECTANGLE", ignoreCase = true) -> {
                Rectangle()
            }
            shapeType.equals("TRIANGLE", ignoreCase = true) -> {
                Triangle()
            }
            else -> null
        }
    }

}