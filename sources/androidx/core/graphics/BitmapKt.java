package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapKt {
    public static final Bitmap applyCanvas(Bitmap bitmap, Function1<? super Canvas, Unit> function1) {
        function1.invoke(new Canvas(bitmap));
        return bitmap;
    }

    public static final boolean contains(Bitmap bitmap, Point point) {
        int i;
        int width = bitmap.getWidth();
        int i4 = point.x;
        return i4 >= 0 && i4 < width && (i = point.y) >= 0 && i < bitmap.getHeight();
    }

    public static final Bitmap createBitmap(int i, int i4, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i4, config);
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i, int i4, Bitmap.Config config, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return Bitmap.createBitmap(i, i4, config);
    }

    public static final int get(Bitmap bitmap, int i, int i4) {
        return bitmap.getPixel(i, i4);
    }

    public static final Bitmap scale(Bitmap bitmap, int i, int i4, boolean z4) {
        return Bitmap.createScaledBitmap(bitmap, i, i4, z4);
    }

    public static /* synthetic */ Bitmap scale$default(Bitmap bitmap, int i, int i4, boolean z4, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            z4 = true;
        }
        return Bitmap.createScaledBitmap(bitmap, i, i4, z4);
    }

    public static final void set(Bitmap bitmap, int i, int i4, @ColorInt int i6) {
        bitmap.setPixel(i, i4, i6);
    }

    public static final boolean contains(Bitmap bitmap, PointF pointF) {
        float f = pointF.x;
        if (f < 0.0f || f >= bitmap.getWidth()) {
            return false;
        }
        float f3 = pointF.y;
        return f3 >= 0.0f && f3 < ((float) bitmap.getHeight());
    }

    @RequiresApi(26)
    public static final Bitmap createBitmap(int i, int i4, Bitmap.Config config, boolean z4, ColorSpace colorSpace) {
        return Bitmap.createBitmap(i, i4, config, z4, colorSpace);
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i, int i4, Bitmap.Config config, boolean z4, ColorSpace colorSpace, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i6 & 8) != 0) {
            z4 = true;
        }
        if ((i6 & 16) != 0) {
            ColorSpace.Named unused = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return Bitmap.createBitmap(i, i4, config, z4, colorSpace);
    }
}
