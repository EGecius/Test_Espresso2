package com.egecius.test_espresso2.di.real.subcomponent;


import dagger.Subcomponent;

@Subcomponent(modules = MockMySubcomponentModule.class)
public interface MockMySubcomponent extends MySubcomponent {
}
