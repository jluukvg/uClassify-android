package com.jluukvg.uclassify.ui.main;

import com.jluukvg.uclassify.data.DataManager;
import com.jluukvg.uclassify.ui.base.BasePresenter;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by jluukvg on 8/2/17.
 *
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    @Inject
    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void onSubmitButtonClick() {
        getMvpView().showLoading();
        String myString = getMvpView().getText();
        Log.d("myString", myString);
        // Do the network call and wait for an answer, then do next line
        getMvpView().openResultsActivity();
    }
}
