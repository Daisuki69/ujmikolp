package com.paymaya.mayaui.xp.view.widgets;

import Mc.a;
import W4.c;
import We.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import cj.C1110A;
import cj.C1112C;
import com.paymaya.R;
import d4.AbstractC1331a;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import kotlin.ranges.d;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"CustomViewStyleable"})
public final class MayaXpMeterView extends View {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final TextPaint f14344B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final TextPaint f14345K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final TextPaint f14346P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final RectF f14347Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final RectF f14348R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final RectF f14349S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f14350T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14352b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14353d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f14354g;
    public final float h;
    public final float i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f14355k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f14356l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f14357n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f14358o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14359p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f14360q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Integer f14361r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f14362s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f14363t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Paint f14364u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Paint f14365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Paint f14366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Paint f14367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Paint f14368y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaXpMeterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        this.f14351a = 0.32f;
        this.f14352b = 0.73f;
        int color = ContextCompat.getColor(context, R.color.maya_shades_of_grey_10);
        int color2 = ContextCompat.getColor(context, R.color.bright_mint_green);
        int color3 = ContextCompat.getColor(context, R.color.maya_shades_of_grey_3);
        int color4 = ContextCompat.getColor(context, R.color.maya_primary_white);
        this.c = color4;
        int color5 = ContextCompat.getColor(context, R.color.maya_shades_of_grey_5);
        this.f14353d = color5;
        int color6 = ContextCompat.getColor(context, R.color.bright_mint_green);
        this.e = ContextCompat.getColor(context, R.color.grown_green);
        this.f = ContextCompat.getColor(context, R.color.reptile_green);
        float fJ = AbstractC1331a.j(context, 1, 12.0f);
        this.f14354g = fJ;
        float fJ2 = AbstractC1331a.j(context, 1, 7.0f);
        this.h = fJ2;
        float fJ3 = AbstractC1331a.j(context, 1, 24.0f);
        this.i = fJ3;
        float fJ4 = AbstractC1331a.j(context, 1, 12.0f);
        this.j = fJ4;
        this.f14355k = AbstractC1331a.j(context, 1, 4.0f);
        float fJ5 = AbstractC1331a.j(context, 1, 5.0f);
        this.f14356l = fJ5;
        float fJ6 = AbstractC1331a.j(context, 1, 6.0f);
        float fJ7 = AbstractC1331a.j(context, 1, 1.0f);
        this.m = fJ7;
        float fJ8 = AbstractC1331a.j(context, 1, 7.0f);
        this.f14357n = fJ8;
        float fJ9 = AbstractC1331a.j(context, 2, 36.0f);
        float fJ10 = AbstractC1331a.j(context, 2, 22.0f);
        this.f14358o = fJ10;
        float fJ11 = AbstractC1331a.j(context, 2, 14.0f);
        this.f14362s = C1112C.f9377a;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(color);
        this.f14363t = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setColor(color3);
        paint2.setAlpha(127);
        this.f14364u = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setColor(color2);
        this.f14365v = paint3;
        Paint paint4 = new Paint();
        paint4.setStyle(style);
        paint4.setColor(color3);
        this.f14366w = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(style);
        paint5.setColor(color4);
        this.f14367x = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStyle(Paint.Style.FILL_AND_STROKE);
        paint6.setStrokeWidth(1.0f);
        paint6.setColor(color6);
        paint6.setPathEffect(new CornerPathEffect(5.0f));
        this.f14368y = paint6;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(color6);
        textPaint.setTextSize(fJ9);
        textPaint.setTypeface(ResourcesCompat.getFont(context, R.font.font_cerebri_sans_pro_bold));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.f14344B = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setColor(color4);
        textPaint2.setTextSize(fJ10);
        Paint.Align align = Paint.Align.LEFT;
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(Typeface.DEFAULT_BOLD);
        this.f14345K = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        textPaint3.setColor(color5);
        textPaint3.setTextSize(fJ11);
        textPaint3.setTextAlign(align);
        this.f14346P = textPaint3;
        this.f14347Q = new RectF();
        this.f14348R = new RectF();
        this.f14349S = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f6301q);
        try {
            int color7 = typedArrayObtainStyledAttributes.getColor(3, color);
            int color8 = typedArrayObtainStyledAttributes.getColor(14, color2);
            int color9 = typedArrayObtainStyledAttributes.getColor(20, color3);
            int color10 = typedArrayObtainStyledAttributes.getColor(16, color4);
            this.c = color10;
            this.f14353d = typedArrayObtainStyledAttributes.getColor(18, color5);
            int color11 = typedArrayObtainStyledAttributes.getColor(24, color6);
            this.f14354g = typedArrayObtainStyledAttributes.getDimension(4, fJ);
            this.h = typedArrayObtainStyledAttributes.getDimension(21, fJ2);
            this.i = typedArrayObtainStyledAttributes.getDimension(9, fJ3);
            this.j = typedArrayObtainStyledAttributes.getDimension(22, fJ4);
            this.f14356l = typedArrayObtainStyledAttributes.getDimension(23, fJ5);
            typedArrayObtainStyledAttributes.getDimension(7, fJ6);
            this.m = typedArrayObtainStyledAttributes.getDimension(8, fJ7);
            this.f14357n = typedArrayObtainStyledAttributes.getDimension(6, fJ8);
            float dimension = typedArrayObtainStyledAttributes.getDimension(25, fJ9);
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(19, fJ10);
            this.f14358o = dimension2;
            float dimension3 = typedArrayObtainStyledAttributes.getDimension(17, fJ11);
            typedArrayObtainStyledAttributes.recycle();
            paint.setColor(color7);
            paint2.setColor(color9);
            paint2.setAlpha(127);
            paint3.setColor(color8);
            paint4.setColor(color9);
            paint4.setAlpha(255);
            paint6.setColor(color11);
            textPaint.setColor(color11);
            textPaint.setTextSize(dimension);
            textPaint2.setColor(color10);
            textPaint2.setTextSize(dimension2);
            textPaint3.setColor(color10);
            textPaint3.setTextSize(dimension3);
            paint4.setColor(color10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private final Pair<a, a> getTierBounds() {
        a aVar = (a) C1110A.C(0, this.f14362s);
        if (aVar == null) {
            return null;
        }
        a aVar2 = (a) C1110A.C(1, this.f14362s);
        int i = aVar.f3400b;
        a aVar3 = (aVar2 == null || i <= aVar2.f3400b) ? aVar : aVar2;
        if (aVar2 == null || i <= aVar2.f3400b) {
            aVar = aVar2;
        }
        return new Pair<>(aVar3, aVar);
    }

    public final Pair a() {
        RectF rectF = this.f14348R;
        float fWidth = rectF.width();
        float f = rectF.left;
        return new Pair(Float.valueOf((this.f14351a * fWidth) + f), Float.valueOf((fWidth * this.f14352b) + f));
    }

    public final void b(Canvas canvas, float f, String str, String str2, float f3, float f7, boolean z4) {
        TextPaint textPaint = this.f14345K;
        int alpha = textPaint.getAlpha();
        TextPaint textPaint2 = this.f14346P;
        int alpha2 = textPaint2.getAlpha();
        int color = textPaint.getColor();
        int color2 = textPaint2.getColor();
        int i = this.c;
        if (z4) {
            textPaint.setColor(i);
            textPaint2.setColor(i);
            textPaint.setAlpha(255);
            textPaint2.setAlpha(255);
        } else {
            textPaint.setColor(i);
            textPaint2.setColor(this.f14353d);
            int i4 = f <= this.f14350T ? 127 : 255;
            textPaint.setAlpha(i4);
            textPaint2.setAlpha(i4);
        }
        float f10 = f - 10.0f;
        canvas.drawText(str, f10, f3, textPaint);
        canvas.drawText(str2, f10, f7, textPaint2);
        textPaint.setAlpha(alpha);
        textPaint2.setAlpha(alpha2);
        textPaint.setColor(color);
        textPaint2.setColor(color2);
    }

    public final void c(Canvas canvas, float f, float f3, float f7, boolean z4, float f10, float f11, boolean z5) {
        if (f10 > f || f > f11) {
            return;
        }
        float f12 = this.m * 4.0f;
        float f13 = f7 + 24.0f;
        Paint paint = z5 ? this.f14367x : this.f14366w;
        int alpha = paint.getAlpha();
        if (!z5 && z4) {
            paint.setAlpha(127);
        } else {
            paint.setAlpha(255);
        }
        float f14 = f12 / 2;
        canvas.drawRect(f - f14, f3, f + f14, f13, paint);
        paint.setAlpha(alpha);
    }

    public final void d() {
        float fA;
        float width = getWidth();
        float height = getHeight();
        this.f14347Q.set(0.0f, 0.0f, width, height);
        float f = 2;
        float f3 = this.h;
        float f7 = (height / f) - (f3 / f);
        RectF rectF = this.f14348R;
        rectF.set(0.0f, f7, width, f3 + f7);
        Pair pairA = a();
        float fFloatValue = ((Number) pairA.f18160a).floatValue();
        float fFloatValue2 = ((Number) pairA.f18161b).floatValue();
        Integer num = this.f14361r;
        if (num != null) {
            int iIntValue = num.intValue();
            a aVar = (a) C1110A.C(0, this.f14362s);
            Integer numValueOf = aVar != null ? Integer.valueOf(aVar.f3400b) : null;
            a aVar2 = (a) C1110A.C(1, this.f14362s);
            Integer numValueOf2 = aVar2 != null ? Integer.valueOf(aVar2.f3400b) : null;
            fA = (numValueOf == null || numValueOf2 == null || numValueOf2.equals(numValueOf)) ? 0.0f : d.a((iIntValue - numValueOf.intValue()) / (numValueOf2.intValue() - numValueOf.intValue()), 0.0f, 1.0f);
        } else {
            fA = d.a(this.f14360q / 100.0f, 0.0f, 1.0f);
        }
        float fA2 = d.a(s.a(fFloatValue2, fFloatValue, fA, fFloatValue), rectF.left, rectF.right);
        this.f14350T = fA2;
        RectF rectF2 = this.f14349S;
        rectF2.set(rectF.left, rectF.top, fA2, rectF.bottom);
        float fWidth = rectF2.width();
        Paint paint = this.f14365v;
        if (fWidth > 0.0f) {
            paint.setShader(new LinearGradient(rectF2.left, rectF2.centerY(), rectF2.right, rectF2.centerY(), new int[]{this.e, this.f}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        } else {
            paint.setShader(null);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Pair<a, a> tierBounds;
        float f;
        boolean z4;
        MayaXpMeterView mayaXpMeterView;
        float f3;
        a aVar;
        MayaXpMeterView mayaXpMeterView2;
        Canvas canvas2;
        j.g(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.f14347Q;
        Paint paint = this.f14363t;
        float f7 = this.f14354g;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        float height = getHeight() / 2.0f;
        float f10 = 2;
        float f11 = this.f14357n;
        float f12 = f11 / f10;
        float f13 = height - f12;
        float f14 = f12 + height;
        RectF rectF2 = this.f14348R;
        float f15 = rectF2.left;
        float f16 = rectF2.right;
        if (f15 >= f16 || this.f14362s.isEmpty() || (tierBounds = getTierBounds()) == null) {
            mayaXpMeterView = this;
        } else {
            Pair pairA = a();
            float fFloatValue = ((Number) pairA.f18160a).floatValue();
            float fFloatValue2 = ((Number) pairA.f18161b).floatValue();
            boolean z5 = this.f14362s.size() == 1 || C1110A.C(1, this.f14362s) == null;
            if (fFloatValue <= this.f14350T) {
                f = fFloatValue;
                z4 = true;
            } else {
                f = fFloatValue;
                z4 = false;
            }
            c(canvas, f, f13, f14, z4, f15, f16, z5);
            float f17 = f;
            boolean z8 = z5;
            if (tierBounds.f18161b != null) {
                c(canvas, fFloatValue2, f13, f14, false, f15, f16, false);
                mayaXpMeterView = this;
                f3 = fFloatValue2;
            } else {
                mayaXpMeterView = this;
                f3 = fFloatValue2;
            }
            if (!z8) {
                Pair pairA2 = mayaXpMeterView.a();
                float fFloatValue3 = ((Number) pairA2.f18161b).floatValue() - ((Number) pairA2.f18160a).floatValue();
                float f18 = fFloatValue3 > 0.0f ? fFloatValue3 / 14 : 0.0f;
                for (float f19 = f17; f18 > 0.0f && f19 <= f16; f19 += f18) {
                    float fAbs = Math.abs(f19 - f17);
                    float f20 = mayaXpMeterView.m;
                    float f21 = f20 * f10;
                    boolean z9 = fAbs <= f21;
                    boolean z10 = Math.abs(f19 - f3) <= f21;
                    if (!z9 && !z10) {
                        float f22 = f20 / f10;
                        float f23 = f13;
                        canvas.drawRect(f19 - f22, f23, f22 + f19, f14, mayaXpMeterView.f14364u);
                        f13 = f23;
                    }
                }
            }
        }
        float f24 = mayaXpMeterView.f14355k;
        float f25 = mayaXpMeterView.f14358o;
        float height2 = (f11 / f10) + (mayaXpMeterView.getHeight() / 2.0f) + 12.0f + f24 + 14.0f + f25;
        float f26 = (f25 + height2) - 4.0f;
        if (mayaXpMeterView.f14362s.isEmpty() || (aVar = (a) C1110A.C(0, mayaXpMeterView.f14362s)) == null) {
            canvas2 = canvas;
            mayaXpMeterView2 = mayaXpMeterView;
        } else {
            a aVar2 = (a) C1110A.C(1, mayaXpMeterView.f14362s);
            boolean z11 = aVar2 == null;
            boolean z12 = aVar2 != null;
            Pair pairA3 = mayaXpMeterView.a();
            float fFloatValue4 = ((Number) pairA3.f18160a).floatValue();
            float fFloatValue5 = ((Number) pairA3.f18161b).floatValue();
            mayaXpMeterView.b(canvas, fFloatValue4, aVar.f3399a, aVar.c, height2, f26, z11);
            if (aVar2 != null) {
                mayaXpMeterView2 = this;
                canvas2 = canvas;
                mayaXpMeterView2.b(canvas2, fFloatValue5, aVar2.f3399a, aVar2.c, height2, f26, z12);
            } else {
                mayaXpMeterView2 = this;
                canvas2 = canvas;
            }
        }
        canvas2.drawRect(mayaXpMeterView2.f14349S, mayaXpMeterView2.f14365v);
        Path path = new Path();
        float height3 = (mayaXpMeterView2.getHeight() / 2.0f) - (mayaXpMeterView2.i / f10);
        float f27 = mayaXpMeterView2.f14356l;
        float f28 = (height3 - f27) - f27;
        float f29 = mayaXpMeterView2.f14350T;
        float f30 = mayaXpMeterView2.j;
        float f31 = 0.57f * f30;
        path.moveTo(f29 - f31, f28);
        path.lineTo(f31 + mayaXpMeterView2.f14350T, f28);
        path.lineTo(mayaXpMeterView2.f14350T, f28 + f30);
        path.close();
        canvas2.drawPath(path, mayaXpMeterView2.f14368y);
        canvas2.drawText(String.valueOf(mayaXpMeterView2.f14359p), mayaXpMeterView2.f14350T, ((f28 - f30) - f24) + 18.0f, mayaXpMeterView2.f14344B);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i6, int i10) {
        super.onSizeChanged(i, i4, i6, i10);
        d();
    }

    public final void setTiers(List<a> newTiers) {
        j.g(newTiers, "newTiers");
        this.f14362s = newTiers;
        d();
        invalidate();
    }

    public final void setValue(int i) {
        this.f14359p = i;
        this.f14361r = null;
        invalidate();
    }
}
