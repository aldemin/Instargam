package com.alexandr.demin.instargam.presentation.view;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

@StateStrategyType(AddToEndSingleStrategy.class)
public interface MainFragmentView extends MvpView {

    void replaceAllPhotoFragment();

    void replaceDatabasePhotoFragment();

    void replaceInternetPhotoFragment();

}
