package com.paymaya.mayaui.qr.view.widget;

import W4.c;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.paymaya.R;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaQrScannerMaskView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13657b;
    public Rect c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f13658d;
    public final Paint e;
    public final Paint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f13659g;
    public final int h;
    public final float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaQrScannerMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        this.f13657b = ContextCompat.getColor(context, R.color.black_70_alpha);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.m);
        this.h = typedArrayObtainStyledAttributes.getColor(3, ContextCompat.getColor(context, R.color.begonia_pink));
        this.i = typedArrayObtainStyledAttributes.getDimension(4, context.getResources().getDimension(R.dimen.maya_margin_large));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStrokeWidth(10.0f);
        this.f13658d = paint;
        Paint paint2 = new Paint();
        paint2.setColor(0);
        paint2.setStrokeWidth(10.0f);
        this.e = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setStrokeWidth(10.0f);
        paint3.setAntiAlias(true);
        this.f13659g = paint3;
        Paint paint4 = new Paint();
        paint4.setColor(this.h);
        paint4.setStyle(style);
        paint4.setStrokeWidth(10.0f);
        paint4.setAntiAlias(true);
        this.f = paint4;
    }

    public final void a(Canvas canvas, Paint paint) {
        Path path = new Path();
        Rect rect = this.c;
        if (rect == null) {
            j.n("cameraFraming");
            throw null;
        }
        int i = rect.bottom - rect.top;
        int i4 = rect.right;
        int i6 = rect.left;
        int i10 = i4 - i6;
        path.moveTo(i6, r5 + i);
        if (this.c == null) {
            j.n("cameraFraming");
            throw null;
        }
        path.lineTo(r1.left, r1.top);
        if (this.c == null) {
            j.n("cameraFraming");
            throw null;
        }
        path.lineTo(r1.left + i10, r1.top);
        canvas.drawPath(path, paint);
        if (this.c == null) {
            j.n("cameraFraming");
            throw null;
        }
        path.moveTo(r1.right, r1.top + i);
        if (this.c == null) {
            j.n("cameraFraming");
            throw null;
        }
        path.lineTo(r1.right, r1.top);
        canvas.drawPath(path, paint);
        if (this.c == null) {
            j.n("cameraFraming");
            throw null;
        }
        path.moveTo(r1.right - i10, r1.bottom);
        if (this.c == null) {
            j.n("cameraFraming");
            throw null;
        }
        path.lineTo(r1.right, r1.bottom);
        canvas.drawPath(path, paint);
    }

    public final boolean getErrorState() {
        return this.f13656a;
    }

    public final int getMaskBackgroundColor() {
        return this.f13657b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        j.g(canvas, "canvas");
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f = this.i;
        Point point = new Point(width / 2, height / 2);
        float f3 = width - (f * Resources.getSystem().getDisplayMetrics().density);
        float f7 = point.x;
        float f10 = f3 / 2;
        double d10 = point.y;
        double d11 = (((double) height) / 2.5d) / ((double) 2);
        this.c = new Rect((int) (f7 - f10), (int) (d10 - d11), (int) (f7 + f10), (int) (d10 + d11));
        Path path = new Path();
        Rect rect = this.c;
        if (rect == null) {
            j.n("cameraFraming");
            throw null;
        }
        RectF rectF = new RectF(rect);
        path.reset();
        path.addRect(rectF, Path.Direction.CW);
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        Paint paint = this.f13658d;
        if (paint == null) {
            j.n("transparentMask");
            throw null;
        }
        canvas.drawRect(rectF, paint);
        Paint paint2 = this.e;
        if (paint2 == null) {
            j.n("semiBlackMask");
            throw null;
        }
        canvas.drawPath(path, paint2);
        canvas.clipPath(path);
        canvas.drawColor(this.f13657b);
        if (this.f13656a) {
            Paint paint3 = this.f;
            if (paint3 != null) {
                a(canvas, paint3);
                return;
            } else {
                j.n("errorBorder");
                throw null;
            }
        }
        Paint paint4 = this.f13659g;
        if (paint4 != null) {
            a(canvas, paint4);
        } else {
            j.n("initBorder");
            throw null;
        }
    }

    public final void setErrorState(boolean z4) {
        this.f13656a = z4;
        invalidate();
    }

    public final void setMaskBackgroundColor(int i) {
        this.f13657b = i;
    }
}
