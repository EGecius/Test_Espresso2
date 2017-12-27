package com.egecius.test_espresso2.di;

import android.content.Context;

import com.egecius.test_espresso2.dependencies.ApiService;
import com.egecius.test_espresso2.dependencies.MockApiService;

import dagger.Module;
import dagger.Provides;

@Module
public class MockAppModule {

    private final Context context;

    public MockAppModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideSubComponentModule() {
        return context;
    }

    @Provides
    public ApiService provideApiService() {
        return new MockApiService();
    }

}
