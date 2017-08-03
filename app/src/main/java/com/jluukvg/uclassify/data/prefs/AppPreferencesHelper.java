package com.jluukvg.uclassify.data.prefs;

import com.jluukvg.uclassify.di.ApplicationContext;
import com.jluukvg.uclassify.di.PreferenceInfo;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppPreferencesHelper implements PreferencesHelper {

    private final SharedPreferences sharedPreferences;

    @Inject
    public AppPreferencesHelper(@ApplicationContext Context context,
            @PreferenceInfo String prefFileName) {
        sharedPreferences = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }
}
