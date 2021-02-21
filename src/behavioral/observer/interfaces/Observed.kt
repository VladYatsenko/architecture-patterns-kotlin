package behavioral.observer.interfaces

interface Observed {
    fun addObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObserver()
}