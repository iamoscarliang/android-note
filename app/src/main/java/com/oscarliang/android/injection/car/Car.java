package com.oscarliang.android.injection.car;

import android.util.Log;

import com.oscarliang.android.injection.di.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {
    private static final String TAG = "Car";

    private Driver driver;
    private Engine engine;
    private Wheel wheel;

    /**
     * Constructor injection
     *
     * @param engine - Engine to be injected in this Car
     * @param wheel  - Wheel to be injected in this Car
     */
    @Inject
    public Car(Driver driver, Engine engine, Wheel wheel) {
        this.driver = driver;
        this.engine = engine;
        this.wheel = wheel;
    }

    /**
     * Field injection
     *
     * @param remote - Remote to be injected in this method
     */
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver + " " + driver.name + " drives " + this);
    }

}
