package com.jluukvg.uclassify;

import com.jluukvg.uclassify.data.DataManager;
import com.jluukvg.uclassify.di.component.ApplicationComponent;
import com.jluukvg.uclassify.di.module.ApplicationModule;

import android.app.Application;

import javax.inject.Inject;

public class MvpApp extends Application {

    @Inject
    DataManager dataManager;

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent() {
        return applicationComponent;
    }

    public void setComponent(ApplicationComponent applicationComponent) {
        this.applicationComponent = applicationComponent;
    }
}
