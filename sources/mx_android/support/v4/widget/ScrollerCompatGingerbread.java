package mx_android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes7.dex */
class ScrollerCompatGingerbread {
    ScrollerCompatGingerbread() {
    }

    public static Object createScroller(Context context, Interpolator interpolator) {
        return interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    public static boolean isFinished(Object obj) {
        return ((OverScroller) obj).isFinished();
    }

    public static int getCurrX(Object obj) {
        return ((OverScroller) obj).getCurrX();
    }

    public static int getCurrY(Object obj) {
        return ((OverScroller) obj).getCurrY();
    }

    public static boolean computeScrollOffset(Object obj) {
        return ((OverScroller) obj).computeScrollOffset();
    }

    public static void startScroll(Object obj, int i, int i4, int i6, int i10) {
        ((OverScroller) obj).startScroll(i, i4, i6, i10);
    }

    public static void startScroll(Object obj, int i, int i4, int i6, int i10, int i11) {
        ((OverScroller) obj).startScroll(i, i4, i6, i10, i11);
    }

    public static void fling(Object obj, int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14) {
        ((OverScroller) obj).fling(i, i4, i6, i10, i11, i12, i13, i14);
    }

    public static void fling(Object obj, int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        ((OverScroller) obj).fling(i, i4, i6, i10, i11, i12, i13, i14, i15, i16);
    }

    public static void abortAnimation(Object obj) {
        ((OverScroller) obj).abortAnimation();
    }

    public static void notifyHorizontalEdgeReached(Object obj, int i, int i4, int i6) {
        ((OverScroller) obj).notifyHorizontalEdgeReached(i, i4, i6);
    }

    public static void notifyVerticalEdgeReached(Object obj, int i, int i4, int i6) {
        ((OverScroller) obj).notifyVerticalEdgeReached(i, i4, i6);
    }

    public static boolean isOverScrolled(Object obj) {
        return ((OverScroller) obj).isOverScrolled();
    }

    public static int getFinalX(Object obj) {
        return ((OverScroller) obj).getFinalX();
    }

    public static int getFinalY(Object obj) {
        return ((OverScroller) obj).getFinalY();
    }
}
