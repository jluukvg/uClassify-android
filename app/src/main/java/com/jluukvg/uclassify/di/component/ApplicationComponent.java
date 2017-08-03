package com.jluukvg.uclassify.di.component;

import com.jluukvg.uclassify.MvpApp;
import com.jluukvg.uclassify.data.DataManager;
import com.jluukvg.uclassify.di.ApplicationContext;
import com.jluukvg.uclassify.di.module.ApplicationModule;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(MvpApp app);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
}
