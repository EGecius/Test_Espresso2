package com.egecius.test_espresso2;

import com.egecius.test_espresso2.app.RealApp;
import com.egecius.test_espresso2.di.AppComponent;
import com.egecius.test_espresso2.di.mock.DaggerMockAppComponent;
import com.egecius.test_espresso2.di.mock.MockAppComponent;
import com.egecius.test_espresso2.di.mock.MockAppModule;
import com.egecius.test_espresso2.di.real.subcomponent.MockMySubcomponentModule;
import com.egecius.test_espresso2.di.real.subcomponent.MySubcomponent;

public class TestApp extends RealApp {

    @Override
    protected AppComponent createComponent() {
        return DaggerMockAppComponent.builder()
                .mockAppModule(new MockAppModule(this))
                .build();
    }

    @Override
    protected MySubcomponent createMySubcomponent() {
        return ((MockAppComponent) mComponent).plus(new MockMySubcomponentModule());
    }
}
