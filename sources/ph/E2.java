package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import ih.EnumC1605c;

/* JADX INFO: loaded from: classes4.dex */
public final class E2 implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19176b;
    public InterfaceC1486b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19177d;

    public E2(ch.r rVar, long j) {
        this.f19175a = rVar;
        this.f19177d = j;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.c.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f19176b) {
            return;
        }
        this.f19176b = true;
        this.c.dispose();
        this.f19175a.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.f19176b) {
            S1.s.r(th2);
            return;
        }
        this.f19176b = true;
        this.c.dispose();
        this.f19175a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f19176b) {
            return;
        }
        long j = this.f19177d;
        long j6 = j - 1;
        this.f19177d = j6;
        if (j > 0) {
            boolean z4 = j6 == 0;
            this.f19175a.onNext(obj);
            if (z4) {
                onComplete();
            }
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.c, interfaceC1486b)) {
            this.c = interfaceC1486b;
            long j = this.f19177d;
            ch.r rVar = this.f19175a;
            if (j != 0) {
                rVar.onSubscribe(this);
                return;
            }
            this.f19176b = true;
            interfaceC1486b.dispose();
            EnumC1605c.a(rVar);
        }
    }
}
