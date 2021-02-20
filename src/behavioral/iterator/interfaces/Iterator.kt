package behavioral.iterator.interfaces

interface Iterator<T: Any> {

    fun hasNext(): Boolean

    fun next(): T

}