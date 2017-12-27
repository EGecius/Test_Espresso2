package com.egecius.test_espresso2.di;

import android.content.Context;

import com.egecius.test_espresso2.R;
import com.egecius.test_espresso2.dependencies.TextProvider;

class MockTextProvider implements TextProvider {

    private final Context context;

    MockTextProvider(Context context) {
        this.context = context;
    }

    @Override
    public String getText() {
        return context.getString(R.string.from_mock_text_provider);
    }
}
