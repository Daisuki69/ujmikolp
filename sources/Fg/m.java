package Fg;

import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StringBuilder f1620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1621b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e eVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.e = eVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        m mVar = new m(this.e, interfaceC1526a);
        mVar.c = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((Kg.c) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        if (r1.b(r8) != r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f8, code lost:
    
        if (r1.b(r8) != r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6 A[PHI: r1
  0x00c6: PHI (r1v14 Fg.d) = (r1v10 Fg.d), (r1v16 Fg.d) binds: [B:29:0x00c3, B:14:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef A[PHI: r1
  0x00ef: PHI (r1v17 Fg.d) = (r1v9 Fg.d), (r1v19 Fg.d) binds: [B:35:0x00ec, B:12:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fg.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
