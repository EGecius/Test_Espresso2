package com.egecius.test_espresso2.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.egecius.test_espresso2.R;

import javax.inject.Inject;
import javax.inject.Named;

public class DetailActivity extends AppCompatActivity {

    @Inject
    @Named("SubcomponentModule")
    String injectedString;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        injectDependencies();
        setText();
    }

    private void setText() {
        TextView textView = (TextView) findViewById(R.id.text_to_set);
        textView.setText(injectedString);
    }

    private void injectDependencies() {
        RealApp application = (RealApp) getApplication();
        application.createMySubcomponent().inject(this);
    }
}
