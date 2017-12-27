package com.egecius.test_espresso2.di;

import com.egecius.test_espresso2.dependencies.RealTextProvider;
import com.egecius.test_espresso2.dependencies.TextProvider;

import dagger.Module;
import dagger.Provides;

@Module
class MockSubComponentModule {

    @Provides
    public TextProvider provideTextProvider() {
        return new MockTextProvider();
    }

}
