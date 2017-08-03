package com.jluukvg.uclassify.di.module;

import com.jluukvg.uclassify.di.ActivityContext;
import com.jluukvg.uclassify.di.PerActivity;
import com.jluukvg.uclassify.ui.main.MainMvpPresenter;
import com.jluukvg.uclassify.ui.main.MainMvpView;
import com.jluukvg.uclassify.ui.results.ResultsMvpPresenter;
import com.jluukvg.uclassify.ui.results.ResultsMvpView;
import com.jluukvg.uclassify.ui.splash.SplashMvpPresenter;
import com.jluukvg.uclassify.ui.splash.SplashMvpView;
import com.jluukvg.uclassify.ui.splash.SplashPresenter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return activity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return activity;
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(MainMvpPresenter<MainMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    ResultsMvpPresenter<ResultsMvpView> provideResultsPresenter(ResultsMvpPresenter<ResultsMvpView> presenter) {
        return presenter;
    }



}
