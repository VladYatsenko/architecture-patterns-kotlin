package creational.abstract_factory.factory

import creational.abstract_factory.chair.Chair
import creational.abstract_factory.chair.ClassicChair
import creational.abstract_factory.chair.ModernChair
import creational.abstract_factory.chair.VictorianChair
import creational.abstract_factory.sofa.ClassicSofa
import creational.abstract_factory.sofa.ModernSofa
import creational.abstract_factory.sofa.Sofa
import creational.abstract_factory.sofa.VictorianSofa
import creational.abstract_factory.table.ClassicTable
import creational.abstract_factory.table.ModernTable
import creational.abstract_factory.table.Table
import creational.abstract_factory.table.VictorianTable

class VictorianFurnitureFactory : FurnitureFactory {

    override fun createChair(): Chair {
        return VictorianChair()
    }

    override fun createTable(): Table {
        return VictorianTable()
    }

    override fun createSofa(): Sofa {
        return VictorianSofa()
    }
}

class ModernFurnitureFactory: FurnitureFactory {

    override fun createChair(): Chair {
        return ModernChair()
    }

    override fun createTable(): Table {
        return ModernTable()
    }

    override fun createSofa(): Sofa {
        return ModernSofa()
    }
}

class ClassicFurnitureFactory: FurnitureFactory {

    override fun createChair(): Chair {
        return ClassicChair()
    }

    override fun createTable(): Table {
        return ClassicTable()
    }

    override fun createSofa(): Sofa {
        return ClassicSofa()
    }
}