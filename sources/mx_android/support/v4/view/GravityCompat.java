package mx_android.support.v4.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* JADX INFO: loaded from: classes7.dex */
public class GravityCompat {
    public static final int END = 8388613;
    static final GravityCompatImpl IMPL;
    public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = 8388615;
    public static final int RELATIVE_LAYOUT_DIRECTION = 8388608;
    public static final int START = 8388611;

    interface GravityCompatImpl {
        void apply(int i, int i4, int i6, Rect rect, int i10, int i11, Rect rect2, int i12);

        void apply(int i, int i4, int i6, Rect rect, Rect rect2, int i10);

        void applyDisplay(int i, Rect rect, Rect rect2, int i4);

        int getAbsoluteGravity(int i, int i4);
    }

    static class GravityCompatImplBase implements GravityCompatImpl {
        @Override // mx_android.support.v4.view.GravityCompat.GravityCompatImpl
        public int getAbsoluteGravity(int i, int i4) {
            return i & (-8388609);
        }

        GravityCompatImplBase() {
        }

        @Override // mx_android.support.v4.view.GravityCompat.GravityCompatImpl
        public void apply(int i, int i4, int i6, Rect rect, Rect rect2, int i10) {
            Gravity.apply(i, i4, i6, rect, rect2);
        }

        @Override // mx_android.support.v4.view.GravityCompat.GravityCompatImpl
        public void apply(int i, int i4, int i6, Rect rect, int i10, int i11, Rect rect2, int i12) {
            Gravity.apply(i, i4, i6, rect, i10, i11, rect2);
        }

        @Override // mx_android.support.v4.view.GravityCompat.GravityCompatImpl
        public void applyDisplay(int i, Rect rect, Rect rect2, int i4) {
            Gravity.applyDisplay(i, rect, rect2);
        }
    }

    static class GravityCompatImplJellybeanMr1 implements GravityCompatImpl {
        GravityCompatImplJellybeanMr1() {
        }

        @Override // mx_android.support.v4.view.GravityCompat.GravityCompatImpl
        public int getAbsoluteGravity(int i, int i4) {
            return GravityCompatJellybeanMr1.getAbsoluteGravity(i, i4);
        }

        @Override // mx_android.support.v4.view.GravityCompat.GravityCompatImpl
        public void apply(int i, int i4, int i6, Rect rect, Rect rect2, int i10) {
            GravityCompatJellybeanMr1.apply(i, i4, i6, rect, rect2, i10);
        }

        @Override // mx_android.support.v4.view.GravityCompat.GravityCompatImpl
        public void apply(int i, int i4, int i6, Rect rect, int i10, int i11, Rect rect2, int i12) {
            GravityCompatJellybeanMr1.apply(i, i4, i6, rect, i10, i11, rect2, i12);
        }

        @Override // mx_android.support.v4.view.GravityCompat.GravityCompatImpl
        public void applyDisplay(int i, Rect rect, Rect rect2, int i4) {
            GravityCompatJellybeanMr1.applyDisplay(i, rect, rect2, i4);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            IMPL = new GravityCompatImplJellybeanMr1();
        } else {
            IMPL = new GravityCompatImplBase();
        }
    }

    public static void apply(int i, int i4, int i6, Rect rect, Rect rect2, int i10) {
        IMPL.apply(i, i4, i6, rect, rect2, i10);
    }

    public static void apply(int i, int i4, int i6, Rect rect, int i10, int i11, Rect rect2, int i12) {
        IMPL.apply(i, i4, i6, rect, i10, i11, rect2, i12);
    }

    public static void applyDisplay(int i, Rect rect, Rect rect2, int i4) {
        IMPL.applyDisplay(i, rect, rect2, i4);
    }

    public static int getAbsoluteGravity(int i, int i4) {
        return IMPL.getAbsoluteGravity(i, i4);
    }
}
