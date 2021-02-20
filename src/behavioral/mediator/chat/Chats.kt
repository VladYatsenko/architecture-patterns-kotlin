package behavioral.mediator.chat

import behavioral.mediator.user.User

class SimpleChat constructor() : Chat {

    private var admin: User? = null
    private val users: ArrayList<User> = ArrayList()

    fun setAdmin(admin: User){
        this.admin = admin
    }

    fun addUser(user: User) {
        users.add(user)
    }

    override fun sendMessage(message: String, user: User) {
        users.forEach {
            if (it != user) {
                it.getMessage(message)
            }
        }
        admin?.getMessage(message)
    }

}