package com.tencent.could.huiyansdk.view;

import E8.n;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlayer;
import com.tencent.could.huiyansdk.R;
import com.tencent.could.huiyansdk.utils.CommonUtils;

/* JADX INFO: loaded from: classes4.dex */
public class LoadingFrontAnimatorView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f15779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueAnimator f15780b;
    public Point c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15781d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15782g;
    public Paint h;
    public RectF i;
    public Paint j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Path f15783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15784l;

    public LoadingFrontAnimatorView(Context context) {
        this(context, null);
    }

    public void b() {
        this.f15784l = true;
        setVisibility(0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f15780b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new n(this, 5));
        this.f15780b.setDuration(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        this.f15780b.setRepeatMode(1);
        this.f15780b.setRepeatCount(-1);
        this.f15780b.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f15784l) {
            canvas.drawPath(this.f15783k, this.j);
            return;
        }
        canvas.save();
        float f = this.f15779a * 360.0f;
        Point point = this.c;
        canvas.rotate(f, point.x, point.y);
        int i = 0;
        while (i <= 360) {
            this.h.setColor(i < 270 ? a(i / 270.0f, this.f15781d, this.f) : a((i - 270) / 90.0f, this.f, this.e));
            canvas.drawArc(this.i, i, 1.0f, false, this.h);
            i++;
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i4);
        Point point = this.c;
        int i6 = size >> 1;
        point.x = i6;
        int i10 = size2 >> 1;
        point.y = i10;
        if (i6 > i10) {
            i6 = i10;
        }
        setMeasuredDimension(size, size2);
        int iDpToPx = i6 - CommonUtils.dpToPx(this, 1.9f);
        Point point2 = this.c;
        int i11 = point2.x;
        int i12 = point2.y;
        this.i = new RectF(i11 - iDpToPx, i12 - iDpToPx, i11 + iDpToPx, i12 + iDpToPx);
        this.f15783k.reset();
        Path path = this.f15783k;
        Point point3 = this.c;
        path.addCircle(point3.x, point3.y, iDpToPx, Path.Direction.CCW);
    }

    public LoadingFrontAnimatorView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15779a = 0.0f;
        this.f15784l = false;
        a();
    }

    public final void a() {
        this.c = new Point();
        this.f15781d = getResources().getColor(R.color.txy_animation_start_color);
        this.f = getResources().getColor(R.color.txy_animation_mid_color);
        this.e = getResources().getColor(R.color.txy_animation_end_color);
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.h.setColor(this.f);
        Paint paint2 = this.h;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.h.setStrokeWidth(CommonUtils.dpToPx(this, 3.5f));
        this.f15783k = new Path();
        this.j = new Paint(1);
        int color = getResources().getColor(R.color.txy_circle_color);
        this.f15782g = color;
        this.j.setColor(color);
        this.j.setStyle(style);
        this.j.setStrokeWidth(CommonUtils.dpToPx(this, 3.5f));
    }

    public int a(float f, int i, int i4) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        int iAlpha = Color.alpha(i);
        int iRed = Color.red(i);
        int iBlue = Color.blue(i);
        int iGreen = Color.green(i);
        int iAlpha2 = Color.alpha(i4);
        int iRed2 = Color.red(i4);
        return Color.argb((int) (((iAlpha2 - iAlpha) * f) + iAlpha), (int) (((iRed2 - iRed) * f) + iRed), (int) ((f * (Color.green(i4) - iGreen)) + iGreen), (int) (((Color.blue(i4) - iBlue) * f) + iBlue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue < 0.0f || fFloatValue > 1.0f) {
            return;
        }
        this.f15779a = fFloatValue;
        invalidate();
    }
}
