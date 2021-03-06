
package com.se309.tower;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;



import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.RootMatchers.isDialog;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.core.StringEndsWith.endsWith;
// Mock the RequestServerForService class
@RunWith(AndroidJUnit4ClassRunner.class)
@LargeTest   // large execution time
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EspreTest {
    private static final int SIMULATED_DELAY_MS = 1000;
    @Rule   // needed to launch the activity
    public ActivityScenarioRule<LoginPage> activityRule = new ActivityScenarioRule<>(LoginPage.class);



    /**
     * Start the server and run this test
     */
    @Test
    public void Aloginreading(){
        String testString = "hello";
        String resultString = "hello";
        // Type in testString and send request
        onView(withId(R.id.editTextTextPersonName))
                .perform(typeText(testString), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());

        // Put thread to sleep to allow volley to handle the request
        try {
            Thread.sleep(SIMULATED_DELAY_MS);
        } catch (InterruptedException e) {
        }
        onView(withText("OK")).inRoot(isDialog())
                .check(matches(isDisplayed()))
                .perform(click());

        // Verify that volley returned the correct value
        onView(withId(R.id.textView)).check(matches(withText(endsWith(resultString))));

    }

    @Test
    public void BloginTest(){
        String testString = "jeremy";
        String resultString = "pass";
        // Type in testString and send request
        onView(withId(R.id.editTextTextPersonName))
                .perform(typeText(testString), closeSoftKeyboard());
        onView(withId(R.id.editTextTextPassword))
                .perform(typeText(resultString), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());

        // Put thread to sleep to allow volley to handle the request
        try {
            Thread.sleep(SIMULATED_DELAY_MS);
        } catch (InterruptedException e) {
        }

        onView(withId(R.id.logout)).perform(click());





    }


}
