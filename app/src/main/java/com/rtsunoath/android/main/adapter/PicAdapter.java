package com.rtsunoath.android.main.adapter;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rtsunoath.android.R;
import com.rtsunoath.android.main.bean.ClassifyBean;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by tengshuai on 2016/2/23.
 */
public class PicAdapter extends RecyclerView.Adapter<PicAdapter.PicViewHolder> {
    //用于凭借api返回的img；封面照片
    private String URL_Base = "http://tnfs.tngou.net/image";

    ClassifyBean mClassifyBean;
    List<ClassifyBean> mList;
    Context mContext;
    PicOnItemClickListener mListener;

    public PicAdapter(Context context) {
        this.mContext = context;
    }

    public void setOnitemClickLisenter(PicOnItemClickListener picOnItemClickListener) {
        this.mListener = picOnItemClickListener;

    }


    //刷新时获取数据
    public void setDatas(List<ClassifyBean> list) {
        this.mList = list;
        this.notifyDataSetChanged();
    }


    @Override
    public PicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_pic_classitfy, null);
        return new PicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PicViewHolder holder, final int position) {
        mClassifyBean = mList.get(position);
        Uri uri = Uri.parse(URL_Base + mClassifyBean.getTngou().get(position).getImg());
        Glide.with(mContext).load(uri).into(holder.mView);
        //图片封面

        //图片张数
        holder.tv_picClassIftyNum.setText(mClassifyBean.getTngou().get(position).getSize() + "张");

        //item点击事件
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null) {
                    mListener.picOnItemClickListener(v, position, mClassifyBean);
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }


    static class PicViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.sv_picClassitfy)
        ImageView mView;
        @Bind(R.id.tv_picClassiftyNum)
        TextView tv_picClassIftyNum;

        public PicViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }


    }

    public interface PicOnItemClickListener {
        void picOnItemClickListener(View view, int pos, ClassifyBean bean);
    }
}


