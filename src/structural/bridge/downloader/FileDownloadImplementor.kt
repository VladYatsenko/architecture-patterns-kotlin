package structural.bridge.downloader

interface FileDownloadImplementor {

    fun downloadFile(path: String): Any

    fun storeFile(any: Any): Boolean

}