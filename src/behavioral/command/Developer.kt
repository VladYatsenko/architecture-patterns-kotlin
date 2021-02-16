package behavioral.command

class Developer constructor(
    private val insertCommand: InsertCommand,
    private val updateCommand: UpdateCommand,
    private val selectCommand: SelectCommand,
    private val deleteCommand: DeleteCommand
) {

    fun insertRecord(){
        insertCommand.execute()
    }

    fun updateRecord(){
        updateCommand.execute()
    }

    fun selectRecord(){
        selectCommand.execute()
    }

    fun deleteRecord(){
        deleteCommand.execute()
    }

}