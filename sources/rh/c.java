package rh;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kh.InterfaceC1778e;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements InterfaceC1778e {
    public static final int i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f19953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19954b;
    public long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19955d;
    public AtomicReferenceArray e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AtomicReferenceArray f19956g;
    public final AtomicLong h;

    public c(int i4) {
        AtomicLong atomicLong = new AtomicLong();
        this.f19953a = atomicLong;
        this.h = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i4) - 1));
        int i6 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iNumberOfLeadingZeros + 1);
        this.e = atomicReferenceArray;
        this.f19955d = i6;
        this.f19954b = Math.min(iNumberOfLeadingZeros / 4, i);
        this.f19956g = atomicReferenceArray;
        this.f = i6;
        this.c = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    public final void a(Number number, Object obj) {
        AtomicReferenceArray atomicReferenceArray = this.e;
        AtomicLong atomicLong = this.f19953a;
        long j6 = atomicLong.get();
        long j7 = 2 + j6;
        int i4 = this.f19955d;
        if (atomicReferenceArray.get(((int) j7) & i4) == null) {
            int i6 = ((int) j6) & i4;
            atomicReferenceArray.lazySet(i6 + 1, obj);
            atomicReferenceArray.lazySet(i6, number);
            atomicLong.lazySet(j7);
            return;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.e = atomicReferenceArray2;
        int i10 = ((int) j6) & i4;
        atomicReferenceArray2.lazySet(i10 + 1, obj);
        atomicReferenceArray2.lazySet(i10, number);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i10, j);
        atomicLong.lazySet(j7);
    }

    public final Object c() {
        AtomicReferenceArray atomicReferenceArray = this.f19956g;
        int i4 = (int) this.h.get();
        int i6 = this.f;
        int i10 = i4 & i6;
        Object obj = atomicReferenceArray.get(i10);
        if (obj != j) {
            return obj;
        }
        int i11 = i6 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i11);
        atomicReferenceArray.lazySet(i11, null);
        this.f19956g = atomicReferenceArray2;
        return atomicReferenceArray2.get(i10);
    }

    @Override // kh.InterfaceC1779f
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // kh.InterfaceC1779f
    public final boolean isEmpty() {
        return this.f19953a.get() == this.h.get();
    }

    @Override // kh.InterfaceC1779f
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.e;
        AtomicLong atomicLong = this.f19953a;
        long j6 = atomicLong.get();
        int i4 = this.f19955d;
        int i6 = ((int) j6) & i4;
        if (j6 < this.c) {
            atomicReferenceArray.lazySet(i6, obj);
            atomicLong.lazySet(j6 + 1);
            return true;
        }
        long j7 = ((long) this.f19954b) + j6;
        if (atomicReferenceArray.get(((int) j7) & i4) == null) {
            this.c = j7 - 1;
            atomicReferenceArray.lazySet(i6, obj);
            atomicLong.lazySet(j6 + 1);
            return true;
        }
        long j9 = j6 + 1;
        if (atomicReferenceArray.get(((int) j9) & i4) == null) {
            atomicReferenceArray.lazySet(i6, obj);
            atomicLong.lazySet(j9);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.e = atomicReferenceArray2;
        this.c = (j6 + ((long) i4)) - 1;
        atomicReferenceArray2.lazySet(i6, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i6, j);
        atomicLong.lazySet(j9);
        return true;
    }

    @Override // kh.InterfaceC1779f
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f19956g;
        AtomicLong atomicLong = this.h;
        long j6 = atomicLong.get();
        int i4 = this.f;
        int i6 = ((int) j6) & i4;
        Object obj = atomicReferenceArray.get(i6);
        boolean z4 = obj == j;
        if (obj != null && !z4) {
            atomicReferenceArray.lazySet(i6, null);
            atomicLong.lazySet(j6 + 1);
            return obj;
        }
        if (!z4) {
            return null;
        }
        int i10 = i4 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i10);
        atomicReferenceArray.lazySet(i10, null);
        this.f19956g = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i6);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i6, null);
            atomicLong.lazySet(j6 + 1);
        }
        return obj2;
    }
}
