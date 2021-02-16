package behavioral.chain

class SimpleReportNotifier constructor(priority: Int): Notifier(priority){

    override fun write(message: String) {
        println("Notifying using ${this.javaClass.simpleName} $message")
    }

}

class EmailNotifier constructor(priority: Int): Notifier(priority){

    override fun write(message: String) {
        println("Sending email: $message")
    }

}

class SmsNotifier constructor(priority: Int): Notifier(priority){

    override fun write(message: String) {
        println("Sending SMS: $message")
    }

}