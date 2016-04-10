package com.rtsunoath.android.main.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rtsunoath.android.R;
import com.rtsunoath.android.main.adapter.MovieAdapter;
import com.rtsunoath.android.main.bean.MovieBean;
import com.rtsunoath.android.main.presenter.MoviePresentImpl;
import com.rtsunoath.android.main.presenter.MoviePresenter;
import com.rtsunoath.android.main.view.MovieView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by tengshuai on 2016/2/18.
 */
public class MovieFramgment extends Fragment implements MovieView, OnRefreshListener {

    @Bind(R.id.recly_view)
    RecyclerView mRecyclerView;
    @Bind(R.id.swipe_layout_movies)
    SwipeRefreshLayout mSwipeRefreshLayout;

    MovieAdapter mMovieAdapter;
    List<MovieBean> mlist;
    MoviePresenter mMoviePresenter;
    LinearLayoutManager mManager;
    private RecyclerView.OnScrollListener mListener = new RecyclerView.OnScrollListener()
    {
        private int lastVisibItem;

        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int newState)
        {
            super.onScrollStateChanged(recyclerView, newState);
            if(newState == RecyclerView.SCROLL_STATE_IDLE && lastVisibItem + 1 == mMovieAdapter
                    .getItemCount())
            {
                //加载更多
                Snackbar.make(getActivity().findViewById(R.id.drawer_layout),
                        getString(R.string.load_more), Snackbar.LENGTH_SHORT).show();
            }
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy)
        {
            super.onScrolled(recyclerView, dx, dy);
            lastVisibItem = mManager.findLastVisibleItemPosition();

        }
    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMoviePresenter = new MoviePresentImpl(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.framgent_movie, null);
        ButterKnife.bind(this, view);
        onRefresh();
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mSwipeRefreshLayout.setColorSchemeColors(R.color.colorPrimary, R.color.colorPrimaryDark, R.color.colorAccent, R.color.colorLight);
        mSwipeRefreshLayout.setOnRefreshListener(this);

        mRecyclerView.setHasFixedSize(true);

        mManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        mMovieAdapter = new MovieAdapter(getActivity());
        mRecyclerView.setAdapter(mMovieAdapter);
        mRecyclerView.addOnScrollListener(mListener);

    }

    @Override
    public void onRefresh() {

        if (mlist != null) {
            mlist.clear();
        }
        mMoviePresenter.loadList();

    }

    @Override
    public void addDatas(List<MovieBean> movieBeanList) {
        if (mlist == null) {
            mlist = new ArrayList<>();
        }
        mlist.addAll(movieBeanList);
        mMovieAdapter.setDatas(mlist);
    }

    @Override
    public void showProgress() {
        mSwipeRefreshLayout.setRefreshing(true);
    }

    @Override
    public void hideProgress() {
        mSwipeRefreshLayout.setRefreshing(false);

    }

    @Override
    public void showLoadMsg() {
        View view = getActivity() == null ? mRecyclerView.getRootView() : getActivity().findViewById(R.id.drawer_layout);
        Snackbar.make(view, getString(R.string.load_fail), Snackbar.LENGTH_SHORT)
                .show();
    }
}
