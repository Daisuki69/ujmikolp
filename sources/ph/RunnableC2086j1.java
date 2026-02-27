package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ph.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2086j1 extends AtomicReference implements InterfaceC1486b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19510b;
    public long c;

    public RunnableC2086j1(ch.r rVar, long j, long j6) {
        this.f19509a = rVar;
        this.c = j;
        this.f19510b = j6;
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
        long j = this.c;
        Long lValueOf = Long.valueOf(j);
        ch.r rVar = this.f19509a;
        rVar.onNext(lValueOf);
        if (j != this.f19510b) {
            this.c = j + 1;
        } else {
            EnumC1604b.a(this);
            rVar.onComplete();
        }
    }
}
