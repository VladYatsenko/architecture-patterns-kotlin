package behavioral.observer.interfaces

interface Observer {
    fun handleEvent(vacancies: List<String>)
}