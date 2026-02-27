package A1;

import a.AbstractC0617a;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements GLSurfaceView.Renderer, d {
    public static final String[] h = {"y_tex", "u_tex", "v_tex"};
    public static final FloatBuffer i = (FloatBuffer) ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f}).flip();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f20a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f21b = new int[3];
    public final AtomicReference c = new AtomicReference();
    public final int[] e = new int[3];
    public final int[] f = new int[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f23g = new int[3];

    public b(c cVar) {
        this.f20a = cVar;
        for (int i4 = 0; i4 < 3; i4++) {
            int[] iArr = this.f;
            this.f23g[i4] = -1;
            iArr[i4] = -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.c.getAndSet(null) != null) {
            throw new ClassCastException();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i4, int i6) {
        GLES20.glViewport(0, 0, i4, i6);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int iQ = AbstractC0617a.q("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
        this.f22d = iQ;
        GLES20.glUseProgram(iQ);
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f22d, "in_pos");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 2, 5126, false, 0, (Buffer) i);
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.f22d, "in_tc_y");
        int[] iArr = this.e;
        iArr[0] = iGlGetAttribLocation2;
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
        int iGlGetAttribLocation3 = GLES20.glGetAttribLocation(this.f22d, "in_tc_u");
        iArr[1] = iGlGetAttribLocation3;
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation3);
        int iGlGetAttribLocation4 = GLES20.glGetAttribLocation(this.f22d, "in_tc_v");
        iArr[2] = iGlGetAttribLocation4;
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation4);
        AbstractC0617a.n();
        GLES20.glGetUniformLocation(this.f22d, "mColorConversion");
        AbstractC0617a.n();
        int[] iArr2 = this.f21b;
        GLES20.glGenTextures(3, iArr2, 0);
        for (int i4 = 0; i4 < 3; i4++) {
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f22d, h[i4]), i4);
            GLES20.glActiveTexture(33984 + i4);
            GLES20.glBindTexture(3553, iArr2[i4]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
        }
        AbstractC0617a.n();
        AbstractC0617a.n();
    }
}
