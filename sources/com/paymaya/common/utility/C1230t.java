package com.paymaya.common.utility;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import java.math.BigDecimal;

/* JADX INFO: renamed from: com.paymaya.common.utility.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1230t implements We.M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11231b;
    public int c = 0;

    public C1230t(int i, int i4) {
        this.f11231b = i;
        this.f11230a = i4;
    }

    @Override // We.M
    public final String a() {
        return "circle_resize";
    }

    @Override // We.M
    public final Bitmap b(Bitmap bitmap) {
        int i;
        int i4;
        double height = ((double) bitmap.getHeight()) / ((double) bitmap.getWidth());
        int i6 = this.f11231b;
        int i10 = this.f11230a;
        if (height > 1.0d) {
            i4 = (int) (((double) i6) / height);
            i = i10;
        } else {
            i = (int) (((double) i10) * height);
            i4 = i6;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i4, i, false);
        if (!bitmapCreateScaledBitmap.equals(bitmap)) {
            bitmap.recycle();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i6, i10, bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rect = new Rect(0, 0, i6, i10);
        Rect rect2 = new Rect(rect);
        rect2.offset((i6 - i4) / 2, (i10 - i) / 2);
        canvas.drawBitmap(bitmapCreateScaledBitmap, rect, rect2, (Paint) null);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i6, i10, bitmap.getConfig());
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(((long) i6) / 2);
        canvas2.drawCircle(bigDecimalValueOf.floatValue(), bigDecimalValueOf.floatValue(), bigDecimalValueOf.floatValue() - this.c, paint);
        bitmapCreateScaledBitmap.recycle();
        bitmapCreateBitmap.recycle();
        return bitmapCreateBitmap2;
    }
}
