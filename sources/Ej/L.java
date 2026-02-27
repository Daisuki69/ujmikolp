package Ej;

import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class L extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f1408b;
    public final /* synthetic */ InterfaceC0230h c;
    public final /* synthetic */ V e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(e0 e0Var, InterfaceC0230h interfaceC0230h, V v7, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f1408b = e0Var;
        this.c = interfaceC0230h;
        this.e = v7;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new L(this.f1408b, this.c, this.e, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r4.collect(r5, r20) == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r4.collect(r5, r20) != r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
    
        if (r1 == r2) goto L34;
     */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 1
            hj.a r2 = hj.EnumC1578a.f17050a
            int r3 = r0.f1407a
            Ej.h r4 = r0.c
            Ej.V r5 = r0.e
            r6 = 2
            r7 = 4
            r8 = 3
            if (r3 == 0) goto L2a
            if (r3 == r1) goto L25
            if (r3 == r6) goto L21
            if (r3 == r8) goto L25
            if (r3 != r7) goto L19
            goto L25
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L21:
            bj.AbstractC1039j.b(r21)
            goto L54
        L25:
            bj.AbstractC1039j.b(r21)
            goto Lb6
        L2a:
            bj.AbstractC1039j.b(r21)
            Ej.b0 r3 = Ej.a0.f1434a
            Ej.e0 r9 = r0.f1408b
            if (r9 != r3) goto L3d
            r0.f1407a = r1
            java.lang.Object r1 = r4.collect(r5, r0)
            if (r1 != r2) goto Lb6
            goto Lb5
        L3d:
            Ej.b0 r3 = Ej.a0.f1435b
            r10 = 0
            if (r9 != r3) goto L5d
            Fj.B r1 = r5.g()
            Ej.J r3 = new Ej.J
            r3.<init>(r6, r10)
            r0.f1407a = r6
            java.lang.Object r1 = Ej.W.k(r1, r3, r0)
            if (r1 != r2) goto L54
            goto Lb5
        L54:
            r0.f1407a = r8
            java.lang.Object r1 = r4.collect(r5, r0)
            if (r1 != r2) goto Lb6
            goto Lb5
        L5d:
            Fj.B r13 = r5.g()
            Ej.c0 r12 = new Ej.c0
            r12.<init>(r9, r10)
            int r3 = Ej.B.f1389a
            Fj.n r11 = new Fj.n
            kotlin.coroutines.g r14 = kotlin.coroutines.g.f18170a
            Dj.a r16 = Dj.a.f1163a
            r15 = -2
            r11.<init>(r12, r13, r14, r15, r16)
            Ej.d0 r3 = new Ej.d0
            r3.<init>(r6, r10)
            Ej.t r6 = new Ej.t
            r6.<init>(r11, r3, r1)
            Ej.h r1 = Ej.W.h(r6)
            Ej.h r1 = Ej.W.h(r1)
            Ej.K r3 = new Ej.K
            r3.<init>(r4, r5, r10)
            r0.f1407a = r7
            Bg.a r15 = new Bg.a
            r4 = 5
            r15.<init>(r3, r10, r4)
            r17 = r14
            Fj.n r14 = new Fj.n
            r18 = -2
            r19 = r16
            r16 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            r1 = 0
            Ej.h r1 = Ej.W.e(r14, r1)
            Fj.v r3 = Fj.v.f1677a
            java.lang.Object r1 = r1.collect(r3, r0)
            if (r1 != r2) goto Lac
            goto Lae
        Lac:
            kotlin.Unit r1 = kotlin.Unit.f18162a
        Lae:
            if (r1 != r2) goto Lb1
            goto Lb3
        Lb1:
            kotlin.Unit r1 = kotlin.Unit.f18162a
        Lb3:
            if (r1 != r2) goto Lb6
        Lb5:
            return r2
        Lb6:
            kotlin.Unit r1 = kotlin.Unit.f18162a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ej.L.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
