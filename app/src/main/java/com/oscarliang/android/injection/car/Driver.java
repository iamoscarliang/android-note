package com.oscarliang.android.injection.car;

public class Driver {
    //we don't own this class so we can't annotate it with @Inject

    String name;

    public Driver(String name) {
        this.name = name;
    }

}
