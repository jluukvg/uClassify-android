package com.jluukvg.uclassify.data.network;

import com.jluukvg.uclassify.data.network.model.ClassifierResponse;
import com.jluukvg.uclassify.data.network.model.ClassifyTask;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

import static com.jluukvg.uclassify.utils.AppConstants.API_READ_KEY;

public interface UclassifyApi {

    @Headers({"Content-Type: application/json",
              "Authorization:Token " + API_READ_KEY})
    @POST("{username}/{classifierName}/classify")
    Call<ArrayList<ClassifierResponse>> getTopicProbabilities(@Path("username") String username,
                                                              @Path("classifierName") String classifierName,
                                                              //@Header("Authorization:Token") String apiReadKey,
                                                              @Body ClassifyTask classifyTask);

}
