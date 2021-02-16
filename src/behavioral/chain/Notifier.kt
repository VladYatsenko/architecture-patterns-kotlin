package behavioral.chain

abstract class Notifier constructor(private var priority: Int) {

    private var nextNotifier: Notifier? = null

    fun setNextNotifier(nextNotifier: Notifier){
        this.nextNotifier = nextNotifier
    }

    fun notifyManager(message: String, level: Int){
        if (level >= priority){
            write(message)
        }
        nextNotifier?.notifyManager(message, level)
    }

    abstract fun write(message: String)
}