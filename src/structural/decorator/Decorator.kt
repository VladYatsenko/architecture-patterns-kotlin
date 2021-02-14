package structural.decorator

import structural.decorator.decorators.CompressionDecorator
import structural.decorator.decorators.EncryptionDecorator
import structural.decorator.source.FileDataSource

/*
https://refactoring.guru/uk/design-patterns/decorator/java/example#lang-features
 */
fun main(){

    val salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000"

    val dataSource = FileDataSource("out/OutputDemo.txt")

    val encryption = EncryptionDecorator(dataSource)
    val compression = CompressionDecorator(encryption)

    compression.writeData(salaryRecords)
    val plain = FileDataSource("out/OutputDemo.txt")

    println("- Input ----------------")
    println(salaryRecords)
    println("- Encoded --------------")
    println(plain.readData())
    println("- Decoded --------------")
    println(compression.readData())
}