package com.alexandr.demin.instargam.presentation.presenter;

import com.alexandr.demin.instargam.presentation.view.MainView;
import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().addMainFragment();
    }
}
