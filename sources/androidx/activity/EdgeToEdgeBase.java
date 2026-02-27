package androidx.activity;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
class EdgeToEdgeBase implements EdgeToEdgeImpl {
    @Override // androidx.activity.EdgeToEdgeImpl
    public void adjustLayoutInDisplayCutoutMode(Window window) {
        kotlin.jvm.internal.j.g(window, "window");
    }

    @Override // androidx.activity.EdgeToEdgeImpl
    public void setUp(SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle, Window window, View view, boolean z4, boolean z5) {
        kotlin.jvm.internal.j.g(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.j.g(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.j.g(window, "window");
        kotlin.jvm.internal.j.g(view, "view");
    }
}
