package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ph.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2069f0 extends AtomicReference implements Runnable, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19460b;
    public final C2073g0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f19461d = new AtomicBoolean();

    public RunnableC2069f0(Object obj, long j, C2073g0 c2073g0) {
        this.f19459a = obj;
        this.f19460b = j;
        this.c = c2073g0;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19461d.compareAndSet(false, true)) {
            C2073g0 c2073g0 = this.c;
            long j = this.f19460b;
            Object obj = this.f19459a;
            if (j == c2073g0.f19474g) {
                c2073g0.f19471a.onNext(obj);
                EnumC1604b.a(this);
            }
        }
    }
}
