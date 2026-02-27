package Vg;

import cj.C1110A;
import cj.C1132s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import qj.n;
import rj.InterfaceC2210a;
import rj.InterfaceC2212c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6111b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public M5.d f6112d;
    private volatile /* synthetic */ Object interceptors$delegate;

    public d(M5.d... dVarArr) {
        new Rg.j();
        this.f6110a = C1132s.h(Arrays.copyOf(dVarArr, dVarArr.length));
        this.interceptors$delegate = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r13, java.lang.Object r14, ij.AbstractC1609c r15) {
        /*
            r12 = this;
            kotlin.coroutines.CoroutineContext r0 = r15.getContext()
            java.lang.Object r1 = r12.interceptors$delegate
            java.util.List r1 = (java.util.List) r1
            r2 = 1
            if (r1 != 0) goto L94
            int r1 = r12.f6111b
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L1b
            cj.C r1 = cj.C1112C.f9377a
            r12.interceptors$delegate = r1
            r12.c = r4
            r12.f6112d = r3
            goto L94
        L1b:
            java.util.ArrayList r5 = r12.f6110a
            if (r1 != r2) goto L4f
            int r1 = cj.C1132s.f(r5)
            if (r1 < 0) goto L4f
            r6 = r4
        L26:
            java.lang.Object r7 = r5.get(r6)
            boolean r8 = r7 instanceof Vg.c
            if (r8 == 0) goto L31
            Vg.c r7 = (Vg.c) r7
            goto L32
        L31:
            r7 = r3
        L32:
            if (r7 != 0) goto L35
            goto L4a
        L35:
            java.util.List r8 = r7.c
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L4a
            java.util.List r1 = r7.c
            r7.f6109d = r2
            r12.interceptors$delegate = r1
            r12.c = r4
            M5.d r1 = r7.f6107a
            r12.f6112d = r1
            goto L94
        L4a:
            if (r6 == r1) goto L4f
            int r6 = r6 + 1
            goto L26
        L4f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r6 = cj.C1132s.f(r5)
            if (r6 < 0) goto L8e
            r7 = r4
        L5b:
            java.lang.Object r8 = r5.get(r7)
            boolean r9 = r8 instanceof Vg.c
            if (r9 == 0) goto L66
            Vg.c r8 = (Vg.c) r8
            goto L67
        L66:
            r8 = r3
        L67:
            if (r8 != 0) goto L6a
            goto L89
        L6a:
            java.util.List r8 = r8.c
            int r9 = r1.size()
            int r10 = r8.size()
            int r10 = r10 + r9
            r1.ensureCapacity(r10)
            int r9 = r8.size()
            r10 = r4
        L7d:
            if (r10 >= r9) goto L89
            java.lang.Object r11 = r8.get(r10)
            r1.add(r11)
            int r10 = r10 + 1
            goto L7d
        L89:
            if (r7 == r6) goto L8e
            int r7 = r7 + 1
            goto L5b
        L8e:
            r12.interceptors$delegate = r1
            r12.c = r4
            r12.f6112d = r3
        L94:
            r12.c = r2
            java.lang.Object r1 = r12.interceptors$delegate
            java.util.List r1 = (java.util.List) r1
            kotlin.jvm.internal.j.d(r1)
            boolean r2 = r12.d()
            java.lang.String r3 = "context"
            kotlin.jvm.internal.j.g(r13, r3)
            java.lang.String r3 = "subject"
            kotlin.jvm.internal.j.g(r14, r3)
            java.lang.String r3 = "coroutineContext"
            kotlin.jvm.internal.j.g(r0, r3)
            boolean r3 = Vg.f.f6114a
            if (r3 != 0) goto Lbd
            if (r2 == 0) goto Lb7
            goto Lbd
        Lb7:
            Vg.l r0 = new Vg.l
            r0.<init>(r14, r13, r1)
            goto Lc3
        Lbd:
            Vg.b r2 = new Vg.b
            r2.<init>(r13, r1, r14, r0)
            r0 = r2
        Lc3:
            java.lang.Object r13 = r0.a(r14, r15)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Vg.d.a(java.lang.Object, java.lang.Object, ij.c):java.lang.Object");
    }

    public final c b(M5.d dVar) {
        ArrayList arrayList = this.f6110a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == dVar) {
                c cVar = new c(dVar, i.c);
                arrayList.set(i, cVar);
                return cVar;
            }
            if (obj instanceof c) {
                c cVar2 = (c) obj;
                if (cVar2.f6107a == dVar) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    public final int c(M5.d dVar) {
        ArrayList arrayList = this.f6110a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == dVar || ((obj instanceof c) && ((c) obj).f6107a == dVar)) {
                return i;
            }
        }
        return -1;
    }

    public abstract boolean d();

    public final boolean e(M5.d dVar) {
        ArrayList arrayList = this.f6110a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == dVar) {
                return true;
            }
            if ((obj instanceof c) && ((c) obj).f6107a == dVar) {
                return true;
            }
        }
        return false;
    }

    public final void f(M5.d phase, n nVar) {
        kotlin.jvm.internal.j.g(phase, "phase");
        c cVarB = b(phase);
        if (cVarB == null) {
            throw new Qh.d("Phase " + phase + " was not registered for this pipeline");
        }
        List list = (List) this.interceptors$delegate;
        if (!this.f6110a.isEmpty() && list != null && !this.c && (list instanceof List) && (!(list instanceof InterfaceC2210a) || (list instanceof InterfaceC2212c))) {
            if (kotlin.jvm.internal.j.b(this.f6112d, phase)) {
                list.add(nVar);
            } else if (phase.equals(C1110A.G(this.f6110a)) || c(phase) == C1132s.f(this.f6110a)) {
                c cVarB2 = b(phase);
                kotlin.jvm.internal.j.d(cVarB2);
                if (cVarB2.f6109d) {
                    cVarB2.c = C1110A.W(cVarB2.c);
                    cVarB2.f6109d = false;
                }
                cVarB2.c.add(nVar);
                list.add(nVar);
            }
            this.f6111b++;
            return;
        }
        if (cVarB.f6109d) {
            cVarB.c = C1110A.W(cVarB.c);
            cVarB.f6109d = false;
        }
        cVarB.c.add(nVar);
        this.f6111b++;
        this.interceptors$delegate = null;
        this.c = false;
        this.f6112d = null;
    }
}
