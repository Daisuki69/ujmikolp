package mx_android.support.v4.view;

import android.view.ScaleGestureDetector;

/* JADX INFO: loaded from: classes7.dex */
class ScaleGestureDetectorCompatKitKat {
    private ScaleGestureDetectorCompatKitKat() {
    }

    public static void setQuickScaleEnabled(Object obj, boolean z4) {
        ((ScaleGestureDetector) obj).setQuickScaleEnabled(z4);
    }

    public static boolean isQuickScaleEnabled(Object obj) {
        return ((ScaleGestureDetector) obj).isQuickScaleEnabled();
    }
}
