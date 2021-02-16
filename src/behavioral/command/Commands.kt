package behavioral.command

class InsertCommand constructor(private val db: Database) : ICommand {

    override fun execute() {
        db.insert()
    }

}

class UpdateCommand constructor(private val db: Database) : ICommand {
    override fun execute() {
        db.update()
    }

}

class SelectCommand constructor(private val db: Database) : ICommand {
    override fun execute() {
        db.select()
    }

}

class DeleteCommand constructor(private val db: Database) : ICommand {
    override fun execute() {
        db.delete()
    }

}