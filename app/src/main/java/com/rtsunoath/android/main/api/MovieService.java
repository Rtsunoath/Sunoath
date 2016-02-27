package com.rtsunoath.android.main.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by tengshuai on 2016/2/20.
 */
public class MovieService {
    public static final String BASE_URL = "http://v.juhe.cn/boxoffice/";

    private MovieService() {
    }

    private static Retrofit mRetrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static MovieApi creatMovieService() {
        return mRetrofit.create(MovieApi.class);
    }


}
