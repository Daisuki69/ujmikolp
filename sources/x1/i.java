package x1;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import w1.ViewOnLayoutChangeListenerC2362A;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, InterfaceC2451a {
    public final g c;
    public final GestureDetector e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f20879g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f20876a = new PointF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f20877b = new PointF();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f20878d = 25.0f;
    public volatile float f = 3.1415927f;

    public i(Context context, g gVar) {
        this.c = gVar;
        this.e = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f20876a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // x1.InterfaceC2451a
    public final void onOrientationChange(float[] fArr, float f) {
        this.f = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f3) {
        float x6 = (motionEvent2.getX() - this.f20876a.x) / this.f20878d;
        float y7 = motionEvent2.getY();
        PointF pointF = this.f20876a;
        float f7 = (y7 - pointF.y) / this.f20878d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f20877b;
        pointF2.x -= (fCos * x6) - (fSin * f7);
        float f10 = (fCos * f7) + (fSin * x6) + pointF2.y;
        pointF2.y = f10;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f10));
        g gVar = this.c;
        PointF pointF3 = this.f20877b;
        synchronized (gVar) {
            float f11 = pointF3.y;
            gVar.f20869g = f11;
            Matrix.setRotateM(gVar.e, 0, -f11, (float) Math.cos(gVar.h), (float) Math.sin(gVar.h), 0.0f);
            Matrix.setRotateM(gVar.f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        f fVar = this.f20879g;
        if (fVar != null) {
            return ((ViewOnLayoutChangeListenerC2362A) fVar).f20519a.toggleControllerVisibility();
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.e.onTouchEvent(motionEvent);
    }
}
