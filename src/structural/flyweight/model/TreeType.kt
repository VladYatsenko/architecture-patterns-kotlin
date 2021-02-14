package structural.flyweight.model

import java.awt.Color
import java.awt.Graphics

class TreeType constructor(
    private val name: String,
    private val color: Color,
    private val otherTreeType: String
) {

    fun draw(graphics: Graphics, x: Int, y: Int) {
        graphics.color = Color.BLACK
        graphics.fillRect(x - 1, y, 3, 5)
        graphics.color = color
        graphics.fillOval(x - 5, y - 10, 10, 10)
    }

}