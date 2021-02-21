package behavioral.template_method

/*
* Переопределение некоторых шагов базового класса наследниками
* */
fun main(){

    val welcome = WelcomePage()
    val news = NewsPage()

    welcome.showPage()

    println("====================================")

    news.showPage()


}