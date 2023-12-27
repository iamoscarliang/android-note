package com.oscarliang.android.injection.di;

import com.oscarliang.android.injection.car.DieselEngine;
import com.oscarliang.android.injection.car.Engine;

import dagger.Module;
import dagger.Provides;

/**
 * Module to inject instance with parameter at runtime
 */
@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower() {
        return horsePower;
    }

    /**
     * Provide concrete subclass with parameter at runtime
     * @return The require abstract interface type
     */
    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }

//    @Provides
//    Engine provideEngine() {
//        return new DieselEngine(horsePower);
//    }

}
