package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.WindowInsetsCompat;
import androidx.window.core.Bounds;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public interface WindowMetricsCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static Function1<? super WindowMetricsCalculator, ? extends WindowMetricsCalculator> decorator = WindowMetricsCalculator$Companion$decorator$1.INSTANCE;

        private Companion() {
        }

        public final WindowMetrics fromDisplayMetrics$window_release(DisplayMetrics displayMetrics) {
            j.g(displayMetrics, "displayMetrics");
            Bounds bounds = new Bounds(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
            WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder().build();
            j.f(windowInsetsCompatBuild, "Builder().build()");
            return new WindowMetrics(bounds, windowInsetsCompatBuild);
        }

        public final WindowMetricsCalculator getOrCreate() {
            return (WindowMetricsCalculator) decorator.invoke(WindowMetricsCalculatorCompat.INSTANCE);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void overrideDecorator(WindowMetricsCalculatorDecorator overridingDecorator) {
            j.g(overridingDecorator, "overridingDecorator");
            decorator = new WindowMetricsCalculator$Companion$overrideDecorator$1(overridingDecorator);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void reset() {
            decorator = WindowMetricsCalculator$Companion$reset$1.INSTANCE;
        }

        @RequiresApi(30)
        public final WindowMetrics translateWindowMetrics$window_release(android.view.WindowMetrics windowMetrics) {
            j.g(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            j.f(bounds, "windowMetrics.bounds");
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowMetrics.getWindowInsets());
            j.f(windowInsetsCompat, "toWindowInsetsCompat(windowMetrics.windowInsets)");
            return new WindowMetrics(bounds, windowInsetsCompat);
        }
    }

    WindowMetrics computeCurrentWindowMetrics(Activity activity);

    WindowMetrics computeCurrentWindowMetrics(Context context);

    WindowMetrics computeMaximumWindowMetrics(Activity activity);

    WindowMetrics computeMaximumWindowMetrics(Context context);
}
