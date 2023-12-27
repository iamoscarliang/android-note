package com.oscarliang.android.injection.car;

public class Wheel {
    //we don't own this class so we can't annotate it with @Inject

    private Rim rim;
    private Tire tire;

    public Wheel(Rim rim, Tire tire) {
        this.rim = rim;
        this.tire = tire;
    }

}
