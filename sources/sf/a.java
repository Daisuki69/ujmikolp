package Sf;

import B5.g;
import C.h;
import J1.e;
import Lh.c;
import Qf.b;
import S1.r;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Qf.a, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5724b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5725d;
    public Object e;
    public Object f;

    public a(c cVar, e eVar) {
        this.f5724b = cVar;
        this.c = Executors.newSingleThreadExecutor();
        this.f5725d = new Cg.c(25, this, eVar, cVar);
        this.f5723a = 60000;
    }

    @Override // Qf.a
    public void a(Pf.a aVar) {
        ((ExecutorService) this.c).submit(new g(12, this, aVar));
        c();
    }

    @Override // Qf.b
    public void b() {
        ((Handler) this.e).removeCallbacksAndMessages(null);
        ((Handler) this.e).getLooper().quit();
        ((HandlerThread) this.f).quit();
        this.e = null;
    }

    public void c() {
        if (((Handler) this.e) == null) {
            r.f("Starting handler with send interval: " + this.f5723a);
            HandlerThread handlerThread = new HandlerThread("handlerThread");
            this.f = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(((HandlerThread) this.f).getLooper());
            this.e = handler;
            handler.post(new h(this, 6));
        }
    }

    @Override // Qf.b
    public void finish() {
    }

    public a(String str, int i) {
        this.f5724b = str;
        this.f5723a = i;
    }
}
