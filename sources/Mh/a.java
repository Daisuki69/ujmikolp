package Mh;

import Fh.f;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AtomicReferenceArray implements f {
    public static final Integer f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f3402b;
    public long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f3403d;
    public final int e;

    public a(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.f3401a = length() - 1;
        this.f3402b = new AtomicLong();
        this.f3403d = new AtomicLong();
        this.e = Math.min(i / 4, f.intValue());
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
        return this.f3402b.get() == this.f3403d.get();
    }

    @Override // Fh.g
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f3402b;
        long j = atomicLong.get();
        int i = this.f3401a;
        int i4 = ((int) j) & i;
        if (j >= this.c) {
            long j6 = ((long) this.e) + j;
            if (get(i & ((int) j6)) == null) {
                this.c = j6;
            } else if (get(i4) != null) {
                return false;
            }
        }
        lazySet(i4, obj);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // Fh.g
    public final Object poll() {
        AtomicLong atomicLong = this.f3403d;
        long j = atomicLong.get();
        int i = ((int) j) & this.f3401a;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, null);
        return obj;
    }
}
