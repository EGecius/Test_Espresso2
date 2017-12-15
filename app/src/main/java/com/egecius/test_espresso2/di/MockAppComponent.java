package com.egecius.test_espresso2.di;

import com.egecius.test_espresso2.MockAppModule;

import dagger.Component;

@Component (modules = MockAppModule.class)
public interface MockAppComponent extends AppComponent {
}
