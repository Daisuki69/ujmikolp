package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ph.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2108p extends AtomicReference implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2104o f19586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19587b;
    public final ch.r c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19588d;

    public C2108p(C2104o c2104o, int i, ch.r rVar) {
        this.f19586a = c2104o;
        this.f19587b = i;
        this.c = rVar;
    }

    @Override // ch.r
    public final void onComplete() {
        boolean z4 = this.f19588d;
        ch.r rVar = this.c;
        if (z4) {
            rVar.onComplete();
        } else if (this.f19586a.a(this.f19587b)) {
            this.f19588d = true;
            rVar.onComplete();
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        boolean z4 = this.f19588d;
        ch.r rVar = this.c;
        if (z4) {
            rVar.onError(th2);
        } else if (!this.f19586a.a(this.f19587b)) {
            S1.s.r(th2);
        } else {
            this.f19588d = true;
            rVar.onError(th2);
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        boolean z4 = this.f19588d;
        ch.r rVar = this.c;
        if (z4) {
            rVar.onNext(obj);
        } else if (!this.f19586a.a(this.f19587b)) {
            ((InterfaceC1486b) get()).dispose();
        } else {
            this.f19588d = true;
            rVar.onNext(obj);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this, interfaceC1486b);
    }
}
