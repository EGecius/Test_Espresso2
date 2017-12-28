package com.egecius.test_espresso2.di.mock;

import com.egecius.test_espresso2.di.AppComponent;
import com.egecius.test_espresso2.di.real.subcomponent.MockMySubcomponent;
import com.egecius.test_espresso2.di.real.subcomponent.MockMySubcomponentModule;

import dagger.Component;

@Component (modules = MockAppModule.class)
public interface MockAppComponent extends AppComponent {

    MockMySubcomponent plus(MockMySubcomponentModule module);
}
