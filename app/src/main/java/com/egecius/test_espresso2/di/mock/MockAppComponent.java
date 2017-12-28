package com.egecius.test_espresso2.di.mock;

import com.egecius.test_espresso2.di.AppComponent;

import dagger.Component;

@Component (modules = MockAppModule.class)
public interface MockAppComponent extends AppComponent {
}
