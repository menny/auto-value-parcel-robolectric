package com.example.menny.roboautovalue;

import android.os.Parcel;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 18)
public class TestModelTest {

    @Test
    public void testParcel() {
        TestModel testModel = TestModel.create("String 1", "string2");

        Parcel p = Parcel.obtain();
        p.writeParcelable(testModel, 0);
        p.setDataPosition(0);
        TestModel value = p.readParcelable(testModel.getClass().getClassLoader());
        p.recycle();

        Assert.assertEquals(testModel, value);
    }
}