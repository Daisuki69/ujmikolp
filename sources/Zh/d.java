package zh;

import android.os.Handler;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements Runnable, io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f21443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f21444b;

    public d(Handler handler, Runnable runnable) {
        this.f21443a = handler;
        this.f21444b = runnable;
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.f21443a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f21444b.run();
        } catch (Throwable th2) {
            E1.c.k(th2);
        }
    }
}
