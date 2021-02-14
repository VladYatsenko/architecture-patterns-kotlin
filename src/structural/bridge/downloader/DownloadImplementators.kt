package structural.bridge.downloader

class LinuxFileDownloadImplementor : FileDownloadImplementor {
    override fun downloadFile(path: String): Any {
        return Any()
    }

    override fun storeFile(any: Any): Boolean {
        println("File downloaded successfully in LINUX !!")
        return true
    }
}

class WindowsFileDownloadImplementor : FileDownloadImplementor {
    override fun downloadFile(path: String): Any {
        return Any()
    }

    override fun storeFile(any: Any): Boolean {
        println("File downloaded successfully in WINDOWS !!")
        return true
    }
}