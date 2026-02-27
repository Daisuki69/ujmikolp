package af;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7152b;
    public HandlerThread c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f7153d;
    public B5.g e;
    public f f;

    public g(String str, int i) {
        this.f7151a = str;
        this.f7152b = i;
    }

    public final synchronized void a() {
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.c = null;
            this.f7153d = null;
        }
    }

    public final synchronized void b(B5.g gVar) {
        HandlerThread handlerThread = new HandlerThread(this.f7151a, this.f7152b);
        this.c = handlerThread;
        handlerThread.start();
        this.f7153d = new Handler(this.c.getLooper());
        this.e = gVar;
    }
}
