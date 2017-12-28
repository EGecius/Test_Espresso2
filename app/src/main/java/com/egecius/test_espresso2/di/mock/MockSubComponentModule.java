package com.egecius.test_espresso2.di.mock;

import android.content.Context;

import com.egecius.test_espresso2.dependencies.mock.MockTextProvider;
import com.egecius.test_espresso2.dependencies.TextProvider;

import dagger.Module;
import dagger.Provides;

@Module
class MockSubComponentModule {

    @Provides
    public TextProvider provideTextProvider(Context context) {
        return new MockTextProvider(context);
    }

}