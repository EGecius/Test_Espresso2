package com.egecius.test_espresso2.di;

import com.egecius.test_espresso2.MockApplicationModule;

import dagger.Component;

@Component (modules = MockApplicationModule.class)
public interface MockApplicationComponent extends ApplicationComponent {
}
