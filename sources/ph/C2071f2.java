package ph;

import fh.C1487c;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ph.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2071f2 extends AtomicInteger implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1487c f19465b;
    public final ch.p c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hh.o f19466d;
    public long e;

    public C2071f2(ch.r rVar, long j, hh.o oVar, C1487c c1487c, ch.p pVar) {
        this.f19464a = rVar;
        this.f19465b = c1487c;
        this.c = pVar;
        this.f19466d = oVar;
        this.e = j;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.f19465b.a()) {
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
        this.f19464a.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        long j = this.e;
        if (j != Long.MAX_VALUE) {
            this.e = j - 1;
        }
        ch.r rVar = this.f19464a;
        if (j == 0) {
            rVar.onError(th2);
            return;
        }
        try {
            if (this.f19466d.test(th2)) {
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
        this.f19464a.onNext(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        C1487c c1487c = this.f19465b;
        c1487c.getClass();
        EnumC1604b.c(c1487c, interfaceC1486b);
    }
}
