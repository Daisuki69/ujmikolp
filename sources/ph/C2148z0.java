package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ph.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2148z0 implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.x f19701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19702b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1486b f19703d;
    public long e;
    public boolean f;

    public C2148z0(ch.x xVar, long j, Object obj) {
        this.f19701a = xVar;
        this.f19702b = j;
        this.c = obj;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f19703d.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f) {
            return;
        }
        this.f = true;
        ch.x xVar = this.f19701a;
        Object obj = this.c;
        if (obj != null) {
            xVar.onSuccess(obj);
        } else {
            xVar.onError(new NoSuchElementException());
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.f) {
            S1.s.r(th2);
        } else {
            this.f = true;
            this.f19701a.onError(th2);
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f) {
            return;
        }
        long j = this.e;
        if (j != this.f19702b) {
            this.e = j + 1;
            return;
        }
        this.f = true;
        this.f19703d.dispose();
        this.f19701a.onSuccess(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f19703d, interfaceC1486b)) {
            this.f19703d = interfaceC1486b;
            this.f19701a.onSubscribe(this);
        }
    }
}
