package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import xh.C2479c;

/* JADX INFO: loaded from: classes4.dex */
public final class J2 extends AtomicReference implements ch.r, InterfaceC1486b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2479c f19235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19236b;
    public final TimeUnit c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ch.u f19237d;
    public InterfaceC1486b e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19238g;

    public J2(C2479c c2479c, long j, TimeUnit timeUnit, ch.u uVar) {
        this.f19235a = c2479c;
        this.f19236b = j;
        this.c = timeUnit;
        this.f19237d = uVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.e.dispose();
        this.f19237d.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f19238g) {
            return;
        }
        this.f19238g = true;
        this.f19235a.onComplete();
        this.f19237d.dispose();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.f19238g) {
            S1.s.r(th2);
            return;
        }
        this.f19238g = true;
        this.f19235a.onError(th2);
        this.f19237d.dispose();
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f || this.f19238g) {
            return;
        }
        this.f = true;
        this.f19235a.onNext(obj);
        InterfaceC1486b interfaceC1486b = (InterfaceC1486b) get();
        if (interfaceC1486b != null) {
            interfaceC1486b.dispose();
        }
        EnumC1604b.c(this, this.f19237d.b(this, this.f19236b, this.c));
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.e, interfaceC1486b)) {
            this.e = interfaceC1486b;
            this.f19235a.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f = false;
    }
}
