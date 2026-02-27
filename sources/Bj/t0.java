package Bj;

import gj.InterfaceC1526a;
import ij.AbstractC1615i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends AbstractC1615i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Gj.i f640b;
    public int c;
    public /* synthetic */ Object e;
    public final /* synthetic */ D0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(D0 d02, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f = d02;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        t0 t0Var = new t0(this.f, interfaceC1526a);
        t0Var.e = obj;
        return t0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((yj.k) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0069 -> B:25:0x007e). Please report as a decompilation issue!!! */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r5.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            Gj.i r1 = r5.f640b
            Bj.x0 r3 = r5.f639a
            java.lang.Object r4 = r5.e
            yj.k r4 = (yj.k) r4
            bj.AbstractC1039j.b(r6)
            goto L7e
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            bj.AbstractC1039j.b(r6)
            goto L83
        L24:
            bj.AbstractC1039j.b(r6)
            java.lang.Object r6 = r5.e
            yj.k r6 = (yj.k) r6
            Bj.D0 r1 = r5.f
            r1.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = Bj.u0.f643a
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof Bj.C0158p
            if (r4 == 0) goto L44
            Bj.p r1 = (Bj.C0158p) r1
            Bj.u0 r1 = r1.e
            r5.c = r3
            r6.b(r5, r1)
            return r0
        L44:
            boolean r3 = r1 instanceof Bj.InterfaceC0148j0
            if (r3 == 0) goto L83
            Bj.j0 r1 = (Bj.InterfaceC0148j0) r1
            Bj.x0 r1 = r1.b()
            if (r1 == 0) goto L83
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = Gj.i.f2016a
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.j.e(r3, r4)
            Gj.i r3 = (Gj.i) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L61:
            boolean r6 = r1.equals(r3)
            if (r6 != 0) goto L83
            boolean r6 = r1 instanceof Bj.C0158p
            if (r6 == 0) goto L7e
            r6 = r1
            Bj.p r6 = (Bj.C0158p) r6
            r5.e = r4
            r5.f639a = r3
            r5.f640b = r1
            r5.c = r2
            Bj.u0 r6 = r6.e
            r4.b(r5, r6)
            hj.a r6 = hj.EnumC1578a.f17050a
            return r0
        L7e:
            Gj.i r1 = r1.f()
            goto L61
        L83:
            kotlin.Unit r6 = kotlin.Unit.f18162a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Bj.t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
