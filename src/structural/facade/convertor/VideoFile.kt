package structural.facade.convertor

class VideoFile(name: String) {

    private var name: String? = name
    private var codecType: String? = null

    init {
        codecType = name.substring(name.indexOf(".") + 1)
    }

    fun getCodecType(): String? {
        return codecType
    }

    fun getName(): String? {
        return name
    }

}