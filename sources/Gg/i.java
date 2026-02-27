package Gg;

import Bj.E;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1980b;
    public final /* synthetic */ Kg.c c;
    public final /* synthetic */ AbstractC1616j e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(Kg.c cVar, Function2 function2, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.c = cVar;
        this.e = (AbstractC1616j) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ij.j, kotlin.jvm.functions.Function2] */
    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        i iVar = new i(this.c, this.e, interfaceC1526a);
        iVar.f1980b = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r7 == r0) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v5, types: [ij.j, kotlin.jvm.functions.Function2] */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r6.f1979a
            Kg.c r2 = r6.c
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            bj.AbstractC1039j.b(r7)     // Catch: java.lang.Throwable -> L12
            goto L61
        L12:
            r7 = move-exception
            goto L6f
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            java.lang.Object r1 = r6.f1980b
            Bj.E r1 = (Bj.E) r1
            bj.AbstractC1039j.b(r7)     // Catch: java.lang.Throwable -> L24
            goto L3c
        L24:
            r7 = move-exception
            goto L41
        L26:
            bj.AbstractC1039j.b(r7)
            java.lang.Object r7 = r6.f1980b
            Bj.E r7 = (Bj.E) r7
            ij.j r1 = r6.e
            bj.h$a r5 = bj.C1037h.f9166b     // Catch: java.lang.Throwable -> L24
            r6.f1980b = r7     // Catch: java.lang.Throwable -> L24
            r6.f1979a = r4     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r1.invoke(r2, r6)     // Catch: java.lang.Throwable -> L24
            if (r7 != r0) goto L3c
            goto L60
        L3c:
            kotlin.Unit r7 = kotlin.Unit.f18162a     // Catch: java.lang.Throwable -> L24
            bj.h$a r7 = bj.C1037h.f9166b     // Catch: java.lang.Throwable -> L24
            goto L46
        L41:
            bj.h$a r1 = bj.C1037h.f9166b
            bj.AbstractC1039j.a(r7)
        L46:
            io.ktor.utils.io.n r7 = r2.c()
            boolean r1 = r7.i()
            if (r1 != 0) goto L74
            r1 = 0
            r6.f1980b = r1     // Catch: java.lang.Throwable -> L12
            r6.f1979a = r3     // Catch: java.lang.Throwable -> L12
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r7 = M8.T2.m(r7, r1, r6)     // Catch: java.lang.Throwable -> L12
            if (r7 != r0) goto L61
        L60:
            return r0
        L61:
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L12
            long r0 = r7.longValue()     // Catch: java.lang.Throwable -> L12
            java.lang.Long r7 = new java.lang.Long     // Catch: java.lang.Throwable -> L12
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L12
            bj.h$a r7 = bj.C1037h.f9166b     // Catch: java.lang.Throwable -> L12
            goto L74
        L6f:
            bj.h$a r0 = bj.C1037h.f9166b
            bj.AbstractC1039j.a(r7)
        L74:
            kotlin.Unit r7 = kotlin.Unit.f18162a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Gg.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
