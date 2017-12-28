package com.egecius.test_espresso2.di.real.subcomponent;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class MockMySubcomponentModule {

    public static final String TAG = "SubcomponentModule";

    @Provides
    @Named(TAG)
    String providesString(){
        return "from MockMySubcomponentModule";
    }
}
