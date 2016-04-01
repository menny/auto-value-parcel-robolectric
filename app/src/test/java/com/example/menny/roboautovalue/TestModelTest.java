package com.example.menny.roboautovalue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 18)
public class TestModelTest {

    @Test
    public void testParcel() {
        MainActivity.testParcel();
    }

    @Test
    public void testParcel2() {
        MainActivity.testParcel2();
    }

    @Test
    public void testParcelC() {
        MainActivity.testParcelC();
    }
}