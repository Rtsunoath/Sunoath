package com.rtsunoath.android.main.ui;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.rtsunoath.android.R;
import com.rtsunoath.android.main.fragment.AboutFragment;
import com.rtsunoath.android.main.fragment.MovieFramgment;
import com.rtsunoath.android.main.fragment.PicFragment;
import com.rtsunoath.android.main.presenter.MainPresentImp;
import com.rtsunoath.android.main.presenter.MainPresenter;
import com.rtsunoath.android.main.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView {


    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private Toolbar mToolbar;
    private NavigationView mNavigationView;
    private MainPresenter mMainPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mMainPresenter = new MainPresentImp(this);


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.open, R.string.close);
        mToggle.syncState();

        mDrawerLayout.setDrawerListener(mToggle);
        mNavigationView = (NavigationView) findViewById(R.id.navigation_view);

        setupDrawerContent(mNavigationView);
        switchPicture();
    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                mMainPresenter.switchNavigation(item.getItemId());
                item.setChecked(true);
                mDrawerLayout.closeDrawers();
                return true;
            }
        });
    }


    @Override
    public void switchMoive() {

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new MovieFramgment()).commit();
        mToolbar.setTitle(R.string.movie);

    }

    @Override
    public void switchPicture() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new PicFragment()).commit();
        mToolbar.setTitle(R.string.picture);

    }

    @Override
    public void switchAbout() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new AboutFragment()).commit();
        mToolbar.setTitle(R.string.about);

    }
}
