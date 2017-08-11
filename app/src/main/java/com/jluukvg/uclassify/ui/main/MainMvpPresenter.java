package com.jluukvg.uclassify.ui.main;

import com.jluukvg.uclassify.di.PerActivity;
import com.jluukvg.uclassify.ui.base.MvpPresenter;

/**
 * Created by jluukvg on 8/2/17.
 *
 */

@PerActivity
public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    void onSubmitButtonClick();

}
