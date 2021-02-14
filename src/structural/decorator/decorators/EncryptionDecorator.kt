package structural.decorator.decorators

import structural.decorator.source.DataSource
import java.util.*


class EncryptionDecorator (source: DataSource) : DataSourceDecorator(source) {

    override fun writeData(data: String) {
        super.writeData(encode(data))
    }

    override fun readData(): String {
        return decode(super.readData())
    }

    private fun encode(data: String): String {
        val result = data.toByteArray()
        for (i in result.indices) {
            result[i] = result[i].plus(1.toByte()).toByte()
        }
        return Base64.getEncoder().encodeToString(result)
    }

    private fun decode(data: String): String {
        val result = Base64.getDecoder().decode(data)
        for (i in result.indices) {
            result[i] = result[i].minus(1.toByte()).toByte()
        }
        return String(result)
    }

}