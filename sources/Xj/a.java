package Xj;

import S1.r;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.lN8Dz0.zvMGC1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends FrameLayout implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f6682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f6683b;
    public g c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Rect f6684d;
    public c e;
    public Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6685g;
    public boolean h;
    public float i;

    public abstract g a(Context context);

    public final void b() {
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i = -1;
        int i4 = 0;
        while (true) {
            int i6 = i4;
            int i10 = i;
            i = i6;
            if (i >= numberOfCameras) {
                i = i10;
                break;
            }
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == 0) {
                break;
            } else {
                i4 = i + 1;
            }
        }
        if (this.e == null) {
            c cVar = new c("CameraHandlerThread");
            cVar.f6688a = this;
            cVar.start();
            this.e = cVar;
        }
        c cVar2 = this.e;
        cVar2.getClass();
        new Handler(cVar2.getLooper()).post(new b(cVar2, i, 0));
    }

    public final void c() {
        if (this.f6682a != null) {
            this.f6683b.e();
            e eVar = this.f6683b;
            eVar.f6691a = null;
            eVar.f6694g = null;
            this.f6682a.f6695a.release();
            this.f6682a = null;
        }
        c cVar = this.e;
        if (cVar != null) {
            cVar.quit();
            this.e = null;
        }
    }

    public boolean getFlash() {
        f fVar = this.f6682a;
        return fVar != null && r.l(fVar.f6695a) && this.f6682a.f6695a.getParameters().getFlashMode().equals("torch");
    }

    public int getRotationCount() {
        return this.f6683b.getDisplayOrientation() / 90;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setAspectTolerance(float f) {
        this.i = f;
    }

    public void setAutoFocus(boolean z4) {
        this.f6685g = z4;
        e eVar = this.f6683b;
        if (eVar != null) {
            eVar.setAutoFocus(z4);
        }
    }

    public void setBorderAlpha(float f) {
        ((h) this.c).setBorderAlpha(f);
        ((h) this.c).c();
    }

    public void setBorderColor(int i) {
        ((h) this.c).setBorderColor(i);
        ((h) this.c).c();
    }

    public void setBorderCornerRadius(int i) {
        ((h) this.c).setBorderCornerRadius(i);
        ((h) this.c).c();
    }

    public void setBorderLineLength(int i) {
        ((h) this.c).setBorderLineLength(i);
        ((h) this.c).c();
    }

    public void setBorderStrokeWidth(int i) {
        ((h) this.c).setBorderStrokeWidth(i);
        ((h) this.c).c();
    }

    public void setFlash(boolean z4) {
        this.f = Boolean.valueOf(z4);
        f fVar = this.f6682a;
        if (fVar == null || !r.l(fVar.f6695a)) {
            return;
        }
        Camera.Parameters parameters = this.f6682a.f6695a.getParameters();
        if (z4) {
            if (parameters.getFlashMode().equals("torch")) {
                return;
            } else {
                parameters.setFlashMode("torch");
            }
        } else if (parameters.getFlashMode().equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.m)) {
            return;
        } else {
            parameters.setFlashMode(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.m);
        }
        this.f6682a.f6695a.setParameters(parameters);
    }

    public void setIsBorderCornerRounded(boolean z4) {
        ((h) this.c).setBorderCornerRounded(z4);
        ((h) this.c).c();
    }

    public void setLaserColor(int i) {
        ((h) this.c).setLaserColor(i);
        ((h) this.c).c();
    }

    public void setLaserEnabled(boolean z4) {
        ((h) this.c).setLaserEnabled(z4);
        ((h) this.c).c();
    }

    public void setMaskColor(int i) {
        ((h) this.c).setMaskColor(i);
        ((h) this.c).c();
    }

    public void setShouldScaleToFill(boolean z4) {
        this.h = z4;
    }

    public void setSquareViewFinder(boolean z4) {
        ((h) this.c).setSquareViewFinder(z4);
        ((h) this.c).c();
    }

    public void setupCameraPreview(f fVar) {
        this.f6682a = fVar;
        if (fVar != null) {
            setupLayout(fVar);
            ((h) this.c).c();
            Boolean bool = this.f;
            if (bool != null) {
                setFlash(bool.booleanValue());
            }
            setAutoFocus(this.f6685g);
        }
    }

    public final void setupLayout(f fVar) {
        removeAllViews();
        e eVar = new e(getContext());
        eVar.c = true;
        eVar.f6693d = true;
        eVar.e = false;
        eVar.f = true;
        eVar.h = 0.1f;
        eVar.i = new C.h(eVar, 13);
        eVar.j = new d(eVar, 0);
        eVar.f6691a = fVar;
        eVar.f6694g = this;
        eVar.f6692b = new Handler();
        eVar.getHolder().addCallback(eVar);
        eVar.getHolder().setType(3);
        this.f6683b = eVar;
        eVar.setAspectTolerance(this.i);
        this.f6683b.setShouldScaleToFill(this.h);
        if (this.h) {
            addView(this.f6683b);
        } else {
            zvMGC1 zvmgc1 = new zvMGC1(getContext());
            zvmgc1.setGravity(17);
            zvmgc1.setBackgroundColor(-16777216);
            zvmgc1.addView(this.f6683b);
            addView(zvmgc1);
        }
        Object obj = this.c;
        if (!(obj instanceof View)) {
            throw new IllegalArgumentException("IViewFinder object returned by 'createViewFinderView()' should be instance of android.view.View");
        }
        addView((View) obj);
    }
}
