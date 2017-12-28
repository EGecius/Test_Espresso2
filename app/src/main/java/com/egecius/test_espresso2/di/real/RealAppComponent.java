package com.egecius.test_espresso2.di.real;

import com.egecius.test_espresso2.di.AppComponent;
import com.egecius.test_espresso2.di.real.subcomponent.RealMySubcomponentModule;
import com.egecius.test_espresso2.di.real.subcomponent.RealMySubcomponent;

import dagger.Component;

@Component(modules = RealAppModule.class)
public interface RealAppComponent extends AppComponent {

    RealMySubcomponent plus(RealMySubcomponentModule module);
}
