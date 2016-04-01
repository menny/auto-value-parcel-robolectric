package com.example.menny.roboautovalue;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Arrays;
import java.util.List;

public class ConcreteModel implements Parcelable {

    public static final Creator<ConcreteModel> CREATOR = new Creator<ConcreteModel>() {
        @Override
        public ConcreteModel createFromParcel(Parcel in) {
            return new ConcreteModel(in);
        }

        @Override
        public ConcreteModel[] newArray(int size) {
            return new ConcreteModel[size];
        }
    };
    private final List<String> strings;

    public ConcreteModel(String... strings) {
        this.strings = Arrays.asList(strings);
    }
    protected ConcreteModel(Parcel in) {
        strings = (List<String>) in.readArrayList(getClass().getClassLoader());
    }

    public List<String> strings() {
        return strings;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(strings());
    }

    @Override
    public boolean equals(Object o) {
        ConcreteModel other = (ConcreteModel) o;
        return other.strings.equals(strings);
    }

    @Override
    public int hashCode() {
        return strings.hashCode();
    }
}
