package mx_android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import mx_android.support.v7.mediarouter.R;

/* JADX INFO: loaded from: classes7.dex */
final class MediaRouterThemeHelper {
    private MediaRouterThemeHelper() {
    }

    public static Context createThemedContext(Context context) {
        return new ContextThemeWrapper(context, isLightTheme(context) ? R.style.Theme_MediaRouter_Light : R.style.Theme_MediaRouter);
    }

    public static int getThemeResource(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static Drawable getThemeDrawable(Context context, int i) {
        int themeResource = getThemeResource(context, i);
        if (themeResource != 0) {
            return context.getResources().getDrawable(themeResource);
        }
        return null;
    }

    private static boolean isLightTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }
}
