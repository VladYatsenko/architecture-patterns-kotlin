package behavioral.iterator

import behavioral.iterator.interfaces.Collection
import behavioral.iterator.interfaces.Iterator

class Developer(val name: String, val skills: Array<String>) : Collection<String> {

    override fun iterator(): Iterator<String> {
        return DeveloperIterator()
    }

    inner class DeveloperIterator : Iterator<String> {
        private var index = 0

        override fun hasNext(): Boolean = index < skills.lastIndex

        override fun next(): String = skills[index++]
    }

}