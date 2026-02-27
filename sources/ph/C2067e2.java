package ph;

import fh.C1487c;
import fh.InterfaceC1486b;
import hh.InterfaceC1571d;
import ih.EnumC1604b;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;
import n3.C1916a;

/* JADX INFO: renamed from: ph.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2067e2 extends AtomicInteger implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1487c f19449b;
    public final ch.p c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1571d f19450d;
    public int e;

    public C2067e2(ch.r rVar, InterfaceC1571d interfaceC1571d, C1487c c1487c, ch.p pVar) {
        this.f19448a = rVar;
        this.f19449b = c1487c;
        this.c = pVar;
        this.f19450d = interfaceC1571d;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.f19449b.a()) {
                this.c.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // ch.r
    public final void onComplete() {
        this.f19448a.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        ch.r rVar = this.f19448a;
        try {
            InterfaceC1571d interfaceC1571d = this.f19450d;
            int i = this.e + 1;
            this.e = i;
            Integer numValueOf = Integer.valueOf(i);
            ((C1916a) interfaceC1571d).getClass();
            if (jh.e.a(numValueOf, th2)) {
                a();
            } else {
                rVar.onError(th2);
            }
        } catch (Throwable th3) {
            of.p.F(th3);
            rVar.onError(new CompositeException(th2, th3));
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.f19448a.onNext(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        C1487c c1487c = this.f19449b;
        c1487c.getClass();
        EnumC1604b.c(c1487c, interfaceC1486b);
    }
}
