package androidx.navigation;

import android.app.Activity;
import androidx.annotation.IdRes;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityKt {
    public static final NavController findNavController(Activity activity, @IdRes int i) {
        j.g(activity, "<this>");
        return Navigation.findNavController(activity, i);
    }
}
