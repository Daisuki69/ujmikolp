package com.tencent.could.huiyansdk.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.tencent.could.aicamare.CameraHolder;

/* JADX INFO: loaded from: classes4.dex */
public class CameraDateGatherView extends SurfaceView implements SurfaceHolder.Callback, com.tencent.could.huiyansdk.turing.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15770b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Point f15771d;
    public Path e;
    public SurfaceHolder f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CameraHolder f15772g;

    public CameraDateGatherView(Context context) {
        this(context, null);
    }

    @Override // com.tencent.could.huiyansdk.turing.a
    public void a() {
        SurfaceHolder surfaceHolder;
        CameraHolder cameraHolder = this.f15772g;
        if (cameraHolder == null || (surfaceHolder = this.f) == null) {
            return;
        }
        cameraHolder.startPreview(surfaceHolder);
    }

    public final void b() {
        SurfaceHolder holder = getHolder();
        this.f = holder;
        holder.addCallback(this);
        this.f15771d = new Point();
        this.e = new Path();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void draw(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipPath(this.e);
        } else {
            canvas.clipPath(this.e, Region.Op.REPLACE);
        }
        super.draw(canvas);
    }

    public int getViewHeight() {
        return this.f15770b;
    }

    public int getViewWidth() {
        return this.f15769a;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        this.f15769a = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i4);
        this.f15770b = size;
        Point point = this.f15771d;
        int i6 = this.f15769a >> 1;
        point.x = i6;
        int i10 = size >> 1;
        point.y = i10;
        if (i6 > i10) {
            i6 = i10;
        }
        this.c = i6;
        this.e.reset();
        Path path = this.e;
        Point point2 = this.f15771d;
        path.addCircle(point2.x, point2.y, this.c, Path.Direction.CCW);
        this.c -= Math.round(getResources().getDisplayMetrics().density * 1.9f);
        setMeasuredDimension(this.f15769a, this.f15770b);
    }

    @Override // com.tencent.could.huiyansdk.turing.a
    public void setCameraHolder(CameraHolder cameraHolder) {
        this.f15772g = cameraHolder;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i4, int i6) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f = surfaceHolder;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public CameraDateGatherView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraDateGatherView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }
}
