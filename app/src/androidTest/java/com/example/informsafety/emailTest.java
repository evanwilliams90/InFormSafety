package com.example.informsafety;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class emailTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void emailTest() {
        ViewInteraction editText = onView(
                allOf(withId(R.id.email), withText("Email"),
                        withParent(withParent(withId(R.id.txtInLayoutEmail))),
                        isDisplayed()));
        editText.check(doesNotExist());

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.email), withText("Email"),
                        withParent(withParent(withId(R.id.txtInLayoutEmail))),
                        isDisplayed()));
        editText2.check(doesNotExist());
    }
}
