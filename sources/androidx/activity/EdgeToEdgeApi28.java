package androidx.activity;

import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
class EdgeToEdgeApi28 extends EdgeToEdgeApi26 {
    @Override // androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void adjustLayoutInDisplayCutoutMode(Window window) {
        kotlin.jvm.internal.j.g(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 1;
    }
}
