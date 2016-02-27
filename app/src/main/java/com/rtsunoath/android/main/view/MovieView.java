package com.rtsunoath.android.main.view;

import com.rtsunoath.android.main.bean.MovieBean;

import java.util.List;

/**
 * Created by tengshuai on 2016/2/18.
 */
public interface MovieView {
    void addDatas(List<MovieBean> movieBeanList);

    void showProgress();

    void hideProgress();

    void showLoadMsg();

}
