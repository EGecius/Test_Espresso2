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
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;


@RunWith (AndroidJUnit4.class)
@LargeTest
public class AlternativeTest {

	@Rule
	public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

	@Test
	public void whenMainActStarts_listIsVisible() {
		onView(withId(R.id.visibility_gone)).check(matches(not(isDisplayed())));
	}

//	@Test
//	public void whenMainActStarts_listIsVisible_SHOULDFAIL() {
//		onView(withId(R.id.edit_text)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.INVISIBLE)));
//	}

	@Test
	public void viewIsDisplayed() {
		onView(withId(R.id.identical_id)).check(matches(isDisplayed()));
	}

	@Test
	public void textIsDetected() {
		onView(withId(R.id.identical_id)).check(matches(withText(R.string.identical_id)));
	}

	@Test
	public void textIsDetected2() {
		onView(withId(R.id.identical_id)).check(matches(withText("identical id 1")));
	}

	@Test
	public void viewWithVisibilityGone_shouldNotBeDisplayed() {
		onView(withId(R.id.visibility_gone)).check(matches(not(isDisplayed())));
	}

	@Test
	public void viewWithVisibilityInvisible_shouldNotBeDisplayed() {
		onView(withId(R.id.visibility_invisible)).check(matches(not(isDisplayed())));
	}


//	@Test
//	public void whenMainActStarts_progressBarIsGone() {
//
//	}



}