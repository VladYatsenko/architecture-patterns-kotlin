package behavioral.chain

/*
* Связывание объектов в цепочку и передача запроса по ней
* */
fun main(){

    val reportNotifier = SimpleReportNotifier(Priority.ROUTINE)
    val emailNotifier = EmailNotifier(Priority.IMPORTANT)
    val smsNotifier = SmsNotifier(Priority.ASAP)

    reportNotifier.setNextNotifier(emailNotifier)
    emailNotifier.setNextNotifier(smsNotifier)

    reportNotifier.notifyManager("Everything is OK", Priority.ROUTINE)
    reportNotifier.notifyManager("Something went wrong", Priority.IMPORTANT)
    reportNotifier.notifyManager("We have had a problem here!", Priority.ASAP)


}