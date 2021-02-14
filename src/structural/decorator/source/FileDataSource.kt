package structural.decorator.source

import java.io.File
import java.io.FileOutputStream
import java.io.FileReader
import java.io.IOException


class FileDataSource constructor(private val name: String): DataSource {

    override fun writeData(data: String) {
        val file = File(name)
        try {
            FileOutputStream(file).use { fos -> fos.write(data.toByteArray(), 0, data.length) }
        } catch (ex: IOException) {
            println(ex.message)
        }
    }

    override fun readData(): String {
        var buffer: CharArray = charArrayOf()
        val file = File(name)
        try {
            FileReader(file).use { reader ->
                buffer = CharArray(file.length().toInt())
                reader.read(buffer)
            }
        } catch (ex: IOException) {
            println(ex.message)
        }
        return String(buffer)
    }
}