package com.egecius.test_espresso2;

import com.egecius.test_espresso2.di.AppComponent;
import com.egecius.test_espresso2.di.DaggerMockAppComponent;

public class TestApp extends RealApp {

    @Override
    protected AppComponent createComponent() {
        return DaggerMockAppComponent.builder()
                .build();
    }
}
