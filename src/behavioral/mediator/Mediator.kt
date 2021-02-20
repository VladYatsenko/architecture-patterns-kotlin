package behavioral.mediator

import behavioral.mediator.chat.SimpleChat
import behavioral.mediator.user.Admin
import behavioral.mediator.user.SimpleUser

/*
* Инкапсуляция способа взаимодействия множества объектов
* */
fun main(){

    val chat = SimpleChat()

    val admin = Admin(chat, "admin")
    val user1 = SimpleUser(chat, "user1")
    val user2 = SimpleUser(chat, "user2")

    chat.setAdmin(admin)
    chat.addUser(user1)
    chat.addUser(user2)

    user1.sendMessage("Hello, Im user 1")
}