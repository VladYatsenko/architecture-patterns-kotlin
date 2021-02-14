package structural.flyweight

import structural.flyweight.model.TreeType
import java.awt.Color
import java.util.*


class TreeFactory {

    companion object {
        private val treeTypes: MutableMap<String, TreeType> = HashMap()

        fun getTreeType(name: String, color: Color, otherTreeData: String): TreeType {
            var result = treeTypes[name]
            if (result == null) {
                result = TreeType(name, color, otherTreeData)
                treeTypes[name] = result
            }
            return result
        }


    }


}