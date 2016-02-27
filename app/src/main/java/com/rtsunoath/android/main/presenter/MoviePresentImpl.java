package com.rtsunoath.android.main.presenter;

import com.rtsunoath.android.main.bean.MovieBean;
import com.rtsunoath.android.main.modle.MovieModel;
import com.rtsunoath.android.main.modle.MovieModelImpl;
import com.rtsunoath.android.main.view.MovieView;

import java.util.List;

/**
 * Created by tengshuai on 2016/2/18.
 */
public class MoviePresentImpl implements MoviePresenter, MovieModelImpl.OnLoadMovieListListener {
    MovieView mMovieView;
    MovieModel mMovieModel;

    public MoviePresentImpl(MovieView movieView) {
        this.mMovieView = movieView;
        this.mMovieModel = new MovieModelImpl();

    }

    @Override
    public void loadList() {
        mMovieView.showProgress();
        mMovieModel.loadMovieList(this);
    }

    @Override
    public void onSuccess(List<MovieBean> movieBeanList) {
        mMovieView.addDatas(movieBeanList);
        mMovieView.hideProgress();


    }

    @Override
    public void onFailure(String msg) {

        mMovieView.hideProgress();
        mMovieView.showLoadMsg();

    }
}
