package cm.seeds.retrofitrequestandnavigation.home.fragment.First

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import cm.seeds.retrofitrequestandnavigation.home.Image
import cm.seeds.retrofitrequestandnavigation.retrofit.RequestResult
import cm.seeds.retrofitrequestandnavigation.retrofit.RetrofitApiAccess
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import java.lang.Exception

class FirstFragmentViewModel : ViewModel(){
    fun saveImage(data: List<Image>?) {

    }

    var imagesLiveData : LiveData<RequestResult<List<Image>>>? = null

    init {
        val apiService = RetrofitApiAccess.getApiService()
        imagesLiveData = liveData {
            emit(RequestResult.loading(null))
            try {
                emit(RequestResult.success(apiService.getPhotos()))
            }catch (exception : Exception){
                emit(RequestResult.error("Erreur de chargement", null))
            }
        }
    }

}