package behavioral.observer

/*
* Определение зависимости один ко многим
* */
fun main(){

    val site = JobSite()
    site.addVacancy("Java Dev")
    site.addVacancy("Android Dev")

    val dev = Subscriber("Ivan")

    site.addObserver(dev)
    site.addVacancy("JS Dev")
    site.removeVacancy("JS Dev")


}