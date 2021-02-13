package structural.facade

import structural.facade.convertor.AudioMixer
import structural.facade.convertor.BitrateReader
import structural.facade.convertor.VideoFile
import structural.facade.convertor.codec.Codec
import structural.facade.convertor.codec.CodecFactory
import structural.facade.convertor.codec.MPEG4CompressionCodec
import structural.facade.convertor.codec.OggCompressionCodec
import java.io.File


class VideoConversionFacade {

    fun convertVideo(fileName: String, format: String): File? {
        println("VideoConversionFacade: conversion started.")
        val file = VideoFile(fileName)
        val sourceCodec = CodecFactory().extract(file)
        val destinationCodec = if (format == "mp4") OggCompressionCodec() else MPEG4CompressionCodec()
        val buffer: VideoFile = BitrateReader().read(file, sourceCodec)
        val intermediateResult: VideoFile = BitrateReader().convert(buffer, destinationCodec)
        val result = AudioMixer().fix(intermediateResult)
        println("VideoConversionFacade: conversion completed.")
        return result
    }

}