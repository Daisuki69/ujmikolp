package oh;

import ch.InterfaceC1104c;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends AtomicReference implements InterfaceC1104c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f18869a;

    public f(g gVar) {
        this.f18869a = gVar;
    }

    @Override // ch.InterfaceC1104c, ch.i
    public final void onComplete() {
        g gVar = this.f18869a;
        AtomicReference atomicReference = gVar.e;
        while (!atomicReference.compareAndSet(this, null)) {
            if (atomicReference.get() != this) {
                return;
            }
        }
        if (gVar.f) {
            Qh.c cVar = gVar.f18872d;
            cVar.getClass();
            Throwable thB = AbstractC2353d.b(cVar);
            if (thB == null) {
                gVar.f18870a.onComplete();
            } else {
                gVar.f18870a.onError(thB);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        S1.s.r(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        return;
     */
    @Override // ch.InterfaceC1104c, ch.i, ch.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            oh.g r0 = r3.f18869a
            java.util.concurrent.atomic.AtomicReference r1 = r0.e
        L4:
            r2 = 0
            boolean r2 = r1.compareAndSet(r3, r2)
            if (r2 == 0) goto L43
            Qh.c r1 = r0.f18872d
            r1.getClass()
            boolean r1 = vh.AbstractC2353d.a(r1, r4)
            if (r1 == 0) goto L49
            boolean r4 = r0.c
            if (r4 == 0) goto L2d
            boolean r4 = r0.f
            if (r4 == 0) goto L42
            Qh.c r4 = r0.f18872d
            r4.getClass()
            java.lang.Throwable r4 = vh.AbstractC2353d.b(r4)
            ch.c r0 = r0.f18870a
            r0.onError(r4)
            return
        L2d:
            r0.dispose()
            Qh.c r4 = r0.f18872d
            r4.getClass()
            java.lang.Throwable r4 = vh.AbstractC2353d.b(r4)
            Qh.d r1 = vh.AbstractC2353d.f20501a
            if (r4 == r1) goto L42
            ch.c r0 = r0.f18870a
            r0.onError(r4)
        L42:
            return
        L43:
            java.lang.Object r2 = r1.get()
            if (r2 == r3) goto L4
        L49:
            S1.s.r(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oh.f.onError(java.lang.Throwable):void");
    }

    @Override // ch.InterfaceC1104c, ch.i
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this, interfaceC1486b);
    }
}
