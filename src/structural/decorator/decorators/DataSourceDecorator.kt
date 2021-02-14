package structural.decorator.decorators

import structural.decorator.source.DataSource

open class DataSourceDecorator constructor(private val source: DataSource): DataSource {

    override fun writeData(data: String) {
        source.writeData(data)
    }

    override fun readData(): String {
        return source.readData()
    }

}