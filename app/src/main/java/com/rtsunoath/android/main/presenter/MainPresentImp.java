package com.rtsunoath.android.main.presenter;

import com.rtsunoath.android.R;
import com.rtsunoath.android.main.view.MainView;

/**
 * Created by tengshuai on 2016/2/17.
 */
public class MainPresentImp implements MainPresenter {

    private MainView mMainView;

    public MainPresentImp(MainView mainView) {
        this.mMainView = mainView;
    }

    @Override
    public void switchNavigation(int id) {

        switch (id) {
            case R.id.navigation_movie:
                mMainView.switchMoive();
                break;
            case R.id.navigation_picture:
                mMainView.switchPicture();
                break;
            case R.id.navigation_about:
                mMainView.switchAbout();
                break;
            default:
                break;
        }


    }
}
