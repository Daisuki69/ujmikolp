package A1;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends GLSurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f24a;

    public c(Context context) {
        super(context, null);
        b bVar = new b(this);
        this.f24a = bVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(bVar);
        setRenderMode(0);
    }

    public d getVideoDecoderOutputBufferRenderer() {
        return this.f24a;
    }
}
