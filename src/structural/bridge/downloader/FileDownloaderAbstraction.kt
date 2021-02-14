package structural.bridge.downloader

interface FileDownloaderAbstraction {

    fun download(path: String): Any

    fun store(any: Any): Boolean


}