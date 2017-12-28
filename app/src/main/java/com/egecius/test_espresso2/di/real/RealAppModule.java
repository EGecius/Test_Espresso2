package com.egecius.test_espresso2.di.real;

import android.content.Context;

import com.egecius.test_espresso2.dependencies.ApiService;
import com.egecius.test_espresso2.dependencies.real.RealApiService;

import dagger.Module;
import dagger.Provides;

@Module
public class RealAppModule {

    private final Context mContext;

    public RealAppModule(Context context) {
        mContext = context;
    }

    @Provides
    public Context provideContext() {
        return mContext;
    }

    @Provides
    public ApiService provideApiService() {
        return new RealApiService();
    }
}
