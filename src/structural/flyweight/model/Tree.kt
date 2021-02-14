package structural.flyweight.model

import java.awt.Graphics

class Tree constructor(

    private val x: Int,

    private val y: Int,

    private val type: TreeType

) {

    fun draw(graphics: Graphics){
        type.draw(graphics, x, y)
    }

}