package rh;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kh.InterfaceC1778e;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AtomicReferenceArray implements InterfaceC1778e {
    public static final Integer f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f19951b;
    public long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f19952d;
    public final int e;

    public b(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.f19950a = length() - 1;
        this.f19951b = new AtomicLong();
        this.f19952d = new AtomicLong();
        this.e = Math.min(i / 4, f.intValue());
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
        return this.f19951b.get() == this.f19952d.get();
    }

    @Override // kh.InterfaceC1779f
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f19951b;
        long j = atomicLong.get();
        int i = this.f19950a;
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

    @Override // kh.InterfaceC1779f
    public final Object poll() {
        AtomicLong atomicLong = this.f19952d;
        long j = atomicLong.get();
        int i = ((int) j) & this.f19950a;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, null);
        return obj;
    }
}
