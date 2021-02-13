package structural.adapter

class MemoryCardAdapter constructor(val card: MemoryCard): Usb {

    override fun connectWithUsbInterface() {
        card.insert()
    }

}