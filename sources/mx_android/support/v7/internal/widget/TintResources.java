package mx_android.support.v7.internal.widget;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
class TintResources extends ResourcesWrapper {
    private final TintManager mTintManager;

    public TintResources(Resources resources, TintManager tintManager) {
        super(resources);
        this.mTintManager = tintManager;
    }

    @Override // mx_android.support.v7.internal.widget.ResourcesWrapper, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        if (drawable != null) {
            this.mTintManager.tintDrawable(i, drawable);
        }
        return drawable;
    }
}
