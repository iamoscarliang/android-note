package com.oscarliang.android.injection.di;

import com.oscarliang.android.injection.car.Rim;
import com.oscarliang.android.injection.car.Tire;
import com.oscarliang.android.injection.car.Wheel;

import dagger.Module;
import dagger.Provides;

/**
 * Module to provide instance that cannot be injected directly
 */
@Module
public abstract class WheelModule {

    @Provides
    static Rim provideRim() {
        return new Rim();
    }

    @Provides
    static Tire provideTire() {
        Tire tires = new Tire();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheel provideWheels(Rim rim, Tire tire) {
        return new Wheel(rim, tire);
    }

}
