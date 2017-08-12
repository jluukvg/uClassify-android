package com.jluukvg.uclassify.ui.main;

import com.jluukvg.uclassify.data.DataManager;
import com.jluukvg.uclassify.data.network.UclassifyApi;
import com.jluukvg.uclassify.data.network.model.ClassifierResponse;
import com.jluukvg.uclassify.data.network.model.ClassifyTask;
import com.jluukvg.uclassify.ui.base.BasePresenter;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.jluukvg.uclassify.utils.AppConstants.API_READ_KEY;

/**
 * Created by jluukvg on 8/2/17.
 *
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    @Inject
    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Inject
    UclassifyApi UclassifyApi;

    @Override
    public void onSubmitButtonClick() {
        getMvpView().showLoading();
        String myString = getMvpView().getText();
        Log.d("myString", myString);

        ClassifyTask task = new ClassifyTask();
        task.setTexts(Arrays.asList("Hello World! How are you??"));

        // Do the network call and wait for an answer, then do next line

        UclassifyApi.getTopicProbabilities("uClassify", "topics", task).enqueue(new Callback<ArrayList<ClassifierResponse>>() {
            @Override
            public void onResponse(Call<ArrayList<ClassifierResponse>> call, Response<ArrayList<ClassifierResponse>> response) {

                if (response.code() != 200) {
                    //getMvpView().showMessage("Daamn! something went WRONG!!");
                    Log.d("OkHttp:", "Damn! something wasn't 200!!");
                } else {
                    ArrayList<ClassifierResponse> classifierResponseArray = response.body();
                    ClassifierResponse classifierResponse = classifierResponseArray.get(0);
                    Log.d("OkHttp:", classifierResponse.toString());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<ClassifierResponse>> call, Throwable t) {

                Log.d("OkHttp:", t.toString());
            }
        });

        getMvpView().openResultsActivity();
    }
}
