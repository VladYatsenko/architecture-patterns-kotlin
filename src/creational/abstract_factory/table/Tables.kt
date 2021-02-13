package creational.abstract_factory.table

import creational.abstract_factory.chair.Chair

class VictorianTable : Table {
    override fun putOn() {
        println("VictorianTable::putOn()")
    }
}

class ModernTable: Table {
    override fun putOn() {
        println("ModernTable::putOn()")
    }
}


class ClassicTable: Table {
    override fun putOn() {
        println("ClassicTable::putOn()")
    }
}
