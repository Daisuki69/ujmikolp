package mh;

import ch.InterfaceC1108g;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kh.InterfaceC1776c;
import kh.InterfaceC1778e;
import of.p;
import p3.C2011b;
import uh.EnumC2313a;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AtomicInteger implements InterfaceC1108g, InterfaceC1776c, nk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1108g f18426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1778e f18427b;
    public final C2011b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public nk.c f18428d;
    public volatile boolean e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Throwable f18429g;
    public final AtomicLong h = new AtomicLong();

    public d(InterfaceC1108g interfaceC1108g, int i, boolean z4, C2011b c2011b) {
        this.f18426a = interfaceC1108g;
        this.c = c2011b;
        this.f18427b = z4 ? new rh.c(i) : new rh.b(i);
    }

    public final boolean a(boolean z4, boolean z5, nk.b bVar) {
        if (this.e) {
            this.f18427b.clear();
            return true;
        }
        if (!z4) {
            return false;
        }
        Throwable th2 = this.f18429g;
        if (th2 != null) {
            this.f18427b.clear();
            bVar.onError(th2);
            return true;
        }
        if (!z5) {
            return false;
        }
        bVar.onComplete();
        return true;
    }

    @Override // nk.b
    public final void c(nk.c cVar) {
        if (EnumC2313a.b(this.f18428d, cVar)) {
            this.f18428d = cVar;
            this.f18426a.c(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // nk.c
    public final void cancel() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f18428d.cancel();
        if (getAndIncrement() == 0) {
            this.f18427b.clear();
        }
    }

    @Override // kh.InterfaceC1779f
    public final void clear() {
        this.f18427b.clear();
    }

    public final void e() {
        if (getAndIncrement() == 0) {
            InterfaceC1778e interfaceC1778e = this.f18427b;
            InterfaceC1108g interfaceC1108g = this.f18426a;
            int iAddAndGet = 1;
            while (!a(this.f, interfaceC1778e.isEmpty(), interfaceC1108g)) {
                long j = this.h.get();
                long j6 = 0;
                while (j6 != j) {
                    boolean z4 = this.f;
                    Object objPoll = interfaceC1778e.poll();
                    boolean z5 = objPoll == null;
                    if (a(z4, z5, interfaceC1108g)) {
                        return;
                    }
                    if (z5) {
                        break;
                    }
                    interfaceC1108g.onNext(objPoll);
                    j6++;
                }
                if (j6 == j && a(this.f, interfaceC1778e.isEmpty(), interfaceC1108g)) {
                    return;
                }
                if (j6 != 0 && j != Long.MAX_VALUE) {
                    this.h.addAndGet(-j6);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // kh.InterfaceC1779f
    public final boolean isEmpty() {
        return this.f18427b.isEmpty();
    }

    @Override // kh.InterfaceC1779f
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // nk.b
    public final void onComplete() {
        this.f = true;
        e();
    }

    @Override // nk.b
    public final void onError(Throwable th2) {
        this.f18429g = th2;
        this.f = true;
        e();
    }

    @Override // nk.b
    public final void onNext(Object obj) {
        if (this.f18427b.offer(obj)) {
            e();
            return;
        }
        this.f18428d.cancel();
        MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
        try {
            this.c.getClass();
        } catch (Throwable th2) {
            p.F(th2);
            missingBackpressureException.initCause(th2);
        }
        onError(missingBackpressureException);
    }

    @Override // kh.InterfaceC1779f
    public final Object poll() {
        return this.f18427b.poll();
    }

    @Override // nk.c
    public final void request(long j) {
        if (EnumC2313a.a(j)) {
            X5.f.e(this.h, j);
            e();
        }
    }
}
