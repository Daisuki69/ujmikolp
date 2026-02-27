package mx_android.support.v7.internal.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
class TintDrawableWrapper extends DrawableWrapper {
    private int mCurrentColor;
    private final PorterDuff.Mode mTintMode;
    private final ColorStateList mTintStateList;

    public TintDrawableWrapper(Drawable drawable, ColorStateList colorStateList) {
        this(drawable, colorStateList, TintManager.DEFAULT_MODE);
    }

    public TintDrawableWrapper(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        super(drawable);
        this.mTintStateList = colorStateList;
        this.mTintMode = mode;
    }

    @Override // mx_android.support.v7.internal.widget.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.mTintStateList;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // mx_android.support.v7.internal.widget.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return updateTint(iArr) || super.setState(iArr);
    }

    private boolean updateTint(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.mTintStateList;
        if (colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.mCurrentColor)) == this.mCurrentColor) {
            return false;
        }
        if (colorForState != 0) {
            setColorFilter(colorForState, this.mTintMode);
        } else {
            clearColorFilter();
        }
        this.mCurrentColor = colorForState;
        return true;
    }
}
