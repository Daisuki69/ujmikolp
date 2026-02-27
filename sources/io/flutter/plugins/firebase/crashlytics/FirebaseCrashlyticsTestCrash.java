package io.flutter.plugins.firebase.crashlytics;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FirebaseCrashlyticsTestCrash extends RuntimeException {
    public FirebaseCrashlyticsTestCrash() {
        super("This is a test crash caused by calling .crash() in Dart.");
    }
}
