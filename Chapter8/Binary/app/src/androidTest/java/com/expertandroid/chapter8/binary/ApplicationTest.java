package com.expertandroid.chapter8.binary;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.GeneralLocation;
import android.support.test.espresso.action.GeneralSwipeAction;
import android.support.test.espresso.action.Press;
import android.support.test.espresso.action.Swipe;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.allOf;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ApplicationTest {


    @Rule
    public ActivityTestRule<MainActivity> mActivity =
            new ActivityTestRule<>(MainActivity.class);

//    @Rule
//    public EnableTestTracing mEnableTestTracing = new EnableTestTracing();
//
//    @Rule
//    public EnablePostTestDumpsys mEnablePostTestDumpsys = new EnablePostTestDumpsys();
//
//    @Rule
//    public EnableLogcatDump mEnableLogcatDump = new EnableLogcatDump();
//
//    @Rule
//    public EnableNetStatsDump mEnableNetStatsDump = new EnableNetStatsDump();

    @Test
    public void calculateBinary() throws Exception {
        // type the number
        onView(allOf(withId(R.id.binaryNumberEditText), isDisplayed())).perform(typeText("111"));

        Espresso.closeSoftKeyboard();//
        // perform the click
        onView(withId(R.id.fab)).perform(click());
        
        // check the output
        onView(withText("7")).check(matches(isDisplayed()));
    }

    @Test
    public void calculateDecimal() throws Exception {
        onView(withId(R.id.container)).perform(new GeneralSwipeAction(Swipe.FAST, GeneralLocation.CENTER_RIGHT,
                GeneralLocation.CENTER_LEFT, Press.FINGER));

        // type the number
        onView(allOf(withId(R.id.decimalNumberEditText), isDisplayed())).perform(typeText("7"));

        Espresso.closeSoftKeyboard();//
        // perform the click
        onView(withId(R.id.fab)).perform(click());

        // check the output
        onView(withText("111")).check(matches(isDisplayed()));
    }
}