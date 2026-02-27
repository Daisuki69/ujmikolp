package oh;

import S1.s;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends AtomicReference implements ch.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f18876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f18877b;

    public i(j jVar) {
        this.f18876a = jVar;
    }

    @Override // ch.i
    public final void onComplete() {
        j jVar = this.f18876a;
        AtomicReference atomicReference = jVar.e;
        while (!atomicReference.compareAndSet(this, null)) {
            if (atomicReference.get() != this) {
                return;
            }
        }
        jVar.b();
    }

    @Override // ch.i, ch.x
    public final void onError(Throwable th2) {
        j jVar = this.f18876a;
        AtomicReference atomicReference = jVar.e;
        while (true) {
            if (atomicReference.compareAndSet(this, null)) {
                Qh.c cVar = jVar.f18880d;
                cVar.getClass();
                if (AbstractC2353d.a(cVar, th2)) {
                    if (!jVar.c) {
                        jVar.f.dispose();
                        jVar.a();
                    }
                    jVar.b();
                    return;
                }
            } else if (atomicReference.get() != this) {
                break;
            }
        }
        s.r(th2);
    }

    @Override // ch.i
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this, interfaceC1486b);
    }

    @Override // ch.i, ch.x
    public final void onSuccess(Object obj) {
        this.f18877b = obj;
        this.f18876a.b();
    }
}
