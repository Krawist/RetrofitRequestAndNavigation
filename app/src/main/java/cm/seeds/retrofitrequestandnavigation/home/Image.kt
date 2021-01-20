package cm.seeds.retrofitrequestandnavigation.home

data class Image(
    val imageId :String,
    val urls : ImageUrl
){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Image

        if (imageId != other.imageId) return false
        if (urls != other.urls) return false

        return true
    }

    override fun hashCode(): Int {
        var result = imageId.hashCode()
        result = 31 * result + urls.hashCode()
        return result
    }
}
