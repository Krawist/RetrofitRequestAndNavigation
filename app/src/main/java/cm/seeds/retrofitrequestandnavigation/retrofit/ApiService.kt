package cm.seeds.retrofitrequestandnavigation.retrofit

import cm.seeds.retrofitrequestandnavigation.home.Image
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

const val API_KEY = "tJg6Eqf4bXcHh574Yz09jXBi1a2bMxdyjyJ1j_PDyow"
const val BASE_URL = "https://api.unsplash.com/"

interface ApiService {

    @GET("photos")
    suspend fun getPhotos(
        @Query("client_id") clientId: String = API_KEY
    ) : List<Image>

}