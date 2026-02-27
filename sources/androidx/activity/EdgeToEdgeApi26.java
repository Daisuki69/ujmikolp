package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
class EdgeToEdgeApi26 extends EdgeToEdgeBase {
    @Override // androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void setUp(SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle, Window window, View view, boolean z4, boolean z5) {
        kotlin.jvm.internal.j.g(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.j.g(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.j.g(window, "window");
        kotlin.jvm.internal.j.g(view, "view");
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(statusBarStyle.getScrim$activity_release(z4));
        window.setNavigationBarColor(navigationBarStyle.getScrim$activity_release(z5));
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, view);
        windowInsetsControllerCompat.setAppearanceLightStatusBars(!z4);
        windowInsetsControllerCompat.setAppearanceLightNavigationBars(!z5);
    }
}
