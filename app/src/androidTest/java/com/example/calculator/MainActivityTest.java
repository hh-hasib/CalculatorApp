package com.example.calculator;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.espresso.assertion.ViewAssertions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testAddition() {
        Espresso.onView(ViewMatchers.withId(R.id.editTextNumber1))
                .perform(ViewActions.typeText("5"), ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.editTextNumber2))
                .perform(ViewActions.typeText("3"), ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.buttonAdd)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.editTextResult))
                .check(ViewAssertions.matches(ViewMatchers.withText("8.0")));
    }

    @Test
    public void testSubtraction() {
        Espresso.onView(ViewMatchers.withId(R.id.editTextNumber1))
                .perform(ViewActions.typeText("10"), ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.editTextNumber2))
                .perform(ViewActions.typeText("5"), ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.buttonSubtract)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.editTextResult))
                .check(ViewAssertions.matches(ViewMatchers.withText("5.0")));
    }

    @Test
    public void testMultiplication() {
        Espresso.onView(ViewMatchers.withId(R.id.editTextNumber1))
                .perform(ViewActions.typeText("4"), ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.editTextNumber2))
                .perform(ViewActions.typeText("6"), ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.buttonMultiply)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.editTextResult))
                .check(ViewAssertions.matches(ViewMatchers.withText("24.0")));
    }

    @Test
    public void testDivision() {
        Espresso.onView(ViewMatchers.withId(R.id.editTextNumber1))
                .perform(ViewActions.typeText("20"), ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.editTextNumber2))
                .perform(ViewActions.typeText("4"), ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.buttonDivide)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.editTextResult))
                .check(ViewAssertions.matches(ViewMatchers.withText("5.0")));
    }
}
