package behavioral.observer

import behavioral.observer.interfaces.Observed
import behavioral.observer.interfaces.Observer

class JobSite: Observed {

    private val vacancies = ArrayList<String>()
    private val observers = ArrayList<Observer>()

    fun addVacancy(vacancy: String){
        vacancies.add(vacancy)
        notifyObserver()
    }

    fun removeVacancy(vacancy: String){
        vacancies.remove(vacancy)
        notifyObserver()
    }

    override fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObserver() {
        observers.forEach { it.handleEvent(vacancies) }
    }
}