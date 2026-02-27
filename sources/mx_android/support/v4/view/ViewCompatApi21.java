package mx_android.support.v4.view;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes7.dex */
class ViewCompatApi21 {
    ViewCompatApi21() {
    }

    public static void setTransitionName(View view, String str) {
        view.setTransitionName(str);
    }

    public static String getTransitionName(View view) {
        return view.getTransitionName();
    }

    public static void requestApplyInsets(View view) {
        view.requestApplyInsets();
    }

    public static void setElevation(View view, float f) {
        view.setElevation(f);
    }

    public static float getElevation(View view) {
        return view.getElevation();
    }

    public static void setTranslationZ(View view, float f) {
        view.setTranslationZ(f);
    }

    public static float getTranslationZ(View view) {
        return view.getTranslationZ();
    }

    public static void setOnApplyWindowInsetsListener(View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: mx_android.support.v4.view.ViewCompatApi21.1
            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return ((WindowInsetsCompatApi21) onApplyWindowInsetsListener.onApplyWindowInsets(view2, new WindowInsetsCompatApi21(windowInsets))).unwrap();
            }
        });
    }

    public static boolean isImportantForAccessibility(View view) {
        return view.isImportantForAccessibility();
    }
}
