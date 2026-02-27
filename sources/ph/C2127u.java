package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ph.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2127u extends AtomicReference implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2131v f19647a;

    public C2127u(C2131v c2131v) {
        this.f19647a = c2131v;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this);
    }

    @Override // ch.r
    public final void onComplete() {
        lazySet(EnumC1604b.f17147a);
        C2131v c2131v = this.f19647a;
        c2131v.e.c(this);
        if (c2131v.e.h() == 0) {
            EnumC1604b.a(c2131v.f);
            c2131v.h = true;
            c2131v.b();
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        lazySet(EnumC1604b.f17147a);
        C2131v c2131v = this.f19647a;
        EnumC1604b.a(c2131v.f);
        c2131v.e.c(this);
        c2131v.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        C2131v c2131v = this.f19647a;
        c2131v.getClass();
        try {
            Object objCall = c2131v.f19656b.call();
            jh.e.b(objCall, "The bufferSupplier returned a null Collection");
            Collection collection = (Collection) objCall;
            Object objApply = c2131v.f19657d.apply(obj);
            jh.e.b(objApply, "The bufferClose returned a null ObservableSource");
            ch.p pVar = (ch.p) objApply;
            long j = c2131v.f19659k;
            c2131v.f19659k = 1 + j;
            synchronized (c2131v) {
                try {
                    LinkedHashMap linkedHashMap = c2131v.f19660l;
                    if (linkedHashMap == null) {
                        return;
                    }
                    linkedHashMap.put(Long.valueOf(j), collection);
                    C2135w c2135w = new C2135w(c2131v, j);
                    c2131v.e.a(c2135w);
                    pVar.subscribe(c2135w);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            of.p.F(th3);
            EnumC1604b.a(c2131v.f);
            c2131v.onError(th3);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this, interfaceC1486b);
    }
}
