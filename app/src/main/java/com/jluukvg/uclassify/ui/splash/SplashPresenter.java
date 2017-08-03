package com.jluukvg.uclassify.ui.splash;

import com.jluukvg.uclassify.data.DataManager;
import com.jluukvg.uclassify.ui.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by jluukvg on 8/2/17.
 *
 */

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {

    @Inject
    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }
}
