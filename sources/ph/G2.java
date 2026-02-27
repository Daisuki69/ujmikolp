package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class G2 extends AtomicBoolean implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19199b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f19200d;
    public final ch.v e;
    public final rh.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19201g;
    public InterfaceC1486b h;
    public volatile boolean i;
    public Throwable j;

    public G2(ch.r rVar, long j, long j6, TimeUnit timeUnit, ch.v vVar, int i, boolean z4) {
        this.f19198a = rVar;
        this.f19199b = j;
        this.c = j6;
        this.f19200d = timeUnit;
        this.e = vVar;
        this.f = new rh.c(i);
        this.f19201g = z4;
    }

    public final void a() {
        Throwable th2;
        if (compareAndSet(false, true)) {
            ch.r rVar = this.f19198a;
            rh.c cVar = this.f;
            boolean z4 = this.f19201g;
            long jC = this.e.c(this.f19200d) - this.c;
            while (!this.i) {
                if (!z4 && (th2 = this.j) != null) {
                    cVar.clear();
                    rVar.onError(th2);
                    return;
                }
                Object objPoll = cVar.poll();
                if (objPoll == null) {
                    Throwable th3 = this.j;
                    if (th3 != null) {
                        rVar.onError(th3);
                        return;
                    } else {
                        rVar.onComplete();
                        return;
                    }
                }
                Object objPoll2 = cVar.poll();
                if (((Long) objPoll).longValue() >= jC) {
                    rVar.onNext(objPoll2);
                }
            }
            cVar.clear();
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.h.dispose();
        if (compareAndSet(false, true)) {
            this.f.clear();
        }
    }

    @Override // ch.r
    public final void onComplete() {
        a();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.j = th2;
        a();
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        long j;
        long j6;
        long jC = this.e.c(this.f19200d);
        long j7 = this.f19199b;
        boolean z4 = j7 == Long.MAX_VALUE;
        Long lValueOf = Long.valueOf(jC);
        rh.c cVar = this.f;
        cVar.a(lValueOf, obj);
        while (!cVar.isEmpty()) {
            if (((Long) cVar.c()).longValue() > jC - this.c) {
                if (z4) {
                    return;
                }
                AtomicLong atomicLong = cVar.h;
                long j9 = atomicLong.get();
                while (true) {
                    j = cVar.f19953a.get();
                    j6 = atomicLong.get();
                    if (j9 == j6) {
                        break;
                    } else {
                        j9 = j6;
                    }
                }
                if ((((int) (j - j6)) >> 1) <= j7) {
                    return;
                }
            }
            cVar.poll();
            cVar.poll();
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.h, interfaceC1486b)) {
            this.h = interfaceC1486b;
            this.f19198a.onSubscribe(this);
        }
    }
}
