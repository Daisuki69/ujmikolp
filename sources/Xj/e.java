package Xj;

import S1.s;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends SurfaceView implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f6691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f6692b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6693d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f6694g;
    public float h;
    public C.h i;
    public d j;

    private Camera.Size getOptimalPreviewSize() {
        f fVar = this.f6691a;
        Camera.Size size = null;
        if (fVar == null) {
            return null;
        }
        List<Camera.Size> supportedPreviewSizes = fVar.f6695a.getParameters().getSupportedPreviewSizes();
        int width = getWidth();
        int height = getHeight();
        if (s.j(getContext()) == 1) {
            height = width;
            width = height;
        }
        double d10 = ((double) width) / ((double) height);
        if (supportedPreviewSizes == null) {
            return null;
        }
        double dAbs = Double.MAX_VALUE;
        double dAbs2 = Double.MAX_VALUE;
        for (Camera.Size size2 : supportedPreviewSizes) {
            if (Math.abs((((double) size2.width) / ((double) size2.height)) - d10) <= this.h && Math.abs(size2.height - height) < dAbs2) {
                dAbs2 = Math.abs(size2.height - height);
                size = size2;
            }
        }
        if (size == null) {
            for (Camera.Size size3 : supportedPreviewSizes) {
                if (Math.abs(size3.height - height) < dAbs) {
                    size = size3;
                    dAbs = Math.abs(size3.height - height);
                }
            }
        }
        return size;
    }

    public final void a() {
        try {
            this.f6691a.f6695a.autoFocus(this.j);
        } catch (RuntimeException unused) {
            this.f6692b.postDelayed(this.i, 1000L);
        }
    }

    public final void b(int i, int i4) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (getDisplayOrientation() % 180 != 0) {
            i4 = i;
            i = i4;
        }
        if (this.f) {
            float f = i;
            float width = ((View) getParent()).getWidth() / f;
            float f3 = i4;
            float height = ((View) getParent()).getHeight() / f3;
            if (width <= height) {
                width = height;
            }
            i = Math.round(f * width);
            i4 = Math.round(f3 * width);
        }
        layoutParams.width = i;
        layoutParams.height = i4;
        setLayoutParams(layoutParams);
    }

    public final void c() {
        Camera.Size optimalPreviewSize = getOptimalPreviewSize();
        Camera.Parameters parameters = this.f6691a.f6695a.getParameters();
        parameters.setPreviewSize(optimalPreviewSize.width, optimalPreviewSize.height);
        this.f6691a.f6695a.setParameters(parameters);
        Point point = new Point(getWidth(), getHeight());
        if (getDisplayOrientation() % 180 != 0) {
            point = new Point(point.y, point.x);
        }
        float f = optimalPreviewSize.width / optimalPreviewSize.height;
        int i = point.x;
        float f3 = i;
        int i4 = point.y;
        float f7 = i4;
        if (f3 / f7 > f) {
            b((int) (f7 * f), i4);
        } else {
            b(i, (int) (f3 / f));
        }
    }

    public final void d() {
        if (this.f6691a != null) {
            try {
                getHolder().addCallback(this);
                this.c = true;
                c();
                this.f6691a.f6695a.setPreviewDisplay(getHolder());
                this.f6691a.f6695a.setDisplayOrientation(getDisplayOrientation());
                this.f6691a.f6695a.setOneShotPreviewCallback(this.f6694g);
                this.f6691a.f6695a.startPreview();
                if (this.f6693d) {
                    if (this.e) {
                        a();
                    } else {
                        this.f6692b.postDelayed(this.i, 1000L);
                    }
                }
            } catch (Exception e) {
                Log.e("CameraPreview", e.toString(), e);
            }
        }
    }

    public final void e() {
        if (this.f6691a != null) {
            try {
                this.c = false;
                getHolder().removeCallback(this);
                this.f6691a.f6695a.cancelAutoFocus();
                this.f6691a.f6695a.setOneShotPreviewCallback(null);
                this.f6691a.f6695a.stopPreview();
            } catch (Exception e) {
                Log.e("CameraPreview", e.toString(), e);
            }
        }
    }

    public int getDisplayOrientation() {
        int i = 0;
        if (this.f6691a == null) {
            return 0;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i4 = this.f6691a.f6696b;
        if (i4 == -1) {
            Camera.getCameraInfo(0, cameraInfo);
        } else {
            Camera.getCameraInfo(i4, cameraInfo);
        }
        int rotation = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        return cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS)) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS : ((cameraInfo.orientation - i) + SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
    }

    public void setAspectTolerance(float f) {
        this.h = f;
    }

    public void setAutoFocus(boolean z4) {
        if (this.f6691a == null || !this.c || z4 == this.f6693d) {
            return;
        }
        this.f6693d = z4;
        if (!z4) {
            Log.v("CameraPreview", "Cancelling autofocus");
            this.f6691a.f6695a.cancelAutoFocus();
        } else if (!this.e) {
            this.f6692b.postDelayed(this.i, 1000L);
        } else {
            Log.v("CameraPreview", "Starting autofocus");
            a();
        }
    }

    public void setShouldScaleToFill(boolean z4) {
        this.f = z4;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i4, int i6) {
        if (surfaceHolder.getSurface() == null) {
            return;
        }
        e();
        d();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.e = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.e = false;
        e();
    }
}
