package creational.singleton

fun main() {

    val single = SingleObject.instance
    single.hashCode()

    val otherSingle = SingleObject.instance
    otherSingle.hashCode()


}