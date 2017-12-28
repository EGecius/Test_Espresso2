package com.egecius.test_espresso2.di.real.subcomponent;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class MySubcomponentModule {

    public static final String TAG = "MySubcomponent";

    @Provides
    @Named(TAG)
    String providesString(){
        return "from MySubcomponentModule";
    }
}
