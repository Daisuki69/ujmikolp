package androidx.window.layout.util;

import android.app.Activity;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(24)
public final class ContextCompatHelperApi24 {
    public static final ContextCompatHelperApi24 INSTANCE = new ContextCompatHelperApi24();

    private ContextCompatHelperApi24() {
    }

    public final boolean isInMultiWindowMode(Activity activity) {
        j.g(activity, "activity");
        return activity.isInMultiWindowMode();
    }
}
