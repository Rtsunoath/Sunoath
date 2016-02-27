package com.rtsunoath.android.main.adapter;

import android.content.Context;
import android.graphics.Movie;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rtsunoath.android.R;
import com.rtsunoath.android.main.bean.MovieBean;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by tengshuai on 2016/2/19.
 */
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieHolder> {

    MovieOnItemClickListener mListener;
    MovieBean mBean;
    List<MovieBean> mList;
    Context mContext;

    public MovieAdapter(Context context) {
        this.mContext = context;
    }

    public void setOnclickListener(MovieOnItemClickListener onItemClickListener) {
        this.mListener = onItemClickListener;
    }


    public void setDatas(List<MovieBean> list) {
        this.mList = list;
        this.notifyDataSetChanged();
    }


    @Override
    public MovieHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_movie, null);
        return new MovieHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieHolder holder, final int position) {

        mBean = mList.get(position);
        holder.tv_movie.setText(mBean.getResult().get(position).getName());
        holder.tv_rank.setText(mBean.getResult().get(position).getRid());
        holder.tv_wk.setText(mBean.getResult().get(position).getWk());
        holder.tv_tbox.setText(mBean.getResult().get(position).getTboxoffice());
        holder.tv_wBox.setText(mBean.getResult().get(position).getWboxoffice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null) {
                    mListener.setOnItemClick(v, mBean, position);
                }

            }
        });


    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }


    class MovieHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.card_view)
        CardView mCardView;
        @Bind(R.id.tv_movie)
        TextView tv_movie;
        @Bind(R.id.tv_Rank)
        TextView tv_rank;
        @Bind(R.id.tv_wk)
        TextView tv_wk;
        @Bind(R.id.tv_wbox)
        TextView tv_wBox;
        @Bind(R.id.tv_tbox)
        TextView tv_tbox;


        public MovieHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }

    public interface MovieOnItemClickListener {
        void setOnItemClick(View view, MovieBean movieBean, int pos);

    }

}




