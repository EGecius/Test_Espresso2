package com.egecius.test_espresso2.dependencies;

import android.content.Context;

import com.egecius.test_espresso2.R;

public class MockTextProvider implements TextProvider {

    private final Context context;

    public MockTextProvider(Context context) {
        this.context = context;
    }

    @Override
    public String getText() {
        return context.getString(R.string.from_mock_text_provider);
    }
}
