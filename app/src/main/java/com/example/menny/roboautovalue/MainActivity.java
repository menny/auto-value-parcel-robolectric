package com.example.menny.roboautovalue;

import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        testParcel();
        testParcel2();
        testParcelC();
    }

    public static void testParcel() {
        TestModel testModel = TestModel.create("string1", "string2");

        Parcel p = Parcel.obtain();
        p.writeParcelable(testModel, 0);
        p.setDataPosition(0);
        TestModel value = p.readParcelable(testModel.getClass().getClassLoader());
        p.recycle();

        if (!value.equals(testModel)) throw new RuntimeException();
    }

    public static void testParcel2() {
        TestModel2 testModel = TestModel2.create("string1", "string2");

        Parcel p = Parcel.obtain();
        p.writeParcelable(testModel, 0);
        p.setDataPosition(0);
        TestModel2 value = p.readParcelable(testModel.getClass().getClassLoader());
        p.recycle();

        if (!value.equals(testModel)) throw new RuntimeException();
    }

    public static void testParcelC() {
        ConcreteModel testModel = new ConcreteModel("string 1", "String 2");

        Parcel p = Parcel.obtain();
        p.writeParcelable(testModel, 0);
        p.setDataPosition(0);
        ConcreteModel value = p.readParcelable(testModel.getClass().getClassLoader());
        p.recycle();

        if (!value.equals(testModel)) throw new RuntimeException();
    }
}
