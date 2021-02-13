package creational.prototype

import java.util.*

class Person: Copyable {

    private var id: UUID = UUID.randomUUID()
    private var name: String = ""
    private var age: Int = 0

    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }

    private constructor(id: UUID, name: String, age: Int): this(name, age){
        this.id = id
    }

    override fun toString(): String {
        return "$name id = $id"
    }

    override fun copy(): Any {
        return Person(id, name, age)
    }


}