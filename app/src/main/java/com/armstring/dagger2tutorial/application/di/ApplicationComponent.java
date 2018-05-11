package com.armstring.dagger2tutorial.application.di;

import com.armstring.dagger2tutorial.application.MyApplication;

import dagger.Component;
import retrofit2.Retrofit;

@ApplicationScope
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(MyApplication application);
}
