package behavioral.command

fun main(){

    val db = Database()

    val developer = Developer(InsertCommand(db), UpdateCommand(db), SelectCommand(db), DeleteCommand(db))

    developer.run {
        insertRecord()
        updateRecord()
        selectRecord()
        deleteRecord()
    }

}