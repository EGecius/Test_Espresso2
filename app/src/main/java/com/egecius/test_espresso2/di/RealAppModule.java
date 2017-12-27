package com.egecius.test_espresso2.di;

import com.egecius.test_espresso2.dependencies.ApiService;
import com.egecius.test_espresso2.dependencies.RealApiService;

import dagger.Module;
import dagger.Provides;

@Module
public class RealAppModule {

    @Provides
    public ApiService provideApiService() {
        return new RealApiService();
    }
}
