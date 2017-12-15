package com.egecius.test_espresso2;

import dagger.Module;
import dagger.Provides;

@Module
public class MockAppModule {

    @Provides
    public ApiService provideApiService() {
        return new MockApiService();
    }

}
