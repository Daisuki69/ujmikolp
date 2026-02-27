package com.clevertap.android.sdk.customviews;

import D.S;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class CloseImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9458a;

    public CloseImageView(Context context) {
        super(context);
        this.f9458a = (int) TypedValue.applyDimension(1, 40, getResources().getDisplayMetrics());
        setId(199272);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        try {
            Context context = getContext();
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), context.getResources().getIdentifier("ct_close", "drawable", context.getPackageName()), null);
            if (bitmapDecodeResource == null) {
                S.l("Unable to find inapp notif close button image");
            } else {
                int i = this.f9458a;
                canvas.drawBitmap(Bitmap.createScaledBitmap(bitmapDecodeResource, i, i, true), 0.0f, 0.0f, new Paint());
            }
        } catch (Throwable th2) {
            S.o("Error displaying the inapp notif close button image:", th2);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i4) {
        int i6 = this.f9458a;
        setMeasuredDimension(i6, i6);
    }

    @SuppressLint({"ResourceType"})
    public CloseImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9458a = (int) TypedValue.applyDimension(1, 40, getResources().getDisplayMetrics());
        setId(199272);
    }
}
