package com.yitelu.demo_bitrise_yi_te

/*
* Author: Yi Te Lu
* Purpose: for demo purpose only
* Contact email: yitelu@gmail.com
* LinkedIn profile: https://www.linkedin.com/in/yi-te-lu-28370828/
* */

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{

    @get: Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test_main_activity_launch() {
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    @Test
    fun test_main_activity_welcome_text_visible() {
        onView(withId(R.id.tvTitleText)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }

    @Test
    fun test_main_activity_welcome_text_display() {
        onView(withId(R.id.tvTitleText)).check(matches(withText(R.string.please_enter_your_name)))
    }

    @Test
    fun test_main_activity_button_visible() {
        onView(withId(R.id.btnSubmit)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }

    @Test
    fun test_main_activity_edit_text_visible() {
        onView(withId(R.id.etPersonName)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }

    @Test
    fun test_main_activity_send_text_click_submit_validate_result() {
        onView(withId(R.id.etPersonName)).perform(replaceText("Joe Smith"))
        onView(withId(R.id.btnSubmit)).perform(click())
        onView(withId(R.id.second)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.tvTitleText)).check(matches(withText("hello Joe Smith")))
    }

    @Test
    fun test_main_activity_send_text_then_press_back_button() {
        onView(withId(R.id.etPersonName)).perform(replaceText("Mary Jane"))
        onView(withId(R.id.btnSubmit)).perform(click())
        onView(withId(R.id.second)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.tvTitleText)).check(matches(withText("hello Mary Jane")))
        pressBack()
        onView(withId(R.id.main)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }




}