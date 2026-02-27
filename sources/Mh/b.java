package Mh;

import Fh.f;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements f {
    public static final int i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f3404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3405b;
    public long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3406d;
    public AtomicReferenceArray e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AtomicReferenceArray f3407g;
    public final AtomicLong h;

    public b(int i4) {
        AtomicLong atomicLong = new AtomicLong();
        this.f3404a = atomicLong;
        this.h = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i4) - 1));
        int i6 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iNumberOfLeadingZeros + 1);
        this.e = atomicReferenceArray;
        this.f3406d = i6;
        this.f3405b = Math.min(iNumberOfLeadingZeros / 4, i);
        this.f3407g = atomicReferenceArray;
        this.f = i6;
        this.c = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // Fh.g
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // Fh.g
    public final boolean isEmpty() {
        return this.f3404a.get() == this.h.get();
    }

    @Override // Fh.g
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.e;
        AtomicLong atomicLong = this.f3404a;
        long j6 = atomicLong.get();
        int i4 = this.f3406d;
        int i6 = ((int) j6) & i4;
        if (j6 < this.c) {
            atomicReferenceArray.lazySet(i6, obj);
            atomicLong.lazySet(j6 + 1);
            return true;
        }
        long j7 = ((long) this.f3405b) + j6;
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

    @Override // Fh.g
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f3407g;
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
        this.f3407g = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i6);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i6, null);
            atomicLong.lazySet(j6 + 1);
        }
        return obj2;
    }
}
