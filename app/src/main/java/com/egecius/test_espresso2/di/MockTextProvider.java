package com.egecius.test_espresso2.di;

import com.egecius.test_espresso2.dependencies.TextProvider;

class MockTextProvider implements TextProvider {
    @Override
    public String getText() {
        return "from MockTextProvider";
    }
}
