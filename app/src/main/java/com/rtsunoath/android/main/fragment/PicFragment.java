package com.rtsunoath.android.main.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rtsunoath.android.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by tengshuai on 2016/2/22.
 */
public class PicFragment extends Fragment
{
    @Bind(R.id.viewPager_content)
    ViewPager mViewPager;
    @Bind(R.id.tabLayout)
    TabLayout mTableLayout;
    private String[] title = new String[]{ "性感美女", "日韩美女", "丝袜美腿", "美女照片", "美女写真", "清纯美女", "性感车模" };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.pic_layout, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        //setting
        mViewPager.setAdapter(new FragmentPagerAdapter(getFragmentManager())
        {
            @Override
            public Fragment getItem(int position)
            {
                return PicFragmentContent.newInstance(position);
            }

            @Override
            public int getCount()
            {
                return title.length;
            }

            @Override
            public CharSequence getPageTitle(int position)
            {
                return title[position];
            }
        });


        //关联
        mTableLayout.setupWithViewPager(mViewPager);


    }
}
