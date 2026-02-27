package mx_android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: loaded from: classes7.dex */
class RoundedBitmapDrawable21 extends RoundedBitmapDrawable {
    protected RoundedBitmapDrawable21(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        updateDstRect();
        outline.setRoundRect(this.mDstRect, getCornerRadius());
    }

    @Override // mx_android.support.v4.graphics.drawable.RoundedBitmapDrawable
    public void setMipMap(boolean z4) {
        if (this.mBitmap != null) {
            this.mBitmap.setHasMipMap(z4);
            invalidateSelf();
        }
    }

    @Override // mx_android.support.v4.graphics.drawable.RoundedBitmapDrawable
    public boolean hasMipMap() {
        return this.mBitmap != null && this.mBitmap.hasMipMap();
    }

    @Override // mx_android.support.v4.graphics.drawable.RoundedBitmapDrawable
    void gravityCompatApply(int i, int i4, int i6, Rect rect, Rect rect2) {
        Gravity.apply(i, i4, i6, rect, rect2, 0);
    }
}
