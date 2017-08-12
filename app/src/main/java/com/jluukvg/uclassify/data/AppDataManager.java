package com.jluukvg.uclassify.data;

import com.jluukvg.uclassify.data.memory.MemoryHelper;
import com.jluukvg.uclassify.data.memory.model.ClassificationResults;
import com.jluukvg.uclassify.data.network.model.ClassifierResponse;
import com.jluukvg.uclassify.data.prefs.PreferencesHelper;
import com.jluukvg.uclassify.di.ApplicationContext;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppDataManager implements DataManager {

    private static final String TAG = "AppDataManager";

    private final Context context;
    private final MemoryHelper memoryHelper;
    private final PreferencesHelper preferencesHelper;

    @Inject
    public AppDataManager(@ApplicationContext Context context, MemoryHelper memoryHelper, PreferencesHelper preferencesHelper) {
        this.context = context;
        this.memoryHelper = memoryHelper;
        this.preferencesHelper = preferencesHelper;
    }

    @Override
    public ClassificationResults getClassificationResults() {
        return memoryHelper.getClassificationResults();
    }

    @Override
    public void saveClassificationResults(ClassificationResults classificationResults) {
        memoryHelper.saveClassificationResults(classificationResults);
    }
}
