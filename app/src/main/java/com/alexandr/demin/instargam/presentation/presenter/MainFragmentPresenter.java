package com.alexandr.demin.instargam.presentation.presenter;


import com.alexandr.demin.instargam.presentation.view.MainFragmentView;
import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class MainFragmentPresenter extends MvpPresenter<MainFragmentView> {

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        onBottomAllClicked();
    }

    public void onBottomAllClicked() {
        getViewState().replaceAllPhotoFragment();
    }

    public void onBottomDatabaseClicked() {
        getViewState().replaceDatabasePhotoFragment();
    }

    public void onBottomInternetClicked() {
        getViewState().replaceInternetPhotoFragment();
    }
}
