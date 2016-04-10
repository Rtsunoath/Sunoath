package com.rtsunoath.android.main.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rtsunoath.android.R;
import com.rtsunoath.android.main.adapter.PicAdapter;
import com.rtsunoath.android.main.bean.ClassifyBean;
import com.rtsunoath.android.main.presenter.ImgPresenter;
import com.rtsunoath.android.main.presenter.ImgPresenterImpl;
import com.rtsunoath.android.main.ui.ImageDatilActivity;
import com.rtsunoath.android.main.view.ImgView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PicFragmentContent extends Fragment
        implements SwipeRefreshLayout.OnRefreshListener, ImgView
{
    private static final String CLASSITFY_ID = "ClassItfy_Id";
    ImgPresenter mPresenter;
    @Bind(R.id.swipe_layout_pic)
    SwipeRefreshLayout mSwipeRefreshLayout;
    @Bind(R.id.recly_view)
    RecyclerView mRecyclerView;
    StaggeredGridLayoutManager mGridLayoutManager;
    PicAdapter mPicAdapter;
    List<ClassifyBean> mClassifyBeanList;
    private int mClassitfyId = 1;

    public static PicFragmentContent newInstance(int classitfyId)
    {
        PicFragmentContent fragment = new PicFragmentContent();
        Bundle args = new Bundle();
        args.putInt(CLASSITFY_ID, classitfyId);
        fragment.setArguments(args);
        //        Log.e("newInstance", "newInstance: " + classitfyId);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if(getArguments() != null)
        {
            mClassitfyId = getArguments().getInt(CLASSITFY_ID);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.frament_pic, null);
        ButterKnife.bind(this, view);
        mPresenter = new ImgPresenterImpl(this);
        mSwipeRefreshLayout.setRefreshing(true);
        onRefresh();
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        mSwipeRefreshLayout.setOnRefreshListener(this);

        mGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mGridLayoutManager);
        mPicAdapter = new PicAdapter(getActivity());
        mRecyclerView.setAdapter(mPicAdapter);

        mPicAdapter.setOnitemClickLisenter(new PicAdapter.PicOnItemClickListener()
        {
            @Override
            public void picOnItemClickListener(View view, int pos, ClassifyBean bean)
            {
                Intent intent = new Intent(getActivity(), ImageDatilActivity.class);

                long id = bean.getTngou().get(pos).getId();
                String title = bean.getTngou().get(pos).getTitle();

                intent.putExtra("id", id);
                intent.putExtra("title", title);
                startActivity(intent);

            }
        });

    }

    @Override
    public void loadImgDatas(List<ClassifyBean> mlist)
    {
        if(mClassifyBeanList == null)
        {
            mClassifyBeanList = new ArrayList<>();
        }
        mClassifyBeanList.clear();
        mClassifyBeanList.addAll(mlist);
        mPicAdapter.setDatas(mClassifyBeanList);
    }

    @Override
    public void showProgress()
    {
        mSwipeRefreshLayout.setRefreshing(true);
    }

    @Override
    public void hideProgress()
    {
        mSwipeRefreshLayout.setRefreshing(false);
    }

    @Override
    public void onRefresh()
    {
        mPresenter.loadList(mClassitfyId);
    }
}
