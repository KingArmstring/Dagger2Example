package com.armstring.dagger2tutorial.model;

import retrofit2.Retrofit;

public class CredentialsManager {

    public Credentials getCredentials(Retrofit retrofit) {

        return retrofit.create(Credentials.class);
    }
}
