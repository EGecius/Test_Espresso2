package com.egecius.test_espresso2.di.real.subcomponent;


import dagger.Subcomponent;

@Subcomponent(modules = RealMySubcomponentModule.class)
public interface RealMySubcomponent extends MySubcomponent {
}
