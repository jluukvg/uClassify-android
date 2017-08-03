package com.jluukvg.uclassify.ui.results;

import com.jluukvg.uclassify.data.DataManager;
import com.jluukvg.uclassify.ui.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by jluukvg on 8/2/17.
 *
 */

public class ResultsPresenter<V extends ResultsMvpView> extends BasePresenter<V> implements ResultsMvpPresenter<V> {

    @Inject
    public ResultsPresenter(DataManager dataManager) {
        super(dataManager);
    }
}
