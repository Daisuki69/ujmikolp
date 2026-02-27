package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ph.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2078h1 extends AtomicReference implements InterfaceC1486b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19486b;

    public RunnableC2078h1(ch.r rVar) {
        this.f19485a = rVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != EnumC1604b.f17147a) {
            long j = this.f19486b;
            this.f19486b = 1 + j;
            this.f19485a.onNext(Long.valueOf(j));
        }
    }
}
