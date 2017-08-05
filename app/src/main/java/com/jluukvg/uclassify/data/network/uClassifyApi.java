package com.jluukvg.uclassify.data.network;

import com.jluukvg.uclassify.data.network.model.ClassifierResponse;

import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface uClassifyApi {

    @Headers("Content-Type: application/json")
    @POST("{username}/{classifierName}/classify")
    Call<ClassifierResponse> getTopicProbabilities(@Path("username") String username,
            @Path("classifierName") String classifierName,
            @Header("Authorization") String apiReadKey);

}
