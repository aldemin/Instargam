package com.alexandr.demin.instargam.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alexandr.demin.instargam.Constants;
import com.alexandr.demin.instargam.R;
import com.arellomobile.mvp.MvpAppCompatFragment;

public class InternetPhotoFragment extends MvpAppCompatFragment {

    public static InternetPhotoFragment newInstance(String tag) {
        InternetPhotoFragment fragment = new InternetPhotoFragment();
        Bundle args = new Bundle();
        args.putString(Constants.FRAGMENT_TAG, tag);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_internet_photo, container, false);
    }

}
