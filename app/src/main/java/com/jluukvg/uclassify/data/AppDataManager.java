package com.jluukvg.uclassify.data;

import com.jluukvg.uclassify.data.prefs.PreferencesHelper;
import com.jluukvg.uclassify.di.ApplicationContext;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppDataManager implements DataManager {

    private static final String TAG = "AppDataManager";

    private final Context context;
    private final PreferencesHelper preferencesHelper;

    @Inject
    public AppDataManager(@ApplicationContext Context context, PreferencesHelper preferencesHelper) {
        this.context = context;
        this.preferencesHelper = preferencesHelper;
    }

}
