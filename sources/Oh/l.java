package oh;

import S1.s;
import ch.x;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends AtomicReference implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f18885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f18886b;

    public l(m mVar) {
        this.f18885a = mVar;
    }

    @Override // ch.x
    public final void onError(Throwable th2) {
        m mVar = this.f18885a;
        AtomicReference atomicReference = mVar.e;
        while (true) {
            if (atomicReference.compareAndSet(this, null)) {
                Qh.c cVar = mVar.f18889d;
                cVar.getClass();
                if (AbstractC2353d.a(cVar, th2)) {
                    if (!mVar.c) {
                        mVar.f.dispose();
                        mVar.a();
                    }
                    mVar.b();
                    return;
                }
            } else if (atomicReference.get() != this) {
                break;
            }
        }
        s.r(th2);
    }

    @Override // ch.x, ch.InterfaceC1104c, ch.i
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this, interfaceC1486b);
    }

    @Override // ch.x
    public final void onSuccess(Object obj) {
        this.f18886b = obj;
        this.f18885a.b();
    }
}
