package com.rtsunoath.android.main.api;

import com.rtsunoath.android.main.bean.MovieBean;
import com.rtsunoath.android.main.contant.Url;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by tengshuai on 2016/2/20.
 */
public interface MovieApi {

    @GET("rank.php?" + "key=" + Url.MOVIE_KEY)
    Call<MovieBean> callbackTomovie();
}
