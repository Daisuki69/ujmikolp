package Mj;

import java.util.concurrent.atomic.AtomicReferenceArray;
import zj.y;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f3436a = new g(new byte[0], 0, 0, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f3437b;
    public static final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f3438d;
    public static final int e;
    public static final AtomicReferenceArray f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceArray f3439g;

    static {
        int iIntValue;
        int i = 0;
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f3437b = iHighestOneBit;
        int i4 = iHighestOneBit / 2;
        int i6 = i4 >= 1 ? i4 : 1;
        c = i6;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", kotlin.jvm.internal.j.b(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304");
        kotlin.jvm.internal.j.f(property, "getProperty(...)");
        Integer numF = y.f(property);
        if (numF != null && (iIntValue = numF.intValue()) >= 0) {
            i = iIntValue;
        }
        f3438d = i;
        int i10 = i / i6;
        if (i10 < 8192) {
            i10 = 8192;
        }
        e = i10;
        f = new AtomicReferenceArray(iHighestOneBit);
        f3439g = new AtomicReferenceArray(i6);
    }

    public static final void a(g segment) {
        kotlin.jvm.internal.j.g(segment, "segment");
        if (segment.f != null || segment.f3435g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        j jVar = segment.f3434d;
        if (jVar != null) {
            f fVar = (f) jVar;
            if (fVar.f3431b != 0) {
                int iDecrementAndGet = f.c.decrementAndGet(fVar);
                if (iDecrementAndGet >= 0) {
                    return;
                }
                if (iDecrementAndGet != -1) {
                    throw new IllegalStateException(("Shared copies count is negative: " + (iDecrementAndGet + 1)).toString());
                }
                fVar.f3431b = 0;
            }
        }
        AtomicReferenceArray atomicReferenceArray = f;
        int id = (int) ((((long) f3437b) - 1) & Thread.currentThread().getId());
        segment.f3433b = 0;
        segment.e = true;
        while (true) {
            g gVar = (g) atomicReferenceArray.get(id);
            g gVar2 = f3436a;
            if (gVar != gVar2) {
                int i = gVar != null ? gVar.c : 0;
                if (i < 65536) {
                    segment.f = gVar;
                    segment.c = i + 8192;
                    while (!atomicReferenceArray.compareAndSet(id, gVar, segment)) {
                        if (atomicReferenceArray.get(id) != gVar) {
                            break;
                        }
                    }
                    return;
                }
                if (f3438d <= 0) {
                    return;
                }
                segment.f3433b = 0;
                segment.e = true;
                int id2 = (int) ((((long) c) - 1) & Thread.currentThread().getId());
                AtomicReferenceArray atomicReferenceArray2 = f3439g;
                int i4 = 0;
                while (true) {
                    g gVar3 = (g) atomicReferenceArray2.get(id2);
                    if (gVar3 != gVar2) {
                        int i6 = (gVar3 != null ? gVar3.c : 0) + 8192;
                        if (i6 <= e) {
                            segment.f = gVar3;
                            segment.c = i6;
                            while (!atomicReferenceArray2.compareAndSet(id2, gVar3, segment)) {
                                if (atomicReferenceArray2.get(id2) != gVar3) {
                                    break;
                                }
                            }
                            return;
                        }
                        int i10 = c;
                        if (i4 >= i10) {
                            return;
                        }
                        i4++;
                        id2 = (id2 + 1) & (i10 - 1);
                    }
                }
            }
        }
    }

    public static final g b() {
        g gVar;
        g gVar2;
        AtomicReferenceArray atomicReferenceArray = f;
        int id = (int) ((((long) f3437b) - 1) & Thread.currentThread().getId());
        do {
            gVar = f3436a;
            gVar2 = (g) atomicReferenceArray.getAndSet(id, gVar);
        } while (kotlin.jvm.internal.j.b(gVar2, gVar));
        if (gVar2 != null) {
            atomicReferenceArray.set(id, gVar2.f);
            gVar2.f = null;
            gVar2.c = 0;
            return gVar2;
        }
        atomicReferenceArray.set(id, null);
        if (f3438d <= 0) {
            return new g();
        }
        AtomicReferenceArray atomicReferenceArray2 = f3439g;
        int i = c;
        int id2 = (int) (Thread.currentThread().getId() & (((long) i) - 1));
        int i4 = 0;
        while (true) {
            g gVar3 = (g) atomicReferenceArray2.getAndSet(id2, gVar);
            if (!kotlin.jvm.internal.j.b(gVar3, gVar)) {
                if (gVar3 != null) {
                    atomicReferenceArray2.set(id2, gVar3.f);
                    gVar3.f = null;
                    gVar3.c = 0;
                    return gVar3;
                }
                atomicReferenceArray2.set(id2, null);
                if (i4 >= i) {
                    return new g();
                }
                id2 = (id2 + 1) & (i - 1);
                i4++;
            }
        }
    }
}
