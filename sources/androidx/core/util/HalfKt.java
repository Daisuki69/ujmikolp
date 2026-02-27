package androidx.core.util;

import android.util.Half;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class HalfKt {
    @RequiresApi(26)
    public static final Half toHalf(short s9) {
        return Half.valueOf(s9);
    }

    @RequiresApi(26)
    public static final Half toHalf(float f) {
        return Half.valueOf(f);
    }

    @RequiresApi(26)
    public static final Half toHalf(String str) {
        return Half.valueOf(str);
    }

    @RequiresApi(26)
    public static final Half toHalf(double d10) {
        return Half.valueOf((float) d10);
    }
}
