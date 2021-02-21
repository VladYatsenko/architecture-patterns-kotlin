package behavioral.state

class Coding: Activity {
    override fun justDoIt() {
        println("Writing code")
    }
}

class Reading: Activity {
    override fun justDoIt() {
        println("Reading code")
    }
}

class Sleeping: Activity {
    override fun justDoIt() {
        println("Sleeping")
    }
}

class Training: Activity {
    override fun justDoIt() {
        println("Training")
    }
}