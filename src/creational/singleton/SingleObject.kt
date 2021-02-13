package creational.singleton

class SingleObject private constructor(){

    companion object{
        val instance by lazy { SingleObject() }
    }

    init {
        println("SingleObject::init()")
    }

    override fun hashCode(): Int {
        println("SingleObject::hashCode() = ${super.hashCode()}")
        return super.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

}