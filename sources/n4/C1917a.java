package n4;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import androidx.media3.exoplayer.ExoPlayer;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;

/* JADX INFO: renamed from: n4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1917a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayList f18591g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18593b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Camera f18594d;
    public final Handler e;
    public final Xj.d f;

    static {
        ArrayList arrayList = new ArrayList(2);
        f18591g = arrayList;
        arrayList.add(numX49.tnTj78("brE0"));
        arrayList.add(numX49.tnTj78("brEg"));
    }

    public C1917a(Camera camera, C1923g c1923g) {
        C.c cVar = new C.c(this, 2);
        this.f = new Xj.d(this, 1);
        this.e = new Handler(cVar);
        this.f18594d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        c1923g.getClass();
        boolean zContains = f18591g.contains(focusMode);
        this.c = zContains;
        Log.i(numX49.tnTj78("brEn"), numX49.tnTj78("brEf") + focusMode + numX49.tnTj78("brE1") + zContains);
        this.f18592a = false;
        b();
    }

    public final synchronized void a() {
        if (!this.f18592a && !this.e.hasMessages(1)) {
            Handler handler = this.e;
            handler.sendMessageDelayed(handler.obtainMessage(1), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        }
    }

    public final void b() {
        if (!this.c || this.f18592a || this.f18593b) {
            return;
        }
        try {
            this.f18594d.autoFocus(this.f);
            this.f18593b = true;
        } catch (RuntimeException e) {
            Log.w(numX49.tnTj78("brEx"), numX49.tnTj78("brEs"), e);
            a();
        }
    }

    public final void c() {
        this.f18592a = true;
        this.f18593b = false;
        this.e.removeMessages(1);
        if (this.c) {
            try {
                this.f18594d.cancelAutoFocus();
            } catch (RuntimeException e) {
                Log.w(numX49.tnTj78("brE5"), numX49.tnTj78("brEJ"), e);
            }
        }
    }
}
