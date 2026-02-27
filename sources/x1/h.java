package x1;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import n1.x;
import w1.RunnableC2367e;
import z1.AbstractC2550e;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends GLSurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SensorManager f20871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sensor f20872b;
    public final C2452b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f20873d;
    public final i e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SurfaceTexture f20874g;
    public Surface h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f20875k;

    public h(Context context) {
        super(context, null);
        this.f20873d = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f20871a = sensorManager;
        Sensor defaultSensor = AbstractC2550e.f21351a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f20872b = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        e eVar = new e();
        this.f = eVar;
        g gVar = new g(this, eVar);
        i iVar = new i(context, gVar);
        this.e = iVar;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.c = new C2452b(windowManager.getDefaultDisplay(), iVar, gVar);
        this.i = true;
        setEGLContextClientVersion(2);
        setRenderer(gVar);
        setOnTouchListener(iVar);
    }

    public final void a() {
        boolean z4 = this.i && this.j;
        Sensor sensor = this.f20872b;
        if (sensor == null || z4 == this.f20875k) {
            return;
        }
        C2452b c2452b = this.c;
        SensorManager sensorManager = this.f20871a;
        if (z4) {
            sensorManager.registerListener(c2452b, sensor, 0);
        } else {
            sensorManager.unregisterListener(c2452b);
        }
        this.f20875k = z4;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20873d.post(new RunnableC2367e(this, 3));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.j = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.j = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.f.getClass();
    }

    public void setSingleTapListener(@Nullable f fVar) {
        this.e.f20879g = fVar;
    }

    public void setUseSensorRotation(boolean z4) {
        this.i = z4;
        a();
    }

    public void setVideoComponent(@Nullable x xVar) {
    }
}
