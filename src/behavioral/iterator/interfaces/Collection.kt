package behavioral.iterator.interfaces

interface Collection<T: Any> {

    fun iterator(): Iterator<T>

}