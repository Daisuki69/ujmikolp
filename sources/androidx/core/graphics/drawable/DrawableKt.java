package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.Px;

/* JADX INFO: loaded from: classes.dex */
public final class DrawableKt {
    public static final Bitmap toBitmap(Drawable drawable, @Px int i, @Px int i4, Bitmap.Config config) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                return (i == bitmapDrawable.getBitmap().getWidth() && i4 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i4, true);
            }
        }
        Rect bounds = drawable.getBounds();
        int i6 = bounds.left;
        int i10 = bounds.top;
        int i11 = bounds.right;
        int i12 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i4, config);
        drawable.setBounds(0, 0, i, i4);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i6, i10, i11, i12);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap toBitmap$default(Drawable drawable, int i, int i4, Bitmap.Config config, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i6 & 2) != 0) {
            i4 = drawable.getIntrinsicHeight();
        }
        if ((i6 & 4) != 0) {
            config = null;
        }
        return toBitmap(drawable, i, i4, config);
    }

    public static final Bitmap toBitmapOrNull(Drawable drawable, @Px int i, @Px int i4, Bitmap.Config config) {
        if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        return toBitmap(drawable, i, i4, config);
    }

    public static /* synthetic */ Bitmap toBitmapOrNull$default(Drawable drawable, int i, int i4, Bitmap.Config config, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i6 & 2) != 0) {
            i4 = drawable.getIntrinsicHeight();
        }
        if ((i6 & 4) != 0) {
            config = null;
        }
        return toBitmapOrNull(drawable, i, i4, config);
    }

    public static final void updateBounds(Drawable drawable, @Px int i, @Px int i4, @Px int i6, @Px int i10) {
        drawable.setBounds(i, i4, i6, i10);
    }

    public static /* synthetic */ void updateBounds$default(Drawable drawable, int i, int i4, int i6, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = drawable.getBounds().left;
        }
        if ((i11 & 2) != 0) {
            i4 = drawable.getBounds().top;
        }
        if ((i11 & 4) != 0) {
            i6 = drawable.getBounds().right;
        }
        if ((i11 & 8) != 0) {
            i10 = drawable.getBounds().bottom;
        }
        updateBounds(drawable, i, i4, i6, i10);
    }
}
