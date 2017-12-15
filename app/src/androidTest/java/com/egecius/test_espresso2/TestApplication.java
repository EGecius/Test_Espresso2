package com.egecius.test_espresso2;

import com.egecius.test_espresso2.di.ApplicationComponent;
import com.egecius.test_espresso2.di.DaggerMockApplicationComponent;

public class TestApplication extends DemoApplication {

    @Override
    protected ApplicationComponent createComponent() {
        return DaggerMockApplicationComponent.builder()
                .build();
    }
}
