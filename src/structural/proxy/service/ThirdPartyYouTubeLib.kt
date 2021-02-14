package structural.proxy.service

import java.util.*


interface ThirdPartyYouTubeLib {
    fun popularVideos(): HashMap<String, Video>

    fun getVideo(videoId: String): Video
}