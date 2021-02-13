package structural.adapter

fun main(){

    var usb: Usb

    usb = UsbMemory()
    usb.connectWithUsbInterface()

    usb = MemoryCardAdapter(MemoryCard())
    usb.connectWithUsbInterface()

}