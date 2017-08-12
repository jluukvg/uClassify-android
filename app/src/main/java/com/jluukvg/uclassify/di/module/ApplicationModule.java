package com.jluukvg.uclassify.di.module;

import com.jluukvg.uclassify.data.AppDataManager;
import com.jluukvg.uclassify.data.DataManager;
import com.jluukvg.uclassify.data.memory.AppMemoryHelper;
import com.jluukvg.uclassify.data.memory.MemoryHelper;
import com.jluukvg.uclassify.data.prefs.AppPreferencesHelper;
import com.jluukvg.uclassify.data.prefs.PreferencesHelper;
import com.jluukvg.uclassify.di.ApiInfo;
import com.jluukvg.uclassify.di.ApplicationContext;
import com.jluukvg.uclassify.di.PreferenceInfo;
import com.jluukvg.uclassify.utils.AppConstants;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return application;
    }

    @Provides
    Application provideApplication() {
        return application;
    }

    @Provides
    @ApiInfo
    String provideReadApiKey() {
        return AppConstants.API_READ_KEY;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    MemoryHelper provideDbHelper(AppMemoryHelper appMemoryHelper) {
        return appMemoryHelper;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }
}
