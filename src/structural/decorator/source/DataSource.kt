package structural.decorator.source

interface DataSource {

    fun writeData(data: String)

    fun readData(): String

}