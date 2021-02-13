package structural.adapter

class MemoryCard {

    fun insert() {
        println("Карта памяти успешно вставлена!")
    }

}

class UsbMemory: Usb {

    override fun connectWithUsbInterface() {
        println("Флешка успешно вставлена!")
    }

}