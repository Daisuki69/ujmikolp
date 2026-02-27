package androidx.activity.result;

import android.content.Intent;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityResultKt {
    public static final int component1(ActivityResult activityResult) {
        j.g(activityResult, "<this>");
        return activityResult.getResultCode();
    }

    public static final Intent component2(ActivityResult activityResult) {
        j.g(activityResult, "<this>");
        return activityResult.getData();
    }
}
