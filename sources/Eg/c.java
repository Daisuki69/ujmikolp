package Eg;

import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import io.ktor.utils.io.D;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1359b;
    public final /* synthetic */ y c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y yVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.c = yVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        c cVar = new c(this.c, interfaceC1526a);
        cVar.f1359b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((D) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (io.ktor.utils.io.z.c(r1, r8, 0, r8.length, r7) == r0) goto L24;
     */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r7.f1358a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            bj.AbstractC1039j.b(r8)
            goto L7d
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            java.lang.Object r1 = r7.f1359b
            io.ktor.utils.io.D r1 = (io.ktor.utils.io.D) r1
            bj.AbstractC1039j.b(r8)
            goto L6a
        L21:
            bj.AbstractC1039j.b(r8)
            java.lang.Object r8 = r7.f1359b
            r1 = r8
            io.ktor.utils.io.D r1 = (io.ktor.utils.io.D) r1
            kotlin.jvm.internal.y r8 = r7.c
            java.lang.Object r8 = r8.f18195a
            kotlin.jvm.internal.j.d(r8)
            Eg.b r8 = (Eg.b) r8
            r7.f1359b = r1
            r7.f1358a = r4
            e2.c r4 = r8.f1357b
            java.lang.String r5 = "writerJob"
            if (r4 == 0) goto L80
            io.ktor.utils.io.x r6 = io.ktor.utils.io.z.f17560a
            Bj.n0 r4 = r4.g()
            Bj.u0 r4 = (Bj.u0) r4
            boolean r4 = r4.R()
            if (r4 != 0) goto L5f
            e2.c r4 = r8.f1357b
            if (r4 == 0) goto L5b
            io.ktor.client.plugins.internal.SaveBodyAbandonedReadException r5 = new io.ktor.client.plugins.internal.SaveBodyAbandonedReadException
            r5.<init>()
            java.lang.Object r4 = r4.f16555b
            io.ktor.utils.io.k r4 = (io.ktor.utils.io.k) r4
            r4.a(r5)
            goto L5f
        L5b:
            kotlin.jvm.internal.j.n(r5)
            throw r2
        L5f:
            Bj.q r8 = r8.f1356a
            Bj.r r8 = (Bj.r) r8
            java.lang.Object r8 = r8.A(r7)
            if (r8 != r0) goto L6a
            goto L7c
        L6a:
            byte[] r8 = (byte[]) r8
            io.ktor.utils.io.w r1 = r1.f17517a
            r7.f1359b = r2
            r7.f1358a = r3
            io.ktor.utils.io.x r2 = io.ktor.utils.io.z.f17560a
            int r2 = r8.length
            r3 = 0
            java.lang.Object r8 = io.ktor.utils.io.z.c(r1, r8, r3, r2, r7)
            if (r8 != r0) goto L7d
        L7c:
            return r0
        L7d:
            kotlin.Unit r8 = kotlin.Unit.f18162a
            return r8
        L80:
            kotlin.jvm.internal.j.n(r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Eg.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
