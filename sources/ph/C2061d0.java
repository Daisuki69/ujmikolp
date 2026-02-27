package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;
import xh.C2479c;

/* JADX INFO: renamed from: ph.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2061d0 implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2479c f19432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19433b;
    public InterfaceC1486b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f19434d = new AtomicReference();
    public volatile long e;
    public boolean f;

    public C2061d0(C2479c c2479c, hh.n nVar) {
        this.f19432a = c2479c;
        this.f19433b = nVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.c.dispose();
        EnumC1604b.a(this.f19434d);
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f) {
            return;
        }
        this.f = true;
        AtomicReference atomicReference = this.f19434d;
        InterfaceC1486b interfaceC1486b = (InterfaceC1486b) atomicReference.get();
        if (interfaceC1486b != EnumC1604b.f17147a) {
            C2057c0 c2057c0 = (C2057c0) interfaceC1486b;
            if (c2057c0 != null) {
                c2057c0.a();
            }
            EnumC1604b.a(atomicReference);
            this.f19432a.onComplete();
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        EnumC1604b.a(this.f19434d);
        this.f19432a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f) {
            return;
        }
        long j = this.e + 1;
        this.e = j;
        InterfaceC1486b interfaceC1486b = (InterfaceC1486b) this.f19434d.get();
        if (interfaceC1486b != null) {
            interfaceC1486b.dispose();
        }
        try {
            Object objApply = this.f19433b.apply(obj);
            jh.e.b(objApply, "The ObservableSource supplied is null");
            ch.p pVar = (ch.p) objApply;
            C2057c0 c2057c0 = new C2057c0(this, j, obj);
            AtomicReference atomicReference = this.f19434d;
            while (!atomicReference.compareAndSet(interfaceC1486b, c2057c0)) {
                if (atomicReference.get() != interfaceC1486b) {
                    return;
                }
            }
            pVar.subscribe(c2057c0);
        } catch (Throwable th2) {
            of.p.F(th2);
            dispose();
            this.f19432a.onError(th2);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.c, interfaceC1486b)) {
            this.c = interfaceC1486b;
            this.f19432a.onSubscribe(this);
        }
    }
}
