package com.rtsunoath.android.main.presenter;

import com.rtsunoath.android.main.bean.ShowBean;
import com.rtsunoath.android.main.modle.ImgDetilModel;
import com.rtsunoath.android.main.modle.ImgDetilModelImpl;
import com.rtsunoath.android.main.view.ImgDatiView;

import java.util.List;

/**
 * Created by tengshuai on 2016/2/26.
 */
public class ImgDatilPresenterImpl implements ImgDatilPresenter, ImgDetilModelImpl.onLoadLisenter {

    ImgDatiView mImgDatiView;
    ImgDetilModel mImgDetilModel;


    public ImgDatilPresenterImpl(ImgDatiView imgDatiView) {
        this.mImgDatiView = imgDatiView;
        this.mImgDetilModel = new ImgDetilModelImpl();

    }

    @Override
    public void loadList(long id) {
        mImgDetilModel.success(id, this);
    }

    @Override
    public void onSuccess(List<ShowBean> list) {
        mImgDatiView.hideProgress();
        mImgDatiView.loadData(list);
    }

    @Override
    public void onFail(String msg) {

    }
}
