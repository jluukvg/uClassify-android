package com.jluukvg.uclassify.di.component;

import com.jluukvg.uclassify.di.PerActivity;
import com.jluukvg.uclassify.di.module.ActivityModule;
import com.jluukvg.uclassify.di.module.NetworkModule;
import com.jluukvg.uclassify.ui.main.MainActivity;
import com.jluukvg.uclassify.ui.results.ResultsActivity;
import com.jluukvg.uclassify.ui.splash.SplashActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = {ApplicationComponent.class}, modules = {ActivityModule.class,
        NetworkModule.class})
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(SplashActivity activity);

    void inject(ResultsActivity activity);
}
