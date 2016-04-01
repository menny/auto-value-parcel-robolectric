package com.example.menny.roboautovalue;

import android.os.Parcel;

import java.util.List;

final class AutoValue_TestModel2 extends XAutoValue_TestModel2 {
  public static final Creator<AutoValue_TestModel2> CREATOR = new Creator<AutoValue_TestModel2>() {
    @Override
    public AutoValue_TestModel2 createFromParcel(Parcel in) {
      ClassLoader cl = AutoValue_TestModel2.class.getClassLoader();
      return new AutoValue_TestModel2(
          (List<String>) in.readArrayList(cl)
      );
    }
    @Override
    public AutoValue_TestModel2[] newArray(int size) {
      return new AutoValue_TestModel2[size];
    }
  };

  AutoValue_TestModel2(List<String> strings) {
    super(strings);
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeList(strings());
  }

  @Override
  public int describeContents() {
    return 0;
  }
}
