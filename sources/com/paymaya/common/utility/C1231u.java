package com.paymaya.common.utility;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.math.BigDecimal;

/* JADX INFO: renamed from: com.paymaya.common.utility.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1231u implements We.M {
    @Override // We.M
    public final String a() {
        return TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE;
    }

    @Override // We.M
    public final Bitmap b(Bitmap bitmap) {
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - iMin) / 2, (bitmap.getHeight() - iMin) / 2, iMin, iMin);
        if (!bitmapCreateBitmap.equals(bitmap)) {
            bitmap.recycle();
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iMin, iMin, bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(((long) iMin) / 2);
        canvas.drawCircle(bigDecimalValueOf.floatValue(), bigDecimalValueOf.floatValue(), bigDecimalValueOf.floatValue(), paint);
        bitmapCreateBitmap.recycle();
        return bitmapCreateBitmap2;
    }
}
