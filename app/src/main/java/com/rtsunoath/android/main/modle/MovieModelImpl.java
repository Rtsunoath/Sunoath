package com.rtsunoath.android.main.modle;

import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rtsunoath.android.main.api.MovieApi;
import com.rtsunoath.android.main.api.MovieService;
import com.rtsunoath.android.main.bean.MovieBean;
import com.rtsunoath.android.main.contant.Url;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by tengshuai on 2016/2/18.
 */
public class MovieModelImpl implements MovieModel {


    @Override
    public void loadMovieList(final OnLoadMovieListListener listener) {

        //TODO
        MovieApi movieApi = MovieService.creatMovieService();
        Call<MovieBean> call = movieApi.callbackTomovie();
        call.enqueue(new Callback<MovieBean>() {
            @Override
            public void onResponse(Call<MovieBean> call, Response<MovieBean> response) {


                List<MovieBean> list = new ArrayList<MovieBean>();

                for (int i = 0; i < response.body().getResult().size(); i++) {
                    MovieBean movieBean = response.body();
                    list.add(movieBean);
                }

                listener.onSuccess(list);


            }

            @Override
            public void onFailure(Call<MovieBean> call, Throwable t) {
                listener.onFailure(t.getMessage());
            }
        });


    }

    public interface OnLoadMovieListListener {
        void onSuccess(List<MovieBean> movieBeanList);

        void onFailure(String msg);
    }


}
