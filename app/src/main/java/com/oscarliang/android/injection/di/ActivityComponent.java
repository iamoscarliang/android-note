package com.oscarliang.android.injection.di;

import com.oscarliang.android.MainActivity;
import com.oscarliang.android.injection.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelModule.class, DieselEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    /**
     * @param mainActivity - Parent class to inject the Car field
     */
    void inject(MainActivity mainActivity);

    /**
     * Builder to create the component with custom parameter and custom dependencies
     */
//    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        Builder horsePower(@Named("horse power") int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
//
//        Builder appComponent(AppComponent component);
//
//        ActivityComponent build();
//    }

    /**
     * Builder to create the subcomponent with custom parameter and custom dependencies
     */
//    @SubComponent.Builder
//    interface Builder {
//
//        @BindsInstance
//        Builder horsePower(@Named("horse power") int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
//
//        ActivityComponent build();
//    }

    /**
     * Factory to create the subcomponent with custom parameter
     */
//    @Subcomponent.Factory
//    interface Factory {
//
//        ActivityComponent create(@BindsInstance @Named("horse power") int horsePower,
//                                 @BindsInstance @Named("engine capacity") int engineCapacity);
//    }

}
