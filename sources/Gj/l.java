package Gj;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public final class l {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(l.class, "_state$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t f2020g = new t("REMOVE_FROZEN", 0);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2022b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f2023d;

    public l(int i, boolean z4) {
        this.f2021a = i;
        this.f2022b = z4;
        int i4 = i - 1;
        this.c = i4;
        this.f2023d = new AtomicReferenceArray(i);
        if (i4 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i4) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i4 = (int) ((1152921503533105152L & j) >> 30);
            int i6 = this.c;
            if (((i4 + 2) & i6) == (i & i6)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f2023d;
            if (!this.f2022b && atomicReferenceArray.get(i4 & i6) != null) {
                int i10 = this.f2021a;
                if (i10 < 1024 || ((i4 - i) & 1073741823) > (i10 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i4 + 1) & 1073741823)) << 30))) {
                atomicReferenceArray.set(i4 & i6, runnable);
                l lVarC = this;
                while ((atomicLongFieldUpdater.get(lVarC) & 1152921504606846976L) != 0) {
                    lVarC = lVarC.c();
                    AtomicReferenceArray atomicReferenceArray2 = lVarC.f2023d;
                    int i11 = lVarC.c & i4;
                    Object obj = atomicReferenceArray2.get(i11);
                    if ((obj instanceof k) && ((k) obj).f2019a == i4) {
                        atomicReferenceArray2.set(i11, runnable);
                    } else {
                        lVarC = null;
                    }
                    if (lVarC == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final l c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        l lVar;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                lVar = this;
                break;
            }
            long j6 = 1152921504606846976L | j;
            lVar = this;
            if (atomicLongFieldUpdater.compareAndSet(lVar, j, j6)) {
                j = j6;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(this);
            if (lVar2 != null) {
                return lVar2;
            }
            l lVar3 = new l(lVar.f2021a * 2, lVar.f2022b);
            int i = (int) (1073741823 & j);
            int i4 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i6 = lVar.c;
                int i10 = i & i6;
                if (i10 == (i6 & i4)) {
                    break;
                }
                Object kVar = lVar.f2023d.get(i10);
                if (kVar == null) {
                    kVar = new k(i);
                }
                lVar3.f2023d.set(lVar3.c & i, kVar);
                i++;
            }
            atomicLongFieldUpdater.set(lVar3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() {
        /*
            r30 = this;
            r1 = r30
        L2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Gj.l.f
            long r2 = r0.get(r1)
            r6 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r6
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto L15
            Gj.t r0 = Gj.l.f2020g
            return r0
        L15:
            r10 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r2 & r10
            int r4 = (int) r4
            r12 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r12 = r12 & r2
            r5 = 30
            long r12 = r12 >> r5
            int r5 = (int) r12
            int r12 = r1.c
            r5 = r5 & r12
            r12 = r12 & r4
            r13 = 0
            if (r5 != r12) goto L2d
            goto L40
        L2d:
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r1.f2023d
            java.lang.Object r15 = r14.get(r12)
            boolean r5 = r1.f2022b
            if (r15 != 0) goto L3a
            if (r5 == 0) goto L2
            goto L40
        L3a:
            r16 = r6
            boolean r6 = r15 instanceof Gj.k
            if (r6 == 0) goto L41
        L40:
            return r13
        L41:
            int r4 = r4 + 1
            r6 = 1073741823(0x3fffffff, float:1.9999999)
            r4 = r4 & r6
            r6 = -1073741824(0xffffffffc0000000, double:NaN)
            long r18 = r2 & r6
            r20 = r6
            long r6 = (long) r4
            long r18 = r18 | r6
            r28 = r18
            r18 = r5
            r4 = r28
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L61
            r14.set(r12, r13)
            return r15
        L61:
            r1 = r30
            if (r18 == 0) goto L2
        L65:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Gj.l.f
            long r24 = r0.get(r1)
            long r2 = r24 & r10
            int r2 = (int) r2
            long r3 = r24 & r16
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L7a
            Gj.l r0 = r1.c()
            r1 = r0
            goto L93
        L7a:
            long r3 = r24 & r20
            long r26 = r3 | r6
            r22 = r0
            r23 = r1
            boolean r0 = r22.compareAndSet(r23, r24, r26)
            r1 = r23
            if (r0 == 0) goto L65
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f2023d
            int r1 = r1.c
            r1 = r1 & r2
            r0.set(r1, r13)
            r1 = r13
        L93:
            if (r1 != 0) goto L65
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: Gj.l.d():java.lang.Object");
    }
}
