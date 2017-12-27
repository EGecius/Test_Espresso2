package com.egecius.test_espresso2.dependencies;

import android.content.Context;

import com.egecius.test_espresso2.R;

public class RealTextProvider implements TextProvider {

    public RealTextProvider(Context context) {
        this.context = context;
    }

    private final Context context;

    @Override
    public String getText() {
        return context.getString(R.string.from_real_text_provider);
    }
}
