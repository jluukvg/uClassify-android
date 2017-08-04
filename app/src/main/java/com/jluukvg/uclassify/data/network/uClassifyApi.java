package com.jluukvg.uclassify.data.network;

import com.jluukvg.uclassify.data.network.model.ClassifierResponse;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface uClassifyApi {

    @POST("{username}/{classifierName}/classify")
    Call<ClassifierResponse> getTopicProbabilities(@Path("username") String username,
                                                   @Path("classifierName") String classifierName);

}
