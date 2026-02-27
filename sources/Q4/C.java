package Q4;

import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class C extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f5222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f5223b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d10, List list, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f5222a = d10;
        this.f5223b = list;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new C(this.f5222a, this.f5223b, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x018b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7 A[PHI: r19
  0x00e7: PHI (r19v6 java.lang.Integer) = (r19v1 java.lang.Integer), (r19v3 java.lang.Integer) binds: [B:21:0x00a5, B:27:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0171  */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.C.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
