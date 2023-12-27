package com.oscarliang.android.injection.di;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

//    Driver getDriver();

    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);

//    ActivityComponent.Builder getActivityComponentBuilder();

    @Component.Factory
    interface Factory {

        AppComponent create(DriverModule driverModule);
    }

}
