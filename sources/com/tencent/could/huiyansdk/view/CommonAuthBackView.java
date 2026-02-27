package com.tencent.could.huiyansdk.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.tencent.could.huiyansdk.R;
import com.tencent.could.huiyansdk.utils.CommonUtils;

/* JADX INFO: loaded from: classes4.dex */
public class CommonAuthBackView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Point f15774b;
    public Paint c;

    public CommonAuthBackView(Context context) {
        this(context, null);
    }

    public final void a() {
        this.f15774b = new Point();
        this.c = new Paint();
        this.c.setPathEffect(new DashPathEffect(new float[]{CommonUtils.dpToPx(this, 1.5f), CommonUtils.dpToPx(this, 25.0f)}, CommonUtils.dpToPx(this, 0.0f)));
        this.c.setColor(getResources().getColor(R.color.txy_auth_bg_circle));
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setStrokeWidth(CommonUtils.dpToPx(this, 6.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Point point = this.f15774b;
        canvas.drawCircle(point.x, point.y, this.f15773a, this.c);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i4);
        Point point = this.f15774b;
        int i6 = size >> 1;
        point.x = i6;
        int i10 = size2 >> 1;
        point.y = i10;
        if (i6 > i10) {
            i6 = i10;
        }
        this.f15773a = i6;
        this.f15773a = i6 - CommonUtils.dpToPx(this, 5.0f);
        setMeasuredDimension(size, size2);
    }

    public CommonAuthBackView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonAuthBackView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
