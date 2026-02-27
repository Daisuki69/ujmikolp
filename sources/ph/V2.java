package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class V2 extends AtomicBoolean implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.v f19364b;
    public InterfaceC1486b c;

    public V2(ch.r rVar, ch.v vVar) {
        this.f19363a = rVar;
        this.f19364b = vVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.f19364b.d(new U2(this, 0));
        }
    }

    @Override // ch.r
    public final void onComplete() {
        if (get()) {
            return;
        }
        this.f19363a.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (get()) {
            S1.s.r(th2);
        } else {
            this.f19363a.onError(th2);
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (get()) {
            return;
        }
        this.f19363a.onNext(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.c, interfaceC1486b)) {
            this.c = interfaceC1486b;
            this.f19363a.onSubscribe(this);
        }
    }
}
