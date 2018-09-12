package com.alexandr.demin.instargam.ui.activity;

import android.os.Bundle;

import com.alexandr.demin.instargam.Constants;
import com.alexandr.demin.instargam.R;
import com.alexandr.demin.instargam.presentation.presenter.MainPresenter;
import com.alexandr.demin.instargam.presentation.view.MainView;
import com.alexandr.demin.instargam.ui.fragment.MainFragment;
import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

public class MainActivity extends MvpAppCompatActivity implements MainView {

    @InjectPresenter
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void addMainFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.main_activity_container, MainFragment.newInstance(Constants.MAIN_FRAGMENT))
                .commit();
    }
}
