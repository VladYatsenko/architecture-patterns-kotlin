package behavioral.observer

import behavioral.observer.interfaces.Observer

class Subscriber constructor(val name: String): Observer {

    override fun handleEvent(vacancies: List<String>) {
        println("Dear $name, we have some changes in vacancies: $vacancies")
    }

}