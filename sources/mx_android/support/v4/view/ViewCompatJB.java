package mx_android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes7.dex */
class ViewCompatJB {
    ViewCompatJB() {
    }

    public static boolean hasTransientState(View view) {
        return view.hasTransientState();
    }

    public static void setHasTransientState(View view, boolean z4) {
        view.setHasTransientState(z4);
    }

    public static void postInvalidateOnAnimation(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void postInvalidateOnAnimation(View view, int i, int i4, int i6, int i10) {
        view.postInvalidate(i, i4, i6, i10);
    }

    public static void postOnAnimation(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void postOnAnimationDelayed(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static int getImportantForAccessibility(View view) {
        return view.getImportantForAccessibility();
    }

    public static void setImportantForAccessibility(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public static Object getAccessibilityNodeProvider(View view) {
        return view.getAccessibilityNodeProvider();
    }

    public static ViewParent getParentForAccessibility(View view) {
        return view.getParentForAccessibility();
    }

    public static int getMinimumWidth(View view) {
        return view.getMinimumWidth();
    }

    public static int getMinimumHeight(View view) {
        return view.getMinimumHeight();
    }

    public static void requestApplyInsets(View view) {
        view.requestFitSystemWindows();
    }

    public static boolean getFitsSystemWindows(View view) {
        return view.getFitsSystemWindows();
    }
}
