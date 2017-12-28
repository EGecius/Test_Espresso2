package com.egecius.test_espresso2.app;

import android.app.Application;

import com.egecius.test_espresso2.di.AppComponent;
import com.egecius.test_espresso2.di.real.DaggerRealAppComponent;
import com.egecius.test_espresso2.di.real.RealAppComponent;
import com.egecius.test_espresso2.di.real.RealAppModule;
import com.egecius.test_espresso2.di.real.subcomponent.MySubcomponent;
import com.egecius.test_espresso2.di.real.subcomponent.RealMySubcomponentModule;


public class RealApp extends Application {

    protected AppComponent mComponent = createComponent();

    @Override
    public void onCreate() {
        super.onCreate();
    }

    protected AppComponent createComponent() {
        return DaggerRealAppComponent.builder()
                .realAppModule(new RealAppModule(this))
                .build();
    }

    public AppComponent getComponent() {
        return mComponent;
    }

    protected MySubcomponent getMySubcomponent() {
        return ((RealAppComponent) mComponent).plus(new RealMySubcomponentModule());
    }
}
