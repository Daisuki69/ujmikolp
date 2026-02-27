package c0;

import Bj.D0;
import Bj.E;
import Bj.InterfaceC0156n0;
import Bj.t0;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n2.C1915b;
import yj.l;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f9183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9184b;
    public final /* synthetic */ C1915b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C1915b c1915b, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.c = c1915b;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new c(this.c, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Iterator itA;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f9184b;
        if (i == 0) {
            AbstractC1039j.b(obj);
            D0 d02 = (D0) this.c.f;
            d02.getClass();
            itA = l.a(new t0(d02, null));
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            itA = this.f9183a;
            AbstractC1039j.b(obj);
        }
        while (itA.hasNext()) {
            InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) itA.next();
            this.f9183a = itA;
            this.f9184b = 1;
            if (interfaceC0156n0.z(this) == enumC1578a) {
                return enumC1578a;
            }
        }
        return Unit.f18162a;
    }
}
