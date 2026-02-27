package ah;

import We.s;
import io.flutter.embedding.android.KeyboardMap;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: ah.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0711c implements AutoCloseable {
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(AbstractC0711c.class, "top");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7233b;
    public final AtomicReferenceArray c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f7234d;
    private volatile /* synthetic */ long top;

    public AbstractC0711c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(s.f(i, "capacity should be positive but it is ").toString());
        }
        if (i > 536870911) {
            throw new IllegalArgumentException(s.f(i, "capacity should be less or equal to 536870911 but it is ").toString());
        }
        this.top = 0L;
        int iHighestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
        this.f7232a = iHighestOneBit;
        this.f7233b = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        int i4 = iHighestOneBit + 1;
        this.c = new AtomicReferenceArray(i4);
        this.f7234d = new int[i4];
    }

    public abstract Object b();

    public final void c(Object instance) {
        long j;
        long j6;
        j.g(instance, "instance");
        j.g(instance, "instance");
        int iIdentityHashCode = ((System.identityHashCode(instance) * (-1640531527)) >>> this.f7233b) + 1;
        for (int i = 0; i < 8; i++) {
            AtomicReferenceArray atomicReferenceArray = this.c;
            while (!atomicReferenceArray.compareAndSet(iIdentityHashCode, null, instance)) {
                if (atomicReferenceArray.get(iIdentityHashCode) != null) {
                    iIdentityHashCode--;
                    if (iIdentityHashCode == 0) {
                        iIdentityHashCode = this.f7232a;
                    }
                }
            }
            if (iIdentityHashCode <= 0) {
                throw new IllegalArgumentException("index should be positive");
            }
            do {
                j = this.top;
                j6 = ((((j >> 32) & KeyboardMap.kValueMask) + 1) << 32) | ((long) iIdentityHashCode);
                this.f7234d[iIdentityHashCode] = (int) (KeyboardMap.kValueMask & j);
            } while (!e.compareAndSet(this, j, j6));
            return;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        while (f() != null) {
        }
    }

    public final Object f() {
        long j;
        int i;
        AbstractC0711c abstractC0711c;
        long j6;
        do {
            j = this.top;
            if (j != 0) {
                j6 = ((j >> 32) & KeyboardMap.kValueMask) + 1;
                i = (int) (KeyboardMap.kValueMask & j);
                if (i != 0) {
                    abstractC0711c = this;
                }
            }
            i = 0;
            abstractC0711c = this;
            break;
        } while (!e.compareAndSet(abstractC0711c, j, (j6 << 32) | ((long) this.f7234d[i])));
        if (i == 0) {
            return null;
        }
        return abstractC0711c.c.getAndSet(i, null);
    }
}
