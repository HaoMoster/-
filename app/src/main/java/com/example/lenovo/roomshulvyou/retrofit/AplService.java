package com.example.lenovo.roomshulvyou.retrofit;

import okhttp3.RequestBody;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by lenovo on 2018/1/30.
 */

public interface AplService {
    @GET("")
    Observable<RequestBody> getIn();
}
