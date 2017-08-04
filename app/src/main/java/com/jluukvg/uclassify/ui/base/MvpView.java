package com.jluukvg.uclassify.ui.base;

import android.support.annotation.StringRes;

/**
 * Created by jluukvg on 8/2/17.
 *
 */

public interface MvpView {

    void onError(String message);

    void onError(@StringRes int resId);

    void showMessage(String message);

    void showMessage(@StringRes int resId);

}
