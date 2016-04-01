# auto-value-parcel-robolectric
Sample app that shows Robolectric and Auto-Value-Parcel mismatch?

## Building
`./gradlew assembleDebug`

## Install on connected
`./gradlew installDebug`

Running on a device, the app will not crash.

## Running Robolectric unit-tests
`./gradlew testDebug`

Unit tests fails with:
```
android.os.BadParcelableException: IllegalAccessException when unmarshalling: com.example.menny.roboautovalue.AutoValue_TestModel
	at android.os.Parcel.readParcelableCreator(Parcel.java:2099)
	at android.os.Parcel.readParcelable(Parcel.java:2055)
	at com.example.menny.roboautovalue.TestModelTest.testParcel(TestModelTest.java:22)
```
