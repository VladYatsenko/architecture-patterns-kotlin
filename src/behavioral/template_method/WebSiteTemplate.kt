package behavioral.template_method

abstract class WebSiteTemplate {

    fun showPage(){
        println("Header")
        showPageContent()
        println("Footer")
    }

    abstract fun showPageContent()

}