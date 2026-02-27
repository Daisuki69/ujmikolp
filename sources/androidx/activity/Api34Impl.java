package androidx.activity;

import android.window.BackEvent;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(34)
public final class Api34Impl {
    public static final Api34Impl INSTANCE = new Api34Impl();

    private Api34Impl() {
    }

    public final BackEvent createOnBackEvent(float f, float f3, float f7, int i) {
        return new BackEvent(f, f3, f7, i);
    }

    public final float progress(BackEvent backEvent) {
        kotlin.jvm.internal.j.g(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int swipeEdge(BackEvent backEvent) {
        kotlin.jvm.internal.j.g(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float touchX(BackEvent backEvent) {
        kotlin.jvm.internal.j.g(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float touchY(BackEvent backEvent) {
        kotlin.jvm.internal.j.g(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
