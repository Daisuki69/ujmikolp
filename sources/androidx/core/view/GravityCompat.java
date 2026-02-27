package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: loaded from: classes.dex */
public final class GravityCompat {
    public static final int END = 8388613;
    public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = 8388615;
    public static final int RELATIVE_LAYOUT_DIRECTION = 8388608;
    public static final int START = 8388611;

    private GravityCompat() {
    }

    public static void apply(int i, int i4, int i6, Rect rect, Rect rect2, int i10) {
        Gravity.apply(i, i4, i6, rect, rect2, i10);
    }

    public static void applyDisplay(int i, Rect rect, Rect rect2, int i4) {
        Gravity.applyDisplay(i, rect, rect2, i4);
    }

    public static int getAbsoluteGravity(int i, int i4) {
        return Gravity.getAbsoluteGravity(i, i4);
    }

    public static void apply(int i, int i4, int i6, Rect rect, int i10, int i11, Rect rect2, int i12) {
        Gravity.apply(i, i4, i6, rect, i10, i11, rect2, i12);
    }
}
