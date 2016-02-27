package com.rtsunoath.android.main.modle;

/**
 * Created by tengshuai on 2016/2/24.
 */
public interface ImgClassitfyModel {

    //借口需要传递id
    void loadSuccess(ImgClassitfyModelImpl.OnloadImgListener onloadImgListener, int id);

}
