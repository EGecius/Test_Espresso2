package com.egecius.test_espresso2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.test.rule.ActivityTestRule;

import com.egecius.test_espresso2.app.MainActivity;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

	@Rule
	public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

	@Test
	public void showsText() {
		onView(withText("Main Activity")).check(matches(isDisplayed()));
	}

}