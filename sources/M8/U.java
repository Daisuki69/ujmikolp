package M8;

import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class U extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3230b;
    public final /* synthetic */ kotlin.jvm.internal.u c;
    public final /* synthetic */ MayaKycCompletePersonalInformationFragment e;
    public final /* synthetic */ Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(kotlin.jvm.internal.u uVar, MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment, Function0 function0, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.c = uVar;
        this.e = mayaKycCompletePersonalInformationFragment;
        this.f = function0;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        U u3 = new U(this.c, this.e, this.f, interfaceC1526a);
        u3.f3230b = obj;
        return u3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0031 -> B:14:0x0034). Please report as a decompilation issue!!! */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r6.f3229a
            kotlin.jvm.internal.u r2 = r6.c
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 != r3) goto L13
            java.lang.Object r1 = r6.f3230b
            Bj.E r1 = (Bj.E) r1
            bj.AbstractC1039j.b(r7)
            goto L34
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            bj.AbstractC1039j.b(r7)
            java.lang.Object r7 = r6.f3230b
            Bj.E r7 = (Bj.E) r7
            r1 = r7
        L23:
            boolean r7 = r2.f18191a
            if (r7 == 0) goto L4f
            r6.f3230b = r1
            r6.f3229a = r3
            r4 = 1
            java.lang.Object r7 = Bj.O.b(r4, r6)
            if (r7 != r0) goto L34
            return r0
        L34:
            com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment r7 = r6.e
            boolean r4 = r7.isVisible()
            if (r4 == 0) goto L23
            boolean r7 = r7.isAdded()
            if (r7 == 0) goto L23
            kotlin.jvm.functions.Function0 r7 = r6.f
            r7.invoke()
            r7 = 0
            r2.f18191a = r7
            r7 = 0
            Bj.H.i(r1, r7)
            goto L23
        L4f:
            kotlin.Unit r7 = kotlin.Unit.f18162a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: M8.U.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
