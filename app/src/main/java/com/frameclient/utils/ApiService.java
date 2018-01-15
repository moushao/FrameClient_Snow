package com.frameclient.utils;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PartMap;
import rx.Observable;

/**
 * Created by Administrator on 2017/12/28.
 */

public interface ApiService {


    @POST("push_alarm")
    Observable<ResultBean> pushAlarm(
            @Body RequestBody jsonStr
    );
//    @POST("getnews")
//    Observable<String> pushAlarm(
//            @Body RequestBody jsonStr
//    );
}
