package com.rtsunoath.android.main.api;

import com.rtsunoath.android.main.bean.ClassifyBean;
import com.rtsunoath.android.main.bean.ShowBean;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by tengshuai on 2016/2/22.
 */
public class PicService {

    public static final String PIC_BASE_URL = "http://www.tngou.net/";


    private PicService() {
    }

    public static Retrofit mRetrofit = new Retrofit.Builder()
            .baseUrl(PIC_BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

    public static PicApi creatPicApi() {

        return mRetrofit.create(PicApi.class);
    }

    //TODO URL
    public interface PicApi {
        //各大分类列表 ps：七类
        @GET("tnfs/api/list")
        Call<ClassifyBean> getPicClassify(@Query("id") int id);

        //分类中图片详细内容列表
        @GET("tnfs/api/show")
        Call<ShowBean> getPicShow(@Query("id") long id);

    }


}

