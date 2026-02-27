package Bg;

import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends AbstractC1616j implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f521b;
    public /* synthetic */ Vg.e c;
    public final /* synthetic */ qj.n e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(qj.n nVar, InterfaceC1526a interfaceC1526a, int i) {
        super(3, interfaceC1526a);
        this.f520a = i;
        this.e = nVar;
    }

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Vg.e eVar = (Vg.e) obj;
        switch (this.f520a) {
            case 0:
                c0 c0Var = new c0(this.e, (InterfaceC1526a) obj3, 0);
                c0Var.c = eVar;
                return c0Var.invokeSuspend(Unit.f18162a);
            case 1:
                c0 c0Var2 = new c0(this.e, (InterfaceC1526a) obj3, 1);
                c0Var2.c = eVar;
                return c0Var2.invokeSuspend(Unit.f18162a);
            case 2:
                c0 c0Var3 = new c0(this.e, (InterfaceC1526a) obj3, 2);
                c0Var3.c = eVar;
                return c0Var3.invokeSuspend(Unit.f18162a);
            case 3:
                c0 c0Var4 = new c0(this.e, (InterfaceC1526a) obj3, 3);
                c0Var4.c = eVar;
                return c0Var4.invokeSuspend(Unit.f18162a);
            case 4:
                c0 c0Var5 = new c0(this.e, (InterfaceC1526a) obj3, 4);
                c0Var5.c = eVar;
                return c0Var5.invokeSuspend(Unit.f18162a);
            case 5:
                c0 c0Var6 = new c0(this.e, (InterfaceC1526a) obj3, 5);
                c0Var6.c = eVar;
                return c0Var6.invokeSuspend(Unit.f18162a);
            default:
                c0 c0Var7 = new c0(this.e, (InterfaceC1526a) obj3, 6);
                c0Var7.c = eVar;
                return c0Var7.invokeSuspend(Unit.f18162a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0139  */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bg.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
