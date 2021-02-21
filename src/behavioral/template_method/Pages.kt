package behavioral.template_method

class WelcomePage: WebSiteTemplate(){

    override fun showPageContent() {
        println("Welcome")
    }

}

class NewsPage: WebSiteTemplate(){

    override fun showPageContent() {
        println("News")
    }

}