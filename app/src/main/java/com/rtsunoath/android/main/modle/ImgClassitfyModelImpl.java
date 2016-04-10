package com.rtsunoath.android.main.modle;

import com.rtsunoath.android.main.api.PicService;
import com.rtsunoath.android.main.bean.ClassifyBean;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by tengshuai on 2016/2/24.
 */
public class ImgClassitfyModelImpl implements ImgClassitfyModel
{


    @Override
    public void loadSuccess(final OnloadImgListener onloadImgListener, int id)
    {
        PicService.PicApi picApi = PicService.creatPicApi();
        Call<ClassifyBean> call = picApi.getPicClassify(id);
        call.enqueue(new Callback<ClassifyBean>()
        {
            @Override
            public void onResponse(Call<ClassifyBean> call, Response<ClassifyBean> response)
            {
                List<ClassifyBean.TngouEntity> tngou = new ArrayList<ClassifyBean.TngouEntity>();

                List<ClassifyBean> list = new ArrayList<ClassifyBean>();
                for(int i = 0; i < response.body().getTngou().size(); i++)
                {
                    //                    Log.e("abc", response.body().getTngou().get(i).getTitle());
                    ClassifyBean bean = response.body();
                    list.add(bean);
                }
                //成功拿到数据
                onloadImgListener.success(list);

            }

            @Override
            public void onFailure(Call<ClassifyBean> call, Throwable t)
            {

            }
        });
    }

    public interface OnloadImgListener
    {
        void success(List<ClassifyBean> list);

    }
}


