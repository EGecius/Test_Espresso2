package com.egecius.test_espresso2.di;

import dagger.Component;

@Component (modules = MockSubComponentModule.class)
interface MockSubComponent extends SubComponent {
}
