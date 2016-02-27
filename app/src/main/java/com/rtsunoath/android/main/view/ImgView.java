package com.rtsunoath.android.main.view;

import com.rtsunoath.android.main.bean.ClassifyBean;

import java.util.List;

/**
 * Created by tengshuai on 2016/2/24.
 */
public interface ImgView {
    void loadImgDatas(List<ClassifyBean> mlist);

    void showProgress();

    void hideProgress();
}
