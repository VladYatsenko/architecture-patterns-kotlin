package creational.abstract_factory.chair

class VictorianChair : Chair {
    override fun sitOn() {
        println("VictorianChair::sitOn()")
    }
}

class ModernChair : Chair {
    override fun sitOn() {
        println("ModernChair::sitOn()")
    }
}

class ClassicChair : Chair {
    override fun sitOn() {
        println("ClassicChair::sitOn()")
    }
}