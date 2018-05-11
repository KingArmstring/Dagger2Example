package com.armstring.dagger2tutorial.activity.di;


import com.armstring.dagger2tutorial.activity.MainActivity;
import com.armstring.dagger2tutorial.application.di.ApplicationComponent;
import com.armstring.dagger2tutorial.application.di.ApplicationModule;

import dagger.Component;

@ActivityScope
@Component(modules = {ActivityModule.class} , dependencies = {ApplicationComponent.class})
public interface ActivityComponent {
    void inject(MainActivity activity);
}
