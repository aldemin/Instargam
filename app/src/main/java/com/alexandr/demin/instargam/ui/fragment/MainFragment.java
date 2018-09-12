package com.alexandr.demin.instargam.ui.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.alexandr.demin.instargam.Constants;
import com.alexandr.demin.instargam.R;
import com.alexandr.demin.instargam.presentation.presenter.MainFragmentPresenter;
import com.alexandr.demin.instargam.presentation.view.MainFragmentView;
import com.arellomobile.mvp.MvpAppCompatFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainFragment extends MvpAppCompatFragment
        implements MainFragmentView, BottomNavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.main_fragment_bottom_view)
    BottomNavigationView bottomNavigationView;

    @InjectPresenter
    MainFragmentPresenter presenter;

    public static MainFragment newInstance(String tag) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(Constants.FRAGMENT_TAG, tag);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);
        initViews();
        return view;
    }

    @Override
    public void replaceAllPhotoFragment() {
        getChildFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment_container, AllPhotoFragment.newInstance(Constants.ALL_PHOTO_FRAGMENT))
                .commit();
    }

    @Override
    public void replaceDatabasePhotoFragment() {
        getChildFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment_container, DatabasePhotoFragment.newInstance(Constants.DATABASE_PHOTO_FRAGMENT))
                .commit();
    }

    @Override
    public void replaceInternetPhotoFragment() {
        getChildFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment_container, InternetPhotoFragment.newInstance(Constants.INTERNET_PHOTO_FRAGMENT))
                .commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.main_fragment_bottom_menu_all:
                presenter.onBottomAllClicked();
                break;
            case R.id.main_fragment_bottom_menu_database:
                presenter.onBottomDatabaseClicked();
                break;
            case R.id.main_fragment_bottom_menu_internet:
                presenter.onBottomInternetClicked();
                break;
        }
        return true;
    }

    private void initViews() {
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }
}
