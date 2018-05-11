package com.armstring.dagger2tutorial.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.armstring.dagger2tutorial.BuildConfig;
import com.armstring.dagger2tutorial.R;
import com.armstring.dagger2tutorial.activity.di.ActivityComponent;
import com.armstring.dagger2tutorial.activity.di.ActivityModule;
import com.armstring.dagger2tutorial.activity.di.DaggerActivityComponent;
import com.armstring.dagger2tutorial.application.MyApplication;
import com.armstring.dagger2tutorial.application.di.ApplicationComponent;
import com.armstring.dagger2tutorial.application.di.ApplicationModule;
import com.armstring.dagger2tutorial.application.di.ApplicationQualifier;
import com.armstring.dagger2tutorial.application.di.ApplicationScope;
import com.armstring.dagger2tutorial.application.di.DaggerApplicationComponent;
import com.armstring.dagger2tutorial.model.Credentials;
import com.armstring.dagger2tutorial.model.CredentialsManager;
import com.armstring.dagger2tutorial.model.CredentialsObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    ActivityComponent component;

    @Inject
    @ApplicationScope
    @ApplicationQualifier
    Retrofit retrofit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule())
                .applicationComponent(MyApplication.getComponent())
                .build();

        component.inject(this);
    }
}
