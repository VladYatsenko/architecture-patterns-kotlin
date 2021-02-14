package structural.bridge.downloader

class FileDownloaderAbstractionImpl constructor(private val provider: FileDownloadImplementor) : FileDownloaderAbstraction {

    override fun download(path: String): Any {
        return provider.downloadFile(path)
    }

    override fun store(any: Any): Boolean {
        return provider.storeFile(any)
    }
}