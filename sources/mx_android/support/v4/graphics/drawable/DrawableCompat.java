package mx_android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes7.dex */
public class DrawableCompat {
    static final DrawableImpl IMPL;

    interface DrawableImpl {
        boolean isAutoMirrored(Drawable drawable);

        void jumpToCurrentState(Drawable drawable);

        void setAutoMirrored(Drawable drawable, boolean z4);

        void setHotspot(Drawable drawable, float f, float f3);

        void setHotspotBounds(Drawable drawable, int i, int i4, int i6, int i10);

        void setTint(Drawable drawable, int i);

        void setTintList(Drawable drawable, ColorStateList colorStateList);

        void setTintMode(Drawable drawable, PorterDuff.Mode mode);
    }

    static class BaseDrawableImpl implements DrawableImpl {
        @Override // mx_android.support.v4.graphics.drawable.DrawableCompat.DrawableImpl
        public boolean isAutoMirrored(Drawable drawable) {
            return false;
        }

        @Override // mx_android.support.v4.graphics.drawable.DrawableCompat.DrawableImpl
        public void jumpToCurrentState(Drawable drawable) {
        }

        @Override // mx_android.support.v4.graphics.drawable.DrawableCompat.DrawableImpl
        public void setAutoMirrored(Drawable drawable, boolean z4) {
        }

        @Override // mx_android.support.v4.graphics.drawable.DrawableCompat.DrawableImpl
        public void setHotspot(Drawable drawable, float f, float f3) {
        }

        @Override // mx_android.support.v4.graphics.drawable.DrawableCompat.DrawableImpl
        public void setHotspotBounds(Drawable drawable, int i, int i4, int i6, int i10) {
        }

        @Override // mx_android.support.v4.graphics.drawable.DrawableCompat.DrawableImpl
        public void setTint(Drawable drawable, int i) {
        }

        @Override // mx_android.support.v4.graphics.drawable.DrawableCompat.DrawableImpl
        public void setTintList(Drawable drawable, ColorStateList colorStateList) {
        }

        @Override // mx_android.support.v4.graphics.drawable.DrawableCompat.DrawableImpl
        public void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
        }

        BaseDrawableImpl() {
        }
    }

    static class HoneycombDrawableImpl extends BaseDrawableImpl {
        HoneycombDrawableImpl() {
        }

        @Override // mx_android.support.v4.graphics.drawable.DrawableCompat.BaseDrawableImpl, mx_android.support.v4.graphics.drawable.DrawableCompat.DrawableImpl
        public void jumpToCurrentState(Drawable drawable) {
            DrawableCompatHoneycomb.jumpToCurrentState(drawable);
        }
    }

    static class KitKatDrawableImpl extends HoneycombDrawableImpl {
        KitKatDrawableImpl() {
        }

        @Override // mx_android.support.v4.graphics.drawable.DrawableCompat.BaseDrawableImpl, mx_android.support.v4.graphics.drawable.DrawableCompat.DrawableImpl
        public void setAutoMirrored(Drawable drawable, boolean z4) {
            DrawableCompatKitKat.setAutoMirrored(drawable, z4);
        }

        @Override // mx_android.support.v4.graphics.drawable.DrawableCompat.BaseDrawableImpl, mx_android.support.v4.graphics.drawable.DrawableCompat.DrawableImpl
        public boolean isAutoMirrored(Drawable drawable) {
            return DrawableCompatKitKat.isAutoMirrored(drawable);
        }
    }

    static class LDrawableImpl extends KitKatDrawableImpl {
        LDrawableImpl() {
        }

        @Override // mx_android.support.v4.graphics.drawable.DrawableCompat.BaseDrawableImpl, mx_android.support.v4.graphics.drawable.DrawableCompat.DrawableImpl
        public void setHotspot(Drawable drawable, float f, float f3) {
            DrawableCompatL.setHotspot(drawable, f, f3);
        }

        @Override // mx_android.support.v4.graphics.drawable.DrawableCompat.BaseDrawableImpl, mx_android.support.v4.graphics.drawable.DrawableCompat.DrawableImpl
        public void setHotspotBounds(Drawable drawable, int i, int i4, int i6, int i10) {
            DrawableCompatL.setHotspotBounds(drawable, i, i4, i6, i10);
        }

        @Override // mx_android.support.v4.graphics.drawable.DrawableCompat.BaseDrawableImpl, mx_android.support.v4.graphics.drawable.DrawableCompat.DrawableImpl
        public void setTint(Drawable drawable, int i) {
            DrawableCompatL.setTint(drawable, i);
        }

        @Override // mx_android.support.v4.graphics.drawable.DrawableCompat.BaseDrawableImpl, mx_android.support.v4.graphics.drawable.DrawableCompat.DrawableImpl
        public void setTintList(Drawable drawable, ColorStateList colorStateList) {
            DrawableCompatL.setTintList(drawable, colorStateList);
        }

        @Override // mx_android.support.v4.graphics.drawable.DrawableCompat.BaseDrawableImpl, mx_android.support.v4.graphics.drawable.DrawableCompat.DrawableImpl
        public void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
            DrawableCompatL.setTintMode(drawable, mode);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            IMPL = new LDrawableImpl();
            return;
        }
        if (i >= 19) {
            IMPL = new KitKatDrawableImpl();
        } else if (i >= 11) {
            IMPL = new HoneycombDrawableImpl();
        } else {
            IMPL = new BaseDrawableImpl();
        }
    }

    public static void jumpToCurrentState(Drawable drawable) {
        IMPL.jumpToCurrentState(drawable);
    }

    public static void setAutoMirrored(Drawable drawable, boolean z4) {
        IMPL.setAutoMirrored(drawable, z4);
    }

    public static boolean isAutoMirrored(Drawable drawable) {
        return IMPL.isAutoMirrored(drawable);
    }

    public static void setHotspot(Drawable drawable, float f, float f3) {
        IMPL.setHotspot(drawable, f, f3);
    }

    public static void setHotspotBounds(Drawable drawable, int i, int i4, int i6, int i10) {
        IMPL.setHotspotBounds(drawable, i, i4, i6, i10);
    }

    public static void setTint(Drawable drawable, int i) {
        IMPL.setTint(drawable, i);
    }

    public static void setTintList(Drawable drawable, ColorStateList colorStateList) {
        IMPL.setTintList(drawable, colorStateList);
    }

    public static void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
        IMPL.setTintMode(drawable, mode);
    }
}
