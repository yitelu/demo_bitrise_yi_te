package com.yitelu.demo_bitrise_yi_te

/*
* Author: Yi Te Lu
* Purpose: for demo purpose only
* Contact email: yitelu@gmail.com
* LinkedIn profile: https://www.linkedin.com/in/yi-te-lu-28370828/
* */

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondActivityTest {

    @get: Rule
    val activityRule = ActivityScenarioRule(SecondActivity::class.java)

    @Test
    fun test_second_activity_launch() {
        onView(withId(R.id.second)).check(matches(isDisplayed()))
    }

    @Test
    fun test_second_activity_title_text() {
        onView(withId(R.id.tvTitleText)).check(matches(withText(R.string.hello)))
    }





}