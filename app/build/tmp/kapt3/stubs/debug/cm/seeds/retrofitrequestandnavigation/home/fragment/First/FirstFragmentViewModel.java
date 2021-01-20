package cm.seeds.retrofitrequestandnavigation.home.fragment.First;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006R.\u0010\u0003\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcm/seeds/retrofitrequestandnavigation/home/fragment/First/FirstFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "imagesLiveData", "Landroidx/lifecycle/LiveData;", "Lcm/seeds/retrofitrequestandnavigation/retrofit/RequestResult;", "", "Lcm/seeds/retrofitrequestandnavigation/home/Image;", "getImagesLiveData", "()Landroidx/lifecycle/LiveData;", "setImagesLiveData", "(Landroidx/lifecycle/LiveData;)V", "saveImage", "", "data", "app_debug"})
public final class FirstFragmentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<cm.seeds.retrofitrequestandnavigation.retrofit.RequestResult<java.util.List<cm.seeds.retrofitrequestandnavigation.home.Image>>> imagesLiveData;
    
    public final void saveImage(@org.jetbrains.annotations.Nullable()
    java.util.List<cm.seeds.retrofitrequestandnavigation.home.Image> data) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<cm.seeds.retrofitrequestandnavigation.retrofit.RequestResult<java.util.List<cm.seeds.retrofitrequestandnavigation.home.Image>>> getImagesLiveData() {
        return null;
    }
    
    public final void setImagesLiveData(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<cm.seeds.retrofitrequestandnavigation.retrofit.RequestResult<java.util.List<cm.seeds.retrofitrequestandnavigation.home.Image>>> p0) {
    }
    
    public FirstFragmentViewModel() {
        super();
    }
}