package com.rtsunoath.android.main.modle;

import com.rtsunoath.android.main.api.PicService;
import com.rtsunoath.android.main.bean.ShowBean;
import com.rtsunoath.android.main.presenter.ImgDatilPresenterImpl;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by tengshuai on 2016/2/26.
 */
public class ImgDetilModelImpl implements ImgDetilModel {


    @Override
    public void success(long id, final onLoadLisenter onLoadLisenter) {

        PicService.PicApi api = PicService.creatPicApi();
        Call<ShowBean> call = api.getPicShow(id);
        call.enqueue(new Callback<ShowBean>() {
            @Override
            public void onResponse(Call<ShowBean> call, Response<ShowBean> response) {
                List<ShowBean> list = new ArrayList<>();
                for (int i = 0; i < response.body().getList().size(); i++) {
                    ShowBean showBean = response.body();
                    list.add(showBean);
                }
                onLoadLisenter.onSuccess(list);


            }

            @Override
            public void onFailure(Call<ShowBean> call, Throwable t) {

                onLoadLisenter.onFail(t.getMessage());
            }
        });


    }

    public interface onLoadLisenter {

        void onSuccess(List<ShowBean> list);

        void onFail(String msg);

    }
}
