package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ph.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2132v0 implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19662b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19663d;
    public InterfaceC1486b e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19664g;

    public C2132v0(ch.r rVar, long j, Object obj, boolean z4) {
        this.f19661a = rVar;
        this.f19662b = j;
        this.c = obj;
        this.f19663d = z4;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.e.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f19664g) {
            return;
        }
        this.f19664g = true;
        ch.r rVar = this.f19661a;
        Object obj = this.c;
        if (obj == null && this.f19663d) {
            rVar.onError(new NoSuchElementException());
            return;
        }
        if (obj != null) {
            rVar.onNext(obj);
        }
        rVar.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.f19664g) {
            S1.s.r(th2);
        } else {
            this.f19664g = true;
            this.f19661a.onError(th2);
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f19664g) {
            return;
        }
        long j = this.f;
        if (j != this.f19662b) {
            this.f = j + 1;
            return;
        }
        this.f19664g = true;
        this.e.dispose();
        ch.r rVar = this.f19661a;
        rVar.onNext(obj);
        rVar.onComplete();
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.e, interfaceC1486b)) {
            this.e = interfaceC1486b;
            this.f19661a.onSubscribe(this);
        }
    }
}
