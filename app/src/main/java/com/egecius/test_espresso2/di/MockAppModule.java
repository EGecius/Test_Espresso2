package com.egecius.test_espresso2.di;

import com.egecius.test_espresso2.dependencies.ApiService;
import com.egecius.test_espresso2.dependencies.MockApiService;

import dagger.Module;
import dagger.Provides;

@Module
public class MockAppModule {

    @Provides
    public ApiService provideApiService() {
        return new MockApiService();
    }

}
