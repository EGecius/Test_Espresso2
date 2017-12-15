package com.egecius.test_espresso2.di;

import com.egecius.test_espresso2.ApiService;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    public ApiService provideApiService() {
        return new RealApiService();
    }
}
