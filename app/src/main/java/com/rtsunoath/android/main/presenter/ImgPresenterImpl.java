package com.rtsunoath.android.main.presenter;

import com.rtsunoath.android.main.bean.ClassifyBean;
import com.rtsunoath.android.main.modle.ImgClassitfyModelImpl;
import com.rtsunoath.android.main.modle.ImgClassitfyModel;
import com.rtsunoath.android.main.view.ImgView;

import java.util.List;

/**
 * Created by tengshuai on 2016/2/24.
 */
public class ImgPresenterImpl implements ImgPresenter, ImgClassitfyModelImpl.OnloadImgListener {

    ImgView mImgView;
    ImgClassitfyModel mImgClassitfyModel;

    public ImgPresenterImpl(ImgView imgView) {
        this.mImgView = imgView;
        this.mImgClassitfyModel = new ImgClassitfyModelImpl();
    }

    @Override
    public void loadList(int id) {
        mImgView.showProgress();
        mImgClassitfyModel.loadSuccess(this, id);
    }

    @Override
    public void success(List<ClassifyBean> list) {
        mImgView.hideProgress();
        mImgView.loadImgDatas(list);
    }
}
