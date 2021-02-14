package structural.composite

//Composite
class Directory constructor(override val name: String) : Component(name) {

    private val children = ArrayList<Component>()

    override fun display() {
        println("Component $name")
        println("Children:")
        children.forEach {
            println(it.display())
        }
    }

    override fun add(component: Component) {
        children.add(component)
    }

    override fun remove(component: Component) {
        children.remove(component)
    }
}

//Leaf
class File constructor(override val name: String) : Component(name) {

    override fun display() {
        println(name)
    }

    override fun add(component: Component) {
        throw NotImplementedError()
    }

    override fun remove(component: Component) {
        throw NotImplementedError()
    }

}