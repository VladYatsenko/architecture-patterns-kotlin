package structural.flyweight

import structural.flyweight.model.Tree
import java.awt.Color
import java.awt.Graphics
import java.util.*
import javax.swing.JFrame
import kotlin.collections.ArrayList


class Forest: JFrame() {

    private val trees: ArrayList<Tree> = ArrayList()

    fun plantTree(x: Int, y: Int, name: String, color: Color, otherTreeData: String) {
        val type = TreeFactory.getTreeType(name, color, otherTreeData)
        val tree = Tree(x, y, type)
        trees.add(tree)
    }

    override fun paint(graphics: Graphics) {
        for (tree in trees) {
            tree.draw(graphics)
        }
    }
}