package U4;

import Bj.E;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import pg.r;
import pg.t;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f5940b;
    public final /* synthetic */ t c;
    public final /* synthetic */ c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r rVar, t tVar, c cVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f5940b = rVar;
        this.c = tVar;
        this.e = cVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new b(this.f5940b, this.c, this.e, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r4.f5939a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            bj.AbstractC1039j.b(r5)
            goto L3c
        Le:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L16:
            bj.AbstractC1039j.b(r5)
            pg.r r5 = r4.f5940b
            java.lang.String r1 = "url"
            java.lang.Object r5 = r5.a(r1)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L3f
            r4.f5939a = r2
            U4.c r1 = r4.e
            r1.getClass()
            Ij.e r1 = Bj.U.f603a
            Ij.d r1 = Ij.d.f2362a
            U4.a r2 = new U4.a
            r2.<init>(r5, r3)
            java.lang.Object r5 = Bj.H.C(r2, r1, r4)
            if (r5 != r0) goto L3c
            return r0
        L3c:
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            goto L40
        L3f:
            r5 = r3
        L40:
            pg.t r0 = r4.c
            if (r5 == 0) goto L4c
            java.util.List r5 = cj.C1110A.V(r5)
            r0.success(r5)
            goto L53
        L4c:
            java.lang.String r5 = "404"
            java.lang.String r1 = "No certificates retrieved"
            r0.error(r5, r1, r3)
        L53:
            kotlin.Unit r5 = kotlin.Unit.f18162a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
