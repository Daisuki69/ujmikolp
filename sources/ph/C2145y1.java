package ph;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ph.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2145y1 implements ch.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f19694a;

    public C2145y1(AtomicReference atomicReference) {
        this.f19694a = atomicReference;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0008, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ch.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void subscribe(ch.r r8) {
        /*
            r7 = this;
            ph.w1 r0 = new ph.w1
            r0.<init>(r8)
            r8.onSubscribe(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference r8 = r7.f19694a
            java.lang.Object r1 = r8.get()
            ph.x1 r1 = (ph.C2141x1) r1
            if (r1 == 0) goto L1b
            boolean r2 = r1.a()
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r3 = r1
            goto L27
        L1b:
            ph.x1 r2 = new ph.x1
            r2.<init>(r8)
        L20:
            boolean r3 = r8.compareAndSet(r1, r2)
            if (r3 == 0) goto L58
            r3 = r2
        L27:
            java.util.concurrent.atomic.AtomicReference r4 = r3.f19685b
            java.lang.Object r8 = r4.get()
            r5 = r8
            ph.w1[] r5 = (ph.C2137w1[]) r5
            ph.w1[] r8 = ph.C2141x1.f
            if (r5 != r8) goto L35
            goto L8
        L35:
            int r8 = r5.length
            int r1 = r8 + 1
            ph.w1[] r6 = new ph.C2137w1[r1]
            r1 = 0
            java.lang.System.arraycopy(r5, r1, r6, r1, r8)
            r6[r8] = r0
        L40:
            boolean r8 = r4.compareAndSet(r5, r6)
            if (r8 == 0) goto L51
            r8 = 0
            boolean r8 = r0.compareAndSet(r8, r3)
            if (r8 != 0) goto L50
            r3.b(r0)
        L50:
            return
        L51:
            java.lang.Object r8 = r4.get()
            if (r8 == r5) goto L40
            goto L27
        L58:
            java.lang.Object r3 = r8.get()
            if (r3 == r1) goto L20
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.C2145y1.subscribe(ch.r):void");
    }
}
