package androidx.window.layout.util;

import android.app.Activity;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(24)
public final class ActivityCompatHelperApi24 {
    public static final ActivityCompatHelperApi24 INSTANCE = new ActivityCompatHelperApi24();

    private ActivityCompatHelperApi24() {
    }

    public final boolean isInMultiWindowMode(Activity activity) {
        j.g(activity, "activity");
        return activity.isInMultiWindowMode();
    }
}
