package com.example.menny.roboautovalue;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

import java.util.Arrays;
import java.util.List;

@AutoValue
public abstract class TestModel implements Parcelable {
    public abstract List<String> strings();

    public static TestModel create(String... strings) {
        return new AutoValue_TestModel(Arrays.asList(strings));
    }
}
