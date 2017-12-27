package com.egecius.test_espresso2.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.egecius.test_espresso2.R;
import com.egecius.test_espresso2.dependencies.TextProvider;
import com.egecius.test_espresso2.di.DaggerRealSubComponent;
import com.egecius.test_espresso2.di.RealSubComponent;

import javax.inject.Inject;

public class DetailActivity extends AppCompatActivity {

    @Inject
    TextProvider mTextProvider;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        injectDependencies();
        setText();
    }

    private void setText() {
        TextView textView = (TextView) findViewById(R.id.text_to_set);
        textView.setText(mTextProvider.getText());
    }

    private void injectDependencies() {
        RealSubComponent component = DaggerRealSubComponent.builder().build();
        component.inject(this);
    }
}
