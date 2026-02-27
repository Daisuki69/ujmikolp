package Ej;

import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends AbstractC1616j implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ InterfaceC0231i f1440b;
    public /* synthetic */ int c;
    public final /* synthetic */ e0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, InterfaceC1526a interfaceC1526a) {
        super(3, interfaceC1526a);
        this.e = e0Var;
    }

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        c0 c0Var = new c0(this.e, (InterfaceC1526a) obj3);
        c0Var.f1440b = (InterfaceC0231i) obj;
        c0Var.c = iIntValue;
        return c0Var.invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r1.emit(r9, r8) != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a A[PHI: r1
  0x006a: PHI (r1v3 Ej.i) = (r1v2 Ej.i), (r1v6 Ej.i) binds: [B:25:0x0067, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[PHI: r1
  0x007d: PHI (r1v4 Ej.i) = (r1v3 Ej.i), (r1v7 Ej.i) binds: [B:28:0x007a, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r8.f1439a
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            Ej.e0 r7 = r8.e
            if (r1 == 0) goto L36
            if (r1 == r6) goto L32
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L26
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L32
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            Ej.i r1 = r8.f1440b
            bj.AbstractC1039j.b(r9)
            goto L7d
        L26:
            Ej.i r1 = r8.f1440b
            bj.AbstractC1039j.b(r9)
            goto L6a
        L2c:
            Ej.i r1 = r8.f1440b
            bj.AbstractC1039j.b(r9)
            goto L5a
        L32:
            bj.AbstractC1039j.b(r9)
            goto L8b
        L36:
            bj.AbstractC1039j.b(r9)
            Ej.i r1 = r8.f1440b
            int r9 = r8.c
            if (r9 <= 0) goto L4a
            Ej.Y r9 = Ej.Y.f1426a
            r8.f1439a = r6
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L8b
            goto L8a
        L4a:
            r7.getClass()
            r8.f1440b = r1
            r8.f1439a = r5
            r5 = 0
            java.lang.Object r9 = Bj.O.b(r5, r8)
            if (r9 != r0) goto L5a
            goto L8a
        L5a:
            r7.getClass()
            Ej.Y r9 = Ej.Y.f1427b
            r8.f1440b = r1
            r8.f1439a = r4
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L6a
            goto L8a
        L6a:
            r7.getClass()
            r8.f1440b = r1
            r8.f1439a = r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r9 = Bj.O.b(r3, r8)
            if (r9 != r0) goto L7d
            goto L8a
        L7d:
            Ej.Y r9 = Ej.Y.c
            r3 = 0
            r8.f1440b = r3
            r8.f1439a = r2
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L8b
        L8a:
            return r0
        L8b:
            kotlin.Unit r9 = kotlin.Unit.f18162a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Ej.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
