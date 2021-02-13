package structural.facade.convertor.codec

import structural.facade.convertor.VideoFile

class CodecFactory {

    fun extract(file: VideoFile): Codec {
        val type = file.getCodecType()
        return if (type == "mp4") {
            println("CodecFactory: extracting mpeg audio...")
            MPEG4CompressionCodec()
        } else {
            println("CodecFactory: extracting ogg audio...")
            OggCompressionCodec()
        }
    }

}