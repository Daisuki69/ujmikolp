package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.TimeUnit;
import xh.C2479c;

/* JADX INFO: renamed from: ph.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2073g0 implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2479c f19471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19472b;
    public final TimeUnit c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ch.u f19473d;
    public InterfaceC1486b e;
    public RunnableC2069f0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile long f19474g;
    public boolean h;

    public C2073g0(C2479c c2479c, long j, TimeUnit timeUnit, ch.u uVar) {
        this.f19471a = c2479c;
        this.f19472b = j;
        this.c = timeUnit;
        this.f19473d = uVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.e.dispose();
        this.f19473d.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.h) {
            return;
        }
        this.h = true;
        RunnableC2069f0 runnableC2069f0 = this.f;
        if (runnableC2069f0 != null) {
            EnumC1604b.a(runnableC2069f0);
        }
        if (runnableC2069f0 != null) {
            runnableC2069f0.run();
        }
        this.f19471a.onComplete();
        this.f19473d.dispose();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.h) {
            S1.s.r(th2);
            return;
        }
        RunnableC2069f0 runnableC2069f0 = this.f;
        if (runnableC2069f0 != null) {
            EnumC1604b.a(runnableC2069f0);
        }
        this.h = true;
        this.f19471a.onError(th2);
        this.f19473d.dispose();
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.h) {
            return;
        }
        long j = this.f19474g + 1;
        this.f19474g = j;
        RunnableC2069f0 runnableC2069f0 = this.f;
        if (runnableC2069f0 != null) {
            EnumC1604b.a(runnableC2069f0);
        }
        RunnableC2069f0 runnableC2069f02 = new RunnableC2069f0(obj, j, this);
        this.f = runnableC2069f02;
        EnumC1604b.c(runnableC2069f02, this.f19473d.b(runnableC2069f02, this.f19472b, this.c));
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.e, interfaceC1486b)) {
            this.e = interfaceC1486b;
            this.f19471a.onSubscribe(this);
        }
    }
}
