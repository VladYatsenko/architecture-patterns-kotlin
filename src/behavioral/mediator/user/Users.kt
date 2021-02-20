package behavioral.mediator.user

import behavioral.mediator.chat.Chat

class Admin constructor(val chat: Chat, val name: String): User{

    override fun sendMessage(message: String) {
        chat.sendMessage(message, this)
    }

    override fun getMessage(message: String) {
        println("${this.name} receiving message $message.")
    }
}

class SimpleUser constructor(val chat: Chat, val name: String): User{

    override fun sendMessage(message: String) {
        chat.sendMessage(message, this)
    }

    override fun getMessage(message: String) {
        println("${this.name} receiving message $message.")
    }
}