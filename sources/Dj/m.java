package Dj;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends Gj.r {
    public final e e;
    public final /* synthetic */ AtomicReferenceArray f;

    public m(long j, m mVar, e eVar, int i) {
        super(j, mVar, i);
        this.e = eVar;
        this.f = new AtomicReferenceArray(g.f1178b * 2);
    }

    @Override // Gj.r
    public final int g() {
        return g.f1178b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        kotlin.jvm.internal.j.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // Gj.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r5, kotlin.coroutines.CoroutineContext r6) {
        /*
            r4 = this;
            int r6 = Dj.g.f1178b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r4.f
            int r1 = r5 * 2
            r6.get(r1)
        L11:
            java.lang.Object r6 = r4.l(r5)
            boolean r1 = r6 instanceof Bj.M0
            Dj.e r2 = r4.e
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof Dj.v
            if (r1 == 0) goto L21
            goto L62
        L21:
            Gj.t r1 = Dj.g.j
            if (r6 == r1) goto L59
            Gj.t r1 = Dj.g.f1181k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            Gj.t r1 = Dj.g.f1180g
            if (r6 == r1) goto L11
            Gj.t r1 = Dj.g.f
            if (r6 != r1) goto L33
            goto L11
        L33:
            Gj.t r5 = Dj.g.i
            if (r6 == r5) goto L7c
            Gj.t r5 = Dj.g.f1179d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            Gj.t r5 = Dj.g.f1182l
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.n(r5, r3)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.j.d(r2)
            return
        L62:
            if (r0 == 0) goto L67
            Gj.t r1 = Dj.g.j
            goto L69
        L67:
            Gj.t r1 = Dj.g.f1181k
        L69:
            boolean r6 = r4.k(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.n(r5, r3)
            r6 = r0 ^ 1
            r4.m(r5, r6)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.j.d(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dj.m.h(int, kotlin.coroutines.CoroutineContext):void");
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int i4 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
            if (atomicReferenceArray.get(i4) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object l(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void m(int i, boolean z4) {
        if (z4) {
            e eVar = this.e;
            kotlin.jvm.internal.j.d(eVar);
            eVar.J((this.c * ((long) g.f1178b)) + ((long) i));
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.f.set(i * 2, obj);
    }

    public final void o(int i, Gj.t tVar) {
        this.f.set((i * 2) + 1, tVar);
    }
}
