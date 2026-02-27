package x1;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements GLSurfaceView.Renderer, InterfaceC2451a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f20866a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f20868d;
    public final float[] e;
    public final float[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f20869g;
    public float h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f20870k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f20867b = new float[16];
    public final float[] c = new float[16];
    public final float[] i = new float[16];
    public final float[] j = new float[16];

    public g(h hVar, e eVar) {
        this.f20870k = hVar;
        float[] fArr = new float[16];
        this.f20868d = fArr;
        float[] fArr2 = new float[16];
        this.e = fArr2;
        float[] fArr3 = new float[16];
        this.f = fArr3;
        this.f20866a = eVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.h = 3.1415927f;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.j, 0, this.f20868d, 0, this.f, 0);
            Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
        }
        Matrix.multiplyMM(this.c, 0, this.f20867b, 0, this.i, 0);
        this.f20866a.a(this.c);
    }

    @Override // x1.InterfaceC2451a
    public final synchronized void onOrientationChange(float[] fArr, float f) {
        float[] fArr2 = this.f20868d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f3 = -f;
        this.h = f3;
        Matrix.setRotateM(this.e, 0, -this.f20869g, (float) Math.cos(f3), (float) Math.sin(this.h), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i4) {
        GLES20.glViewport(0, 0, i, i4);
        float f = i / i4;
        Matrix.perspectiveM(this.f20867b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        h hVar = this.f20870k;
        hVar.f20873d.post(new io.flutter.plugins.firebase.core.a(17, hVar, this.f20866a.b()));
    }
}
