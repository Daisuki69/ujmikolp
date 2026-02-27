package Ej;

import b3.C0868H;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import kotlin.Unit;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements InterfaceC0231i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1391b;

    public /* synthetic */ C(Object obj, int i) {
        this.f1390a = i;
        this.f1391b = obj;
    }

    @Override // Ej.InterfaceC0231i
    public final Object emit(Object obj, InterfaceC1526a interfaceC1526a) {
        switch (this.f1390a) {
            case 0:
                ((kotlin.jvm.internal.y) this.f1391b).f18195a = obj;
                throw new AbortFlowException(this);
            case 1:
                ((kotlin.jvm.internal.y) this.f1391b).f18195a = obj;
                throw new AbortFlowException(this);
            default:
                C0868H c0868h = (C0868H) obj;
                b3.e0 e0Var = (b3.e0) this.f1391b;
                e0Var.getClass();
                kotlin.jvm.internal.j.g(c0868h, "<set-?>");
                e0Var.h = c0868h;
                Object objA = b3.e0.a(e0Var, c0868h.f8389a.f8393a, b3.Y.f8422a, interfaceC1526a);
                return objA == EnumC1578a.f17050a ? objA : Unit.f18162a;
        }
    }
}
