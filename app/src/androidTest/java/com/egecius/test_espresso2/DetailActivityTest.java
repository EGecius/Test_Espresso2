package com.egecius.test_espresso2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.test.rule.ActivityTestRule;

import com.egecius.test_espresso2.app.DetailActivity;

import org.junit.Rule;
import org.junit.Test;

public class DetailActivityTest {

    @Rule
    public ActivityTestRule<DetailActivity> mTestRule = new ActivityTestRule<>(DetailActivity.class);

    @Test
    public void textFound() {
        onView(withText("from MockMySubcomponentModule")).check(matches(isDisplayed()));
    }
}
