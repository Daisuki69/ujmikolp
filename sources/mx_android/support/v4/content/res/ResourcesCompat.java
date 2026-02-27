package mx_android.support.v4.content.res;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes7.dex */
public class ResourcesCompat {
    public static Drawable getDrawable(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return ResourcesCompatApi21.getDrawable(resources, i, theme);
        }
        return resources.getDrawable(i);
    }

    public static Drawable getDrawableForDensity(Resources resources, int i, int i4, Resources.Theme theme) throws Resources.NotFoundException {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 21) {
            return ResourcesCompatApi21.getDrawableForDensity(resources, i, i4, theme);
        }
        if (i6 >= 15) {
            return ResourcesCompatIcsMr1.getDrawableForDensity(resources, i, i4);
        }
        return resources.getDrawable(i);
    }
}
