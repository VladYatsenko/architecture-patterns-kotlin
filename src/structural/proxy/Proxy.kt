package structural.proxy

import structural.proxy.proxy.YouTubeCacheProxy
import structural.proxy.service.ThirdPartyYouTubeClass

/*
* https://refactoring.guru/uk/design-patterns/proxy
* */
fun main(){

    val naiveDownloader = YouTubeDownloader(ThirdPartyYouTubeClass())
    val smartDownloader = YouTubeDownloader(YouTubeCacheProxy())

    val naive: Long = test(naiveDownloader)
    val smart: Long = test(smartDownloader)
    print("Time saved by caching proxy: " + (naive - smart) + "ms")

}

private fun test(downloader: YouTubeDownloader): Long {
    val startTime = System.currentTimeMillis()

    // User behavior in our app:
    downloader.renderPopularVideos()
    downloader.renderVideoPage("catzzzzzzzzz")
    downloader.renderPopularVideos()
    downloader.renderVideoPage("dancesvideoo")
    // Users might visit the same page quite often.
    downloader.renderVideoPage("catzzzzzzzzz")
    downloader.renderVideoPage("someothervid")
    val estimatedTime = System.currentTimeMillis() - startTime
    print("Time elapsed: ${estimatedTime}ms".trimIndent())
    return estimatedTime
}