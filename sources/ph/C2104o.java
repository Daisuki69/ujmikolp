package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ph.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2104o implements InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2108p[] f19574b;
    public final AtomicInteger c = new AtomicInteger();

    public C2104o(ch.r rVar, int i) {
        this.f19573a = rVar;
        this.f19574b = new C2108p[i];
    }

    public final boolean a(int i) {
        AtomicInteger atomicInteger = this.c;
        int i4 = atomicInteger.get();
        int i6 = 0;
        if (i4 != 0) {
            return i4 == i;
        }
        if (!atomicInteger.compareAndSet(0, i)) {
            return false;
        }
        C2108p[] c2108pArr = this.f19574b;
        int length = c2108pArr.length;
        while (i6 < length) {
            int i10 = i6 + 1;
            if (i10 != i) {
                C2108p c2108p = c2108pArr[i6];
                c2108p.getClass();
                EnumC1604b.a(c2108p);
            }
            i6 = i10;
        }
        return true;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        AtomicInteger atomicInteger = this.c;
        if (atomicInteger.get() != -1) {
            atomicInteger.lazySet(-1);
            for (C2108p c2108p : this.f19574b) {
                c2108p.getClass();
                EnumC1604b.a(c2108p);
            }
        }
    }
}
