package com.oscarliang.android.injection.di;

import com.oscarliang.android.injection.car.Engine;
import com.oscarliang.android.injection.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

/**
 * Module to provide instance of interface that cannot be instantiate directly
 */
@Module
public abstract class PetrolEngineModule {

    /**
     * Bind instance of interface that cannot be instantiate directly
     * @param engine - Concrete subclass of interface
     * @return The require abstract interface type
     */
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

    /**
     * Provide instance of interface that cannot be instantiate directly
     * @param engine - Concrete subclass of interface
     * @return The require abstract interface type
     */
//    @Provides
//    Engine provideEngine(PetrolEngine engine) {
//        return engine;
//    }
//

}
