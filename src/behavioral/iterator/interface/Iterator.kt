package behavioral.iterator.`interface`

interface Iterator<T: Any> {

    fun hasNext(): Boolean

    fun next(): T

}