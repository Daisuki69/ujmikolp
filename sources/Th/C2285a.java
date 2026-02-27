package th;

import S1.s;
import X5.f;
import ch.InterfaceC1108g;
import dOYHB6.tiZVw8.numX49;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jh.e;
import nk.b;
import nk.c;
import uh.EnumC2313a;
import vh.AbstractC2353d;

/* JADX INFO: renamed from: th.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2285a extends AtomicInteger implements InterfaceC1108g, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f20203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Qh.c f20204b = new Qh.c();
    public final AtomicLong c = new AtomicLong();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f20205d = new AtomicReference();
    public final AtomicBoolean e = new AtomicBoolean();
    public volatile boolean f;

    public C2285a(b bVar) {
        this.f20203a = bVar;
    }

    @Override // nk.b
    public final void c(c cVar) {
        if (!this.e.compareAndSet(false, true)) {
            cVar.cancel();
            cancel();
            onError(new IllegalStateException(numX49.tnTj78("bFx2")));
            return;
        }
        this.f20203a.c(this);
        AtomicReference atomicReference = this.f20205d;
        AtomicLong atomicLong = this.c;
        e.b(cVar, numX49.tnTj78("bFxP"));
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                cVar.cancel();
                if (atomicReference.get() != EnumC2313a.f20320a) {
                    s.r(new ProtocolViolationException(numX49.tnTj78("bFxb")));
                    return;
                }
                return;
            }
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet != 0) {
            cVar.request(andSet);
        }
    }

    @Override // nk.c
    public final void cancel() {
        c cVar;
        if (this.f) {
            return;
        }
        AtomicReference atomicReference = this.f20205d;
        c cVar2 = (c) atomicReference.get();
        EnumC2313a enumC2313a = EnumC2313a.f20320a;
        if (cVar2 == enumC2313a || (cVar = (c) atomicReference.getAndSet(enumC2313a)) == enumC2313a || cVar == null) {
            return;
        }
        cVar.cancel();
    }

    @Override // nk.b
    public final void onComplete() {
        this.f = true;
        b bVar = this.f20203a;
        Qh.c cVar = this.f20204b;
        if (getAndIncrement() == 0) {
            cVar.getClass();
            Throwable thB = AbstractC2353d.b(cVar);
            if (thB != null) {
                bVar.onError(thB);
            } else {
                bVar.onComplete();
            }
        }
    }

    @Override // nk.b
    public final void onError(Throwable th2) {
        this.f = true;
        b bVar = this.f20203a;
        Qh.c cVar = this.f20204b;
        cVar.getClass();
        if (!AbstractC2353d.a(cVar, th2)) {
            s.r(th2);
        } else if (getAndIncrement() == 0) {
            bVar.onError(AbstractC2353d.b(cVar));
        }
    }

    @Override // nk.b
    public final void onNext(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            b bVar = this.f20203a;
            bVar.onNext(obj);
            if (decrementAndGet() != 0) {
                Qh.c cVar = this.f20204b;
                cVar.getClass();
                Throwable thB = AbstractC2353d.b(cVar);
                if (thB != null) {
                    bVar.onError(thB);
                } else {
                    bVar.onComplete();
                }
            }
        }
    }

    @Override // nk.c
    public final void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException(androidx.camera.core.impl.a.f(j, numX49.tnTj78("bFxL"))));
            return;
        }
        AtomicReference atomicReference = this.f20205d;
        AtomicLong atomicLong = this.c;
        c cVar = (c) atomicReference.get();
        if (cVar != null) {
            cVar.request(j);
            return;
        }
        if (EnumC2313a.a(j)) {
            f.e(atomicLong, j);
            c cVar2 = (c) atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.request(andSet);
                }
            }
        }
    }
}
