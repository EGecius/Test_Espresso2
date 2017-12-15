package com.egecius.test_espresso2;

import android.app.Application;

import com.egecius.test_espresso2.di.ApplicationComponent;
import com.egecius.test_espresso2.di.DaggerRealApplicationComponent;

public class DemoApplication extends Application {

    protected ApplicationComponent mComponent = createComponent();

    @Override
    public void onCreate() {
        super.onCreate();
    }

    protected ApplicationComponent createComponent() {
        return DaggerRealApplicationComponent.builder()
                .build();
    }

    public ApplicationComponent getComponent() {
        return mComponent;
    }
}
