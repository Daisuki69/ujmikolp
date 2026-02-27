package n4;

import Ej.Z;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import com.paymaya.R;
import dOYHB6.tiZVw8.numX49;
import e2.C1421c;
import m4.p;

/* JADX INFO: renamed from: n4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1919c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1920d f18598b;

    public /* synthetic */ RunnableC1919c(C1920d c1920d, int i) {
        this.f18597a = i;
        this.f18598b = c1920d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = true;
        p pVar = null;
        switch (this.f18597a) {
            case 0:
                C1920d c1920d = this.f18598b;
                String strTnTj78 = numX49.tnTj78("brEA");
                try {
                    Log.d(strTnTj78, "Opening camera");
                    c1920d.c.c();
                    return;
                } catch (Exception e) {
                    Handler handler = c1920d.f18601d;
                    if (handler != null) {
                        handler.obtainMessage(R.id.zxing_camera_error, e).sendToTarget();
                    }
                    Log.e(strTnTj78, numX49.tnTj78("brEY"), e);
                    return;
                }
            case 1:
                String strTnTj782 = numX49.tnTj78("brEv");
                C1920d c1920d2 = this.f18598b;
                try {
                    Log.d(strTnTj782, "Configuring camera");
                    c1920d2.c.b();
                    Handler handler2 = c1920d2.f18601d;
                    if (handler2 != null) {
                        C1922f c1922f = c1920d2.c;
                        p pVar2 = c1922f.j;
                        if (pVar2 != null) {
                            int i = c1922f.f18611k;
                            if (i == -1) {
                                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
                            }
                            if (i % 180 == 0) {
                                z4 = false;
                            }
                            pVar = z4 ? new p(pVar2.f18369b, pVar2.f18368a) : pVar2;
                        }
                        handler2.obtainMessage(R.id.zxing_prewiew_size_ready, pVar).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    Handler handler3 = c1920d2.f18601d;
                    if (handler3 != null) {
                        handler3.obtainMessage(R.id.zxing_camera_error, e7).sendToTarget();
                    }
                    Log.e(strTnTj782, numX49.tnTj78("brE7"), e7);
                    return;
                }
            case 2:
                String strTnTj783 = numX49.tnTj78("brE3");
                C1920d c1920d3 = this.f18598b;
                try {
                    Log.d(strTnTj783, "Starting preview");
                    C1922f c1922f2 = c1920d3.c;
                    C1421c c1421c = c1920d3.f18600b;
                    Camera camera = c1922f2.f18607a;
                    SurfaceHolder surfaceHolder = (SurfaceHolder) c1421c.f16555b;
                    if (surfaceHolder != null) {
                        camera.setPreviewDisplay(surfaceHolder);
                    } else {
                        camera.setPreviewTexture((SurfaceTexture) c1421c.c);
                    }
                    c1920d3.c.f();
                    return;
                } catch (Exception e10) {
                    Handler handler4 = c1920d3.f18601d;
                    if (handler4 != null) {
                        handler4.obtainMessage(R.id.zxing_camera_error, e10).sendToTarget();
                    }
                    Log.e(strTnTj783, numX49.tnTj78("brEy"), e10);
                    return;
                }
            default:
                try {
                    Log.d("d", "Closing camera");
                    C1922f c1922f3 = this.f18598b.c;
                    C1917a c1917a = c1922f3.c;
                    if (c1917a != null) {
                        c1917a.c();
                        c1922f3.c = null;
                    }
                    if (c1922f3.f18609d != null) {
                        c1922f3.f18609d = null;
                    }
                    Camera camera2 = c1922f3.f18607a;
                    if (camera2 != null && c1922f3.e) {
                        camera2.stopPreview();
                        c1922f3.f18612l.f18605a = null;
                        c1922f3.e = false;
                    }
                    C1922f c1922f4 = this.f18598b.c;
                    Camera camera3 = c1922f4.f18607a;
                    if (camera3 != null) {
                        camera3.release();
                        c1922f4.f18607a = null;
                    }
                    break;
                } catch (Exception e11) {
                    Log.e(numX49.tnTj78("brEX"), numX49.tnTj78("brEG"), e11);
                }
                C1920d c1920d4 = this.f18598b;
                c1920d4.f18602g = true;
                c1920d4.f18601d.sendEmptyMessage(R.id.zxing_camera_closed);
                Z z5 = this.f18598b.f18599a;
                synchronized (z5.e) {
                    try {
                        int i4 = z5.f1430b - 1;
                        z5.f1430b = i4;
                        if (i4 == 0) {
                            z5.i();
                        }
                    } finally {
                    }
                    break;
                }
                return;
        }
    }
}
