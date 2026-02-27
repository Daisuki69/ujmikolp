package Fj;

import Ej.InterfaceC0231i;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements InterfaceC0231i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dj.e f1665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1666b;

    public p(Dj.e eVar, int i) {
        this.f1665a = eVar;
        this.f1666b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (Bj.H.D(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Ej.InterfaceC0231i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, gj.InterfaceC1526a r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Fj.o
            if (r0 == 0) goto L13
            r0 = r7
            Fj.o r0 = (Fj.o) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Fj.o r0 = new Fj.o
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f1663a
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            bj.AbstractC1039j.b(r7)
            goto L54
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            bj.AbstractC1039j.b(r7)
            goto L4b
        L36:
            bj.AbstractC1039j.b(r7)
            kotlin.collections.IndexedValue r7 = new kotlin.collections.IndexedValue
            int r2 = r5.f1666b
            r7.<init>(r2, r6)
            r0.c = r4
            Dj.e r6 = r5.f1665a
            java.lang.Object r6 = r6.m(r0, r7)
            if (r6 != r1) goto L4b
            goto L53
        L4b:
            r0.c = r3
            java.lang.Object r6 = Bj.H.D(r0)
            if (r6 != r1) goto L54
        L53:
            return r1
        L54:
            kotlin.Unit r6 = kotlin.Unit.f18162a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Fj.p.emit(java.lang.Object, gj.a):java.lang.Object");
    }
}
