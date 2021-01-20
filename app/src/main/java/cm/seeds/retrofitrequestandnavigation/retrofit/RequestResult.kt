package cm.seeds.retrofitrequestandnavigation.retrofit

data class RequestResult<out T>(val status : Status, val data : T?, val message : String?) {

    companion object{

        fun <T> success(data: T?): RequestResult<T> {
            return RequestResult(Status.SUCCESS, data, null)
        }

        fun <T> error(msg: String, data: T?): RequestResult<T> {
            return RequestResult(Status.ERROR, data, msg)
        }

        fun <T> loading(data: T?): RequestResult<T> {
            return RequestResult(Status.LOADING, data, null)
        }

    }

}