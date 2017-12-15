package com.egecius.test_espresso2;

import android.app.Application;

import com.egecius.test_espresso2.di.ApplicationComponent;
import com.egecius.test_espresso2.di.DaggerApplicationComponent;

public class DemoApplication extends Application {

    private ApplicationComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        injectDependencies();
    }

    private void injectDependencies() {
        mComponent = DaggerApplicationComponent.builder()
                .build();
    }

    public ApplicationComponent getComponent() {
        return mComponent;
    }
}
