package com.jluukvg.uclassify.ui.results;

import android.content.Context;
import android.content.Intent;

import com.jluukvg.uclassify.ui.base.BaseActivity;

/**
 * Created by jluukvg on 8/2/17.
 *
 */

public class ResultsActivity extends BaseActivity implements ResultsMvpView {

    public static Intent getStartIntent(Context context) {
        return new Intent(context, ResultsActivity.class);
    }
}