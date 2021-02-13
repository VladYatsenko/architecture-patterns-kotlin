package creational.abstract_factory.sofa

class VictorianSofa : Sofa {
    override fun lieOn() {
        println("VictorianSofa::lieOn()")
    }
}

class ModernSofa: Sofa {
    override fun lieOn() {
        println("ModernSofa::lieOn()")
    }
}

class ClassicSofa: Sofa {
    override fun lieOn() {
        println("ClassicSofa::lieOn()")
    }
}