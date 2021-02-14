package structural.bridge

import structural.bridge.downloader.FileDownloaderAbstraction
import structural.bridge.downloader.FileDownloaderAbstractionImpl
import structural.bridge.downloader.LinuxFileDownloadImplementor
import structural.bridge.downloader.WindowsFileDownloadImplementor

/*
* before: Shape -> Rectangle (BlueRectangle & RedRectangle) & Circle (BlueCircle & RedCircle)
* after: Shape -> Rectangle(Color) & Circle(Color), Color -> Blue & Red
*
* https://howtodoinjava.com/design-patterns/structural/bridge-design-pattern/
* */

fun main(){

    val os = "linux"

    var downloader: FileDownloaderAbstraction? = null

    when(os){
        "linux" -> downloader = FileDownloaderAbstractionImpl(LinuxFileDownloadImplementor())
        "windows" -> downloader = FileDownloaderAbstractionImpl(WindowsFileDownloadImplementor())
        else -> println("Unsupported OS")
    }

    val file = downloader?.download("path") ?: return
    downloader.store(file)

}