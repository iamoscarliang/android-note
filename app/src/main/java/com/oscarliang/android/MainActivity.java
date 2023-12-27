package com.oscarliang.android;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.oscarliang.android.injection.ExampleApp;
import com.oscarliang.android.injection.car.Car;
import com.oscarliang.android.injection.di.ActivityComponent;
import com.oscarliang.android.injection.di.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    /**
     * Field injection
     */
    @Inject
    Car car1;

    @Inject
    Car car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        // Create component
//        CarComponent component = DaggerCarComponent.create();
//        car1 = component.getCar();

//        // Create component with custom module
//        CarComponent component = DaggerCarComponent.builder()
//                .dieselEngineModule(new DieselEngineModule(100))
//                .build();

//        // Create component with custom parameter
//        CarComponent component = DaggerCarComponent.builder()
//                .horsePower(150)
//                .engineCapacity(1400)
//                .build();

//        // Create component with custom parameter and custom scope
//        ActivityComponent component = DaggerActivityComponent.builder()
//                .horsePower(150)
//                .engineCapacity(1400)
//                .appComponent(((ExampleApp) getApplication()).getAppComponent())
//                .build();

        // Create component with custom parameter and custom sub scope
        ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponent(new DieselEngineModule(120));

//        // Create component with custom parameter using factory
//        ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
//                .getActivityComponentFactory().create(150, 1400);

        component.inject(this);

        car1.drive();
        car2.drive();
    }

}