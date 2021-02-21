package behavioral.memento

import java.util.*

class Project {

    private var version: String? = null
    private var date: Date? = null

    fun setVersionAndDate(version: String){
        this.version = version
        this.date = Date()
    }

    fun save(): Save{
        return Save(version)
    }

    fun load(save: Save?) {
        version = save?.version
        date = save?.date
    }

    override fun toString(): String {
        return "Project - version=$version date=${date.toString()}"
    }
}