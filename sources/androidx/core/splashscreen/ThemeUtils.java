package androidx.core.splashscreen;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
public final class ThemeUtils {
    public static final ThemeUtils INSTANCE = new ThemeUtils();

    public static final class Api31 {
        public static final Api31 INSTANCE = new Api31();

        private Api31() {
        }

        @DoNotInline
        public static final void applyThemesSystemBarAppearance(Resources.Theme theme, View decor) {
            j.g(theme, "theme");
            j.g(decor, "decor");
            applyThemesSystemBarAppearance$default(theme, decor, null, 4, null);
        }

        public static /* synthetic */ void applyThemesSystemBarAppearance$default(Resources.Theme theme, View view, TypedValue typedValue, int i, Object obj) {
            if ((i & 4) != 0) {
                typedValue = new TypedValue();
            }
            applyThemesSystemBarAppearance(theme, view, typedValue);
        }

        @DoNotInline
        public static final void applyThemesSystemBarAppearance(Resources.Theme theme, View decor, TypedValue tv) {
            j.g(theme, "theme");
            j.g(decor, "decor");
            j.g(tv, "tv");
            int i = (!theme.resolveAttribute(android.R.attr.windowLightStatusBar, tv, true) || tv.data == 0) ? 0 : 8;
            if (theme.resolveAttribute(android.R.attr.windowLightNavigationBar, tv, true) && tv.data != 0) {
                i |= 16;
            }
            WindowInsetsController windowInsetsController = decor.getWindowInsetsController();
            j.d(windowInsetsController);
            windowInsetsController.setSystemBarsAppearance(i, 24);
        }
    }

    private ThemeUtils() {
    }
}
