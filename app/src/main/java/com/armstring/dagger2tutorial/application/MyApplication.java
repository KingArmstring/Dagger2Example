package com.armstring.dagger2tutorial.application;

import android.app.Application;


import com.armstring.dagger2tutorial.application.di.ApplicationComponent;
import com.armstring.dagger2tutorial.application.di.ApplicationModule;
import com.armstring.dagger2tutorial.application.di.DaggerApplicationComponent;

public class MyApplication extends Application{

    static ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule())
                .build();

        component.inject(this);
    }

    public static ApplicationComponent getComponent() {
        return component;
    }
}
