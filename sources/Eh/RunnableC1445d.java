package eh;

import S1.s;
import android.os.Handler;
import fh.InterfaceC1486b;

/* JADX INFO: renamed from: eh.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC1445d implements Runnable, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f16677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f16678b;

    public RunnableC1445d(Handler handler, Runnable runnable) {
        this.f16677a = handler;
        this.f16678b = runnable;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f16677a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f16678b.run();
        } catch (Throwable th2) {
            s.r(th2);
        }
    }
}
