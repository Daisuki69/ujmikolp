package x1;

import a.AbstractC0617a;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.text.TextUtils;
import com.dynatrace.android.agent.Global;
import java.nio.IntBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f20862a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f20863b = new AtomicBoolean(true);
    public final C2453c c = new C2453c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B1.a f20864d = new B1.a(0);
    public final Q3.b e = new Q3.b(4);
    public final Q3.b f = new Q3.b(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f20865g = new float[16];
    public final float[] h = new float[16];
    public int i;
    public SurfaceTexture j;

    public final void a(float[] fArr) {
        Object objD;
        GLES20.glClear(16384);
        AbstractC0617a.n();
        if (this.f20862a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            AbstractC0617a.n();
            if (this.f20863b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f20865g, 0);
            }
            long timestamp = this.j.getTimestamp();
            Q3.b bVar = this.e;
            synchronized (bVar) {
                objD = bVar.d(timestamp, false);
            }
            Long l6 = (Long) objD;
            if (l6 != null) {
                B1.a aVar = this.f20864d;
                float[] fArr2 = this.f20865g;
                float[] fArr3 = (float[]) ((Q3.b) aVar.e).e(l6.longValue());
                if (fArr3 != null) {
                    float f = fArr3[0];
                    float f3 = -fArr3[1];
                    float f7 = -fArr3[2];
                    float length = Matrix.length(f, f3, f7);
                    float[] fArr4 = (float[]) aVar.f337d;
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f3 / length, f7 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!aVar.f336b) {
                        B1.a.a((float[]) aVar.c, (float[]) aVar.f337d);
                        aVar.f336b = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) aVar.c, 0, (float[]) aVar.f337d, 0);
                }
            }
            if (this.f.e(timestamp) != null) {
                throw new ClassCastException();
            }
        }
        Matrix.multiplyMM(this.h, 0, fArr, 0, this.f20865g, 0);
        this.c.getClass();
    }

    public final SurfaceTexture b() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        AbstractC0617a.n();
        C2453c c2453c = this.c;
        c2453c.getClass();
        int iQ = AbstractC0617a.q(TextUtils.join(Global.NEWLINE, C2453c.f20859b), TextUtils.join(Global.NEWLINE, C2453c.c));
        c2453c.f20860a = iQ;
        GLES20.glGetUniformLocation(iQ, "uMvpMatrix");
        GLES20.glGetUniformLocation(c2453c.f20860a, "uTexMatrix");
        GLES20.glGetAttribLocation(c2453c.f20860a, "aPosition");
        GLES20.glGetAttribLocation(c2453c.f20860a, "aTexCoords");
        GLES20.glGetUniformLocation(c2453c.f20860a, "uTexture");
        AbstractC0617a.n();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        AbstractC0617a.n();
        this.i = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
        this.j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: x1.d
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f20861a.f20862a.set(true);
            }
        });
        return this.j;
    }
}
