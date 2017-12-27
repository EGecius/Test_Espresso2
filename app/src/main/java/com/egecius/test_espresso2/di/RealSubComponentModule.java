package com.egecius.test_espresso2.di;

import android.content.Context;

import com.egecius.test_espresso2.dependencies.RealTextProvider;
import com.egecius.test_espresso2.dependencies.TextProvider;

import dagger.Module;
import dagger.Provides;

@Module
public class RealSubComponentModule {

    @Provides
    public TextProvider provideTextProvider(Context context) {
        return new RealTextProvider(context);
    }
}
