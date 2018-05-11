package com.armstring.dagger2tutorial.model;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;

public interface Credentials {

    @GET("/room/microdoers")
    Call<CredentialsObject> getCredentials();
}
