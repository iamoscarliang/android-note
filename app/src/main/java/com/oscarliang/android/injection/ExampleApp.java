package com.oscarliang.android.injection;

import android.app.Application;

import com.oscarliang.android.injection.di.AppComponent;
import com.oscarliang.android.injection.di.DaggerAppComponent;
import com.oscarliang.android.injection.di.DriverModule;

public class ExampleApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.factory().create(new DriverModule("Android"));
    }

    public AppComponent getAppComponent() {
        return component;
    }

}
