package androidx.window.layout;

import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.WindowInsetsCompat;
import androidx.window.core.Bounds;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowMetrics {
    private final Bounds _bounds;
    private final WindowInsetsCompat _windowInsetsCompat;

    public WindowMetrics(Bounds _bounds, WindowInsetsCompat _windowInsetsCompat) {
        j.g(_bounds, "_bounds");
        j.g(_windowInsetsCompat, "_windowInsetsCompat");
        this._bounds = _bounds;
        this._windowInsetsCompat = _windowInsetsCompat;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!WindowMetrics.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j.e(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        WindowMetrics windowMetrics = (WindowMetrics) obj;
        return j.b(this._bounds, windowMetrics._bounds) && j.b(this._windowInsetsCompat, windowMetrics._windowInsetsCompat);
    }

    public final Rect getBounds() {
        return this._bounds.toRect();
    }

    @RequiresApi(30)
    @ExperimentalWindowApi
    public final WindowInsetsCompat getWindowInsets() {
        return this._windowInsetsCompat;
    }

    public int hashCode() {
        return this._windowInsetsCompat.hashCode() + (this._bounds.hashCode() * 31);
    }

    public String toString() {
        return "WindowMetrics( bounds=" + this._bounds + ", windowInsetsCompat=" + this._windowInsetsCompat + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WindowMetrics(Rect rect, WindowInsetsCompat windowInsetsCompat, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            windowInsetsCompat = new WindowInsetsCompat.Builder().build();
            j.f(windowInsetsCompat, "Builder().build()");
        }
        this(rect, windowInsetsCompat);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WindowMetrics(Rect bounds, WindowInsetsCompat insets) {
        this(new Bounds(bounds), insets);
        j.g(bounds, "bounds");
        j.g(insets, "insets");
    }
}
