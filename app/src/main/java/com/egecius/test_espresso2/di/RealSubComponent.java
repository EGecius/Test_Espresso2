package com.egecius.test_espresso2.di;

import dagger.Component;

@Component(modules = RealSubComponentModule.class)
public interface RealSubComponent extends SubComponent {
}
