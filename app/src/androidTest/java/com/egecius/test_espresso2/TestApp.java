package com.egecius.test_espresso2;

import com.egecius.test_espresso2.app.RealApp;
import com.egecius.test_espresso2.di.AppComponent;
import com.egecius.test_espresso2.di.DaggerMockAppComponent;
import com.egecius.test_espresso2.di.MockAppModule;

public class TestApp extends RealApp {

    @Override
    protected AppComponent createComponent() {
        return DaggerMockAppComponent.builder()
                .mockAppModule(new MockAppModule(this))
                .build();
    }
}
