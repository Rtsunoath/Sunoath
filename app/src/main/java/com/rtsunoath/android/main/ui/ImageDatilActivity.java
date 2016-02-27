package com.rtsunoath.android.main.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.rtsunoath.android.R;
import com.rtsunoath.android.main.adapter.ImgDetailAdapter;
import com.rtsunoath.android.main.bean.ShowBean;
import com.rtsunoath.android.main.modle.ImgDetilModelImpl;
import com.rtsunoath.android.main.presenter.ImgDatilPresenter;
import com.rtsunoath.android.main.presenter.ImgDatilPresenterImpl;
import com.rtsunoath.android.main.view.ImgDatiView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by tengshuai on 2016/2/25.
 */
public class ImageDatilActivity extends AppCompatActivity implements ImgDatiView, SwipeRefreshLayout.OnRefreshListener {
    @Bind(R.id.tv_title)
    TextView tv_title;
    @Bind(R.id.recly_view)
    RecyclerView mRecyclerView;
    @Bind(R.id.swipe_layout)
    SwipeRefreshLayout mSwipeRefreshLayout;


    ImgDatilPresenter mPresenter;
    ImgDetailAdapter mAdapter;
    LinearLayoutManager mLinearLayoutManager;
    long id;
    String title;

    List<ShowBean> mList;

    @OnClick(R.id.iv_back)
    void setBack() {
        finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imgdetail_layout);
        ButterKnife.bind(this);

        mPresenter = new ImgDatilPresenterImpl(this);

        initDatas();

        mSwipeRefreshLayout.setOnRefreshListener(this);
        onRefresh();

        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        mAdapter = new ImgDetailAdapter(this);
        mRecyclerView.setAdapter(mAdapter);


    }

    private void initDatas() {
        Intent intent = getIntent();
        id = intent.getExtras().getLong("id");
        title = intent.getExtras().getString("title");
        tv_title.setText(title);
    }

    @Override
    public void loadData(List<ShowBean> list) {
        if (mList == null) {
            mList = new ArrayList<>();
        }
        Log.i("RT", list.size() + "");
        mList.addAll(list);
        mAdapter.setData(list);

    }

    @Override
    public void hideProgress() {
        mSwipeRefreshLayout.setRefreshing(false);
    }


    @Override
    public void onRefresh() {
        if (mList != null) {
            mList.clear();
        }
        mPresenter.loadList(id);
    }
}
