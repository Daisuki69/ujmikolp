package Gj;

import Bj.AbstractRunnableC0132b0;
import Bj.C0134c0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2040b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractRunnableC0132b0[] f2041a;

    public final void a(AbstractRunnableC0132b0 abstractRunnableC0132b0) {
        abstractRunnableC0132b0.d((C0134c0) this);
        AbstractRunnableC0132b0[] abstractRunnableC0132b0Arr = this.f2041a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2040b;
        if (abstractRunnableC0132b0Arr == null) {
            abstractRunnableC0132b0Arr = new AbstractRunnableC0132b0[4];
            this.f2041a = abstractRunnableC0132b0Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC0132b0Arr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(abstractRunnableC0132b0Arr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.j.f(objArrCopyOf, "copyOf(...)");
            abstractRunnableC0132b0Arr = (AbstractRunnableC0132b0[]) objArrCopyOf;
            this.f2041a = abstractRunnableC0132b0Arr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC0132b0Arr[i] = abstractRunnableC0132b0;
        abstractRunnableC0132b0.f610b = i;
        d(i);
    }

    public final void b(AbstractRunnableC0132b0 abstractRunnableC0132b0) {
        synchronized (this) {
            if (abstractRunnableC0132b0.b() != null) {
                c(abstractRunnableC0132b0.f610b);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Bj.AbstractRunnableC0132b0 c(int r9) {
        /*
            r8 = this;
            Bj.b0[] r0 = r8.f2041a
            kotlin.jvm.internal.j.d(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = Gj.y.f2040b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.e(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.j.d(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.j.d(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.e(r9, r2)
            r8.d(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            Bj.b0[] r5 = r8.f2041a
            kotlin.jvm.internal.j.d(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.j.d(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.j.d(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.j.d(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.j.d(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.e(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.j.d(r9)
            r2 = 0
            r9.d(r2)
            r9.f610b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Gj.y.c(int):Bj.b0");
    }

    public final void d(int i) {
        while (i > 0) {
            AbstractRunnableC0132b0[] abstractRunnableC0132b0Arr = this.f2041a;
            kotlin.jvm.internal.j.d(abstractRunnableC0132b0Arr);
            int i4 = (i - 1) / 2;
            AbstractRunnableC0132b0 abstractRunnableC0132b0 = abstractRunnableC0132b0Arr[i4];
            kotlin.jvm.internal.j.d(abstractRunnableC0132b0);
            AbstractRunnableC0132b0 abstractRunnableC0132b02 = abstractRunnableC0132b0Arr[i];
            kotlin.jvm.internal.j.d(abstractRunnableC0132b02);
            if (abstractRunnableC0132b0.compareTo(abstractRunnableC0132b02) <= 0) {
                return;
            }
            e(i, i4);
            i = i4;
        }
    }

    public final void e(int i, int i4) {
        AbstractRunnableC0132b0[] abstractRunnableC0132b0Arr = this.f2041a;
        kotlin.jvm.internal.j.d(abstractRunnableC0132b0Arr);
        AbstractRunnableC0132b0 abstractRunnableC0132b0 = abstractRunnableC0132b0Arr[i4];
        kotlin.jvm.internal.j.d(abstractRunnableC0132b0);
        AbstractRunnableC0132b0 abstractRunnableC0132b02 = abstractRunnableC0132b0Arr[i];
        kotlin.jvm.internal.j.d(abstractRunnableC0132b02);
        abstractRunnableC0132b0Arr[i] = abstractRunnableC0132b0;
        abstractRunnableC0132b0Arr[i4] = abstractRunnableC0132b02;
        abstractRunnableC0132b0.f610b = i;
        abstractRunnableC0132b02.f610b = i4;
    }
}
