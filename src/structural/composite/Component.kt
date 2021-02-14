package structural.composite

abstract class Component constructor(open val name: String) {

    abstract fun display()
    abstract fun add(component: Component)
    abstract fun remove(component: Component)

}