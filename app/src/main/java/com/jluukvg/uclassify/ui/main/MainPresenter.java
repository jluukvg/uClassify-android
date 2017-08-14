package com.jluukvg.uclassify.ui.main;

import android.support.annotation.NonNull;
import android.util.Log;

import com.jluukvg.uclassify.data.DataManager;
import com.jluukvg.uclassify.data.memory.model.ClassificationResults;
import com.jluukvg.uclassify.data.network.UclassifyApi;
import com.jluukvg.uclassify.data.network.model.ClassifierResponse;
import com.jluukvg.uclassify.data.network.model.ClassifyTask;
import com.jluukvg.uclassify.ui.base.BasePresenter;

import java.util.ArrayList;
import java.util.Collections;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by jluukvg on 8/2/17.
 *
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    @Inject
    MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Inject
    UclassifyApi UclassifyApi;

    @Override
    public void onSubmitButtonClick() {
        getMvpView().showLoading();
        String inputText = getMvpView().getText();
        Log.d("myString", inputText);

        ClassifyTask task = new ClassifyTask();
        task.setTexts(Collections.singletonList(inputText));

        UclassifyApi.getTopicProbabilities("uClassify", "topics", task).enqueue(new Callback<ArrayList<ClassifierResponse>>() {
            @Override
            public void onResponse(@NonNull Call<ArrayList<ClassifierResponse>> call, @NonNull Response<ArrayList<ClassifierResponse>> response) {

                if (response.code() != 200) {
                    getMvpView().showMessage("Daamn! something went WRONG!");
                } else {
                    ArrayList<ClassifierResponse> classifierResponseArray = response.body();
                    ClassifierResponse classifierResponse;
                    if (classifierResponseArray != null && classifierResponseArray.size() >= 1) {
                        classifierResponse = classifierResponseArray.get(0);
                        ClassificationResults classificationResults = classifierResponse.getClassification();
                        getDataManager().saveClassificationResults(classificationResults);
                        Log.d("OkHttp:", classifierResponse.toString());
                        getMvpView().openResultsActivity();
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<ArrayList<ClassifierResponse>> call, @NonNull Throwable t) {
                Log.d("OkHttp:", t.toString());
            }
        });
    }
}
