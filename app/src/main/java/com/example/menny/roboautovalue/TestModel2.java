package com.example.menny.roboautovalue;

import android.os.Parcelable;

import java.util.Arrays;
import java.util.List;

public abstract class TestModel2 implements Parcelable {
    public static TestModel2 create(String... strings) {
        return new AutoValue_TestModel2(Arrays.asList(strings));
    }

    public abstract List<String> strings();
}
