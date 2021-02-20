package behavioral.mediator.chat

import behavioral.mediator.user.User

interface Chat {
    fun sendMessage(message: String, user: User)
}