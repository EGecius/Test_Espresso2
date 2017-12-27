package com.egecius.test_espresso2.app;

import android.app.Application;

import com.egecius.test_espresso2.di.AppComponent;
import com.egecius.test_espresso2.di.DaggerRealAppComponent;


public class RealApp extends Application {

    protected AppComponent mComponent = createComponent();

    @Override
    public void onCreate() {
        super.onCreate();
    }

    protected AppComponent createComponent() {
        return DaggerRealAppComponent.builder()
                .build();
    }

    public AppComponent getComponent() {
        return mComponent;
    }
}
