package com.yitelu.demo_bitrise_yi_te

/*
* Author: Yi Te Lu
* Purpose: for demo purpose only
* Contact email: yitelu@gmail.com
* LinkedIn profile: https://www.linkedin.com/in/yi-te-lu-28370828/
* */

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    MainActivityTest::class,
    SecondActivityTest::class
)
class TestSuite