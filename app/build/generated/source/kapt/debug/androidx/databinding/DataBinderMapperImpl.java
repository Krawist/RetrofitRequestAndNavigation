package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new cm.seeds.retrofitrequestandnavigation.DataBinderMapperImpl());
  }
}
