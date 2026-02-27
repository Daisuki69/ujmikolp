package We;

import android.os.HandlerThread;
import android.os.Looper;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T3.l f6362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerC0609m f6363b;
    public long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6364d;
    public long e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6365g;
    public long h;
    public long i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6366k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6367l;
    public int m;

    public I(T3.l lVar) {
        int i = 1;
        this.f6362a = lVar;
        HandlerThread handlerThread = new HandlerThread(numX49.tnTj78("bkRv"), 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb2 = O.f6375a;
        y yVar = new y(looper, i);
        yVar.sendMessageDelayed(yVar.obtainMessage(), 1000L);
        this.f6363b = new HandlerC0609m(handlerThread.getLooper(), this, i);
    }

    public final J a() {
        p pVar = (p) this.f6362a.f5786b;
        return new J(pVar.maxSize(), pVar.size(), this.c, this.f6364d, this.e, this.f, this.f6365g, this.h, this.i, this.j, this.f6366k, this.f6367l, this.m, System.currentTimeMillis());
    }
}
