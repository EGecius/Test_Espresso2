package com.egecius.test_espresso2;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import com.egecius.test_espresso2.app.MainActivity;

@RunWith (AndroidJUnit4.class)
@LargeTest
public class ApplicationTest {

	@Rule
	public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

	@Test
	public void whenMainActivityIsLaunched_HelloWorldIsFound() {
		onView(withId(R.id.visibility_gone)).check(matches(isDisplayed()));
	}

}