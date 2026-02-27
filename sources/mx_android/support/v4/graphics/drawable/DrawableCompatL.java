package mx_android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
class DrawableCompatL {
    DrawableCompatL() {
    }

    public static void setHotspot(Drawable drawable, float f, float f3) {
        drawable.setHotspot(f, f3);
    }

    public static void setHotspotBounds(Drawable drawable, int i, int i4, int i6, int i10) {
        drawable.setHotspotBounds(i, i4, i6, i10);
    }

    public static void setTint(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void setTintList(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }
}
