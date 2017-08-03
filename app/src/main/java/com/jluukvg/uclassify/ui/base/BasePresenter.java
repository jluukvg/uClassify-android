package com.jluukvg.uclassify.ui.base;

import com.jluukvg.uclassify.data.DataManager;

import javax.inject.Inject;

/**
 * Created by jluukvg on 8/2/17.
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private static final String TAG = "BasePresenter";

    private final DataManager dataManager;

    private V mvpView;

    @Inject
    public BasePresenter(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        this.mvpView = mvpView;
    }

    @Override
    public void onDetach() {
        mvpView = null;
    }

    public boolean isViewAttached() {
        return mvpView != null;
    }

    public DataManager getDataManager() {
        return dataManager;
    }

}
