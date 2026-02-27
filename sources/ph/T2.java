package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import ih.EnumC1605c;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class T2 extends AtomicReference implements InterfaceC1486b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19347a;

    public T2(ch.r rVar) {
        this.f19347a = rVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == EnumC1604b.f17147a) {
            return;
        }
        ch.r rVar = this.f19347a;
        rVar.onNext(0L);
        lazySet(EnumC1605c.f17149a);
        rVar.onComplete();
    }
}
