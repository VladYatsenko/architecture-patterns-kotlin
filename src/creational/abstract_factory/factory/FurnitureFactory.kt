package creational.abstract_factory.factory

import creational.abstract_factory.chair.Chair
import creational.abstract_factory.sofa.Sofa
import creational.abstract_factory.table.Table


interface FurnitureFactory {

    fun createChair(): Chair

    fun createTable(): Table

    fun createSofa(): Sofa
}