package mx_android.support.v4.view;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: loaded from: classes7.dex */
class GravityCompatJellybeanMr1 {
    GravityCompatJellybeanMr1() {
    }

    public static int getAbsoluteGravity(int i, int i4) {
        return Gravity.getAbsoluteGravity(i, i4);
    }

    public static void apply(int i, int i4, int i6, Rect rect, Rect rect2, int i10) {
        Gravity.apply(i, i4, i6, rect, rect2, i10);
    }

    public static void apply(int i, int i4, int i6, Rect rect, int i10, int i11, Rect rect2, int i12) {
        Gravity.apply(i, i4, i6, rect, i10, i11, rect2, i12);
    }

    public static void applyDisplay(int i, Rect rect, Rect rect2, int i4) {
        Gravity.applyDisplay(i, rect, rect2, i4);
    }
}
