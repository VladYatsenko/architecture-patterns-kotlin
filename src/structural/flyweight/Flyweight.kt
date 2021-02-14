package structural.flyweight

import java.awt.Color
import kotlin.math.floor
import kotlin.random.Random

var CANVAS_SIZE = 500
var TREES_TO_DRAW = 1000000
var TREE_TYPES = 2

fun main() {

    val forest = Forest()

    for (i in 0..floor(TREES_TO_DRAW / TREE_TYPES.toDouble()).minus(1).toInt()) {
        forest.run {
            plantTree(
                Random.nextInt(0, CANVAS_SIZE),
                Random.nextInt(0, CANVAS_SIZE),
                "Summer Oak",
                Color.GREEN,
                "Oak texture stub"
            )
            plantTree(
                Random.nextInt(0, CANVAS_SIZE),
                Random.nextInt(0, CANVAS_SIZE),
                "Autumn Oak",
                Color.ORANGE,
                "Autumn Oak texture stub"
            )
        }
    }

    forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
    forest.setVisible(true);

    println("$TREES_TO_DRAW trees drawn");
    println("---------------------");
    println("Memory usage:");
    println("Tree size (8 bytes) * $TREES_TO_DRAW");
    println("+ TreeTypes size (~30 bytes) * $TREE_TYPES");
    println("---------------------");
    println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
            "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");

}