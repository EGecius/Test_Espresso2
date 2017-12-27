package com.egecius.test_espresso2.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.egecius.test_espresso2.R;
import com.egecius.test_espresso2.dependencies.ApiService;
import com.egecius.test_espresso2.di.AppComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Context mContext;
    @Inject
    ApiService mApiService;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        injectDependencies();
		setListener();
        setText();
    }

    private void injectDependencies() {
        RealApp application = (RealApp) getApplication();
        AppComponent appComponent = application.getComponent();
        appComponent.inject(this);
    }

    private void setListener() {
        findViewById(R.id.to_detail_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDetailActivity();
            }
        });
    }

    private void showDetailActivity() {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }

    private void setText() {
        TextView textView = (TextView) findViewById(R.id.view_to_set);
        textView.setText(mApiService.getString());
    }

    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
