package com.paymaya.ui.travel.view.widget;

import E8.n;
import Ie.b;
import W4.c;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class StepProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14944b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14945d;
    public final int e;
    public final Paint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f14946g;
    public final Paint h;
    public final Path i;
    public final Path j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f14947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Path f14948l;
    public final ArrayList m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f14949n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f14950o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ValueAnimator f14951p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RectF f14952q;

    public StepProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14943a = 3;
        Paint paint = new Paint();
        this.f = paint;
        Paint paint2 = new Paint();
        this.f14946g = paint2;
        Paint paint3 = new Paint();
        this.h = paint3;
        this.i = new Path();
        this.j = new Path();
        this.f14947k = new Path();
        this.f14948l = new Path();
        ArrayList arrayList = new ArrayList();
        this.m = arrayList;
        this.f14949n = new ArrayList();
        this.f14950o = new ArrayList();
        new ArrayList();
        this.f14951p = new ValueAnimator();
        this.f14952q = new RectF();
        int iA = a(16.0d);
        this.c = iA;
        this.f14945d = iA / 2;
        this.e = a(12.0d);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        int iA2 = a(2.0d);
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(iA2);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setAntiAlias(true);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f6304t);
            this.f14943a = typedArrayObtainStyledAttributes.getInt(3, 3);
            this.f14944b = typedArrayObtainStyledAttributes.getInt(0, 0);
            paint.setColor(typedArrayObtainStyledAttributes.getColor(1, -12303292));
            paint3.setColor(typedArrayObtainStyledAttributes.getColor(2, -3355444));
            typedArrayObtainStyledAttributes.recycle();
        }
        arrayList.clear();
        for (int i = 0; i < this.f14943a; i++) {
            arrayList.add(new Path());
        }
    }

    public final int a(double d10) {
        return BigDecimal.valueOf(getResources().getDisplayMetrics().density).multiply(BigDecimal.valueOf(d10)).intValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        this.f14944b = Math.max(0, Math.min(this.f14944b, this.f14943a - 1));
        boolean zIsRunning = this.f14951p.isRunning();
        Paint paint = this.f;
        Paint paint2 = this.h;
        Path path = this.i;
        if (zIsRunning) {
            canvas.drawPath(path, paint2);
            canvas.drawPath(this.f14947k, paint);
        } else {
            canvas.drawPath(path, paint2);
            canvas.drawPath((Path) this.m.get(this.f14944b), paint);
        }
        while (true) {
            ArrayList arrayList = this.f14950o;
            if (i >= arrayList.size()) {
                return;
            }
            RectF rectF = (RectF) arrayList.get(i);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(rectF.left);
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(rectF.right);
            BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(rectF.top);
            BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(rectF.bottom);
            BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(rectF.width());
            BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(rectF.height());
            int i4 = this.f14944b;
            Paint paint3 = this.f14946g;
            if (i < i4) {
                Path path2 = this.j;
                path2.reset();
                path2.moveTo(bigDecimalValueOf.add(bigDecimalValueOf5.multiply(BigDecimal.valueOf(0.2d))).floatValue(), rectF.centerY());
                path2.lineTo(bigDecimalValueOf.add(bigDecimalValueOf5.multiply(BigDecimal.valueOf(0.4d))).floatValue(), bigDecimalValueOf4.subtract(bigDecimalValueOf6.multiply(BigDecimal.valueOf(0.3d))).floatValue());
                path2.lineTo(bigDecimalValueOf2.subtract(bigDecimalValueOf5.multiply(BigDecimal.valueOf(0.2d))).floatValue(), bigDecimalValueOf3.add(bigDecimalValueOf6.multiply(BigDecimal.valueOf(0.2d))).floatValue());
                canvas.drawPath(path2, paint3);
            } else {
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.f14945d, paint3);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            setMeasuredDimension(i, this.c * 2);
        } else {
            setMeasuredDimension(i, i4);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i6, int i10) {
        BigDecimal bigDecimal;
        long j;
        BigDecimal bigDecimal2;
        super.onSizeChanged(i, i4, i6, i10);
        if (i == 0 || i4 == 0) {
            return;
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.c);
        long j6 = 2;
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(i).subtract(BigDecimal.valueOf(this.c).multiply(BigDecimal.valueOf(2L)));
        BigDecimal bigDecimalSubtract2 = BigDecimal.valueOf(this.f14943a).subtract(BigDecimal.valueOf(1L));
        RoundingMode roundingMode = RoundingMode.UP;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalSubtract2, roundingMode);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(this.e);
        BigDecimal bigDecimalDivide2 = bigDecimalValueOf2.divide(BigDecimal.valueOf(2L), roundingMode);
        BigDecimal bigDecimalSubtract3 = BigDecimal.valueOf(this.c).subtract(bigDecimalDivide2);
        Path path = this.i;
        path.reset();
        ArrayList arrayList = this.f14949n;
        arrayList.clear();
        ArrayList arrayList2 = this.f14950o;
        arrayList2.clear();
        Path path2 = new Path();
        Path path3 = new Path();
        for (Path path4 : this.m) {
            path4.reset();
            if (path2.isEmpty()) {
                bigDecimal = bigDecimalValueOf2;
                j = j6;
                bigDecimal2 = bigDecimalDivide2;
            } else {
                j = j6;
                Path.Op op = Path.Op.UNION;
                path4.op(path2, op);
                bigDecimal2 = bigDecimalDivide2;
                bigDecimal = bigDecimalValueOf2;
                RectF rectF = new RectF(bigDecimalValueOf.subtract(bigDecimalDivide).floatValue(), bigDecimalSubtract3.floatValue(), bigDecimalValueOf.floatValue(), bigDecimalSubtract3.add(bigDecimalValueOf2).floatValue());
                path3.reset();
                path3.addRoundRect(rectF, bigDecimal2.floatValue(), bigDecimal2.floatValue(), Path.Direction.CW);
                path4.op(path3, op);
            }
            path3.reset();
            float fFloatValue = bigDecimalValueOf.floatValue();
            float f = this.c;
            path3.addCircle(fFloatValue, f, f, Path.Direction.CW);
            path4.op(path3, Path.Op.UNION);
            RectF rectF2 = new RectF();
            rectF2.left = bigDecimalValueOf.subtract(BigDecimal.valueOf(this.c)).floatValue();
            rectF2.right = bigDecimalValueOf.add(BigDecimal.valueOf(this.c)).floatValue();
            rectF2.top = 0.0f;
            rectF2.bottom = BigDecimal.valueOf(this.c).multiply(BigDecimal.valueOf(j)).floatValue();
            arrayList.add(rectF2);
            RectF rectF3 = new RectF();
            rectF3.left = bigDecimalValueOf.subtract(BigDecimal.valueOf(this.f14945d)).floatValue();
            rectF3.right = bigDecimalValueOf.add(BigDecimal.valueOf(this.f14945d)).floatValue();
            rectF3.top = BigDecimal.valueOf(this.c).subtract(BigDecimal.valueOf(this.f14945d)).floatValue();
            rectF3.bottom = BigDecimal.valueOf(this.c).add(BigDecimal.valueOf(this.f14945d)).floatValue();
            arrayList2.add(rectF3);
            bigDecimalValueOf = bigDecimalValueOf.add(bigDecimalDivide);
            j6 = j;
            bigDecimalDivide2 = bigDecimal2;
            path2 = path4;
            bigDecimalValueOf2 = bigDecimal;
        }
        path.op(path2, Path.Op.UNION);
        RectF rectF4 = this.f14952q;
        rectF4.top = 0.0f;
        rectF4.right = getWidth();
        rectF4.bottom = getHeight();
    }

    public void setCurrentStep(int i) {
        int i4;
        int i6 = 1;
        if (i < this.m.size()) {
            ArrayList arrayList = this.f14949n;
            if (i < arrayList.size() && (i4 = this.f14944b) != i) {
                float fFloatValue = ((RectF) arrayList.get(i4)).right;
                if (this.f14951p.isRunning()) {
                    fFloatValue = ((Float) this.f14951p.getAnimatedValue()).floatValue();
                    this.f14951p.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, ((RectF) arrayList.get(i)).right);
                this.f14951p = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addListener(new b(this, i));
                this.f14951p.addUpdateListener(new n(this, i6));
                this.f14951p.setDuration(300L);
                this.f14951p.start();
                this.f14944b = i;
                return;
            }
        }
        this.f14944b = i;
    }
}
