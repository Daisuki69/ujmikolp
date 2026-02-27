package W;

import Bj.E;
import Bj.H;
import bj.AbstractC1039j;
import dOYHB6.tiZVw8.numX49;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6157b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ArrayList arrayList, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f6157b = arrayList;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new b(this.f6157b, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f6156a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(numX49.tnTj78("bPwP"));
            }
            AbstractC1039j.b(obj);
            return obj;
        }
        AbstractC1039j.b(obj);
        ArrayList arrayList = this.f6157b;
        this.f6156a = 1;
        Object objH = H.h(arrayList, this);
        return objH == enumC1578a ? enumC1578a : objH;
    }
}
