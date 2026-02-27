package U;

import Bj.E;
import Bj.H;
import Lh.c;
import bj.AbstractC1039j;
import dOYHB6.tiZVw8.numX49;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5891b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ c e;
    public final /* synthetic */ X.b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ArrayList arrayList, c cVar, X.b bVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.c = arrayList;
        this.e = cVar;
        this.f = bVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        b bVar = new b(this.c, this.e, this.f, interfaceC1526a);
        bVar.f5891b = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f5890a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            E e = (E) this.f5891b;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                arrayList.add(H.g(e, null, new a(this.e, (String) it.next(), this.f, null), 3));
            }
            this.f5890a = 1;
            if (H.h(arrayList, this) == enumC1578a) {
                return enumC1578a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException(numX49.tnTj78("bPtP"));
            }
            AbstractC1039j.b(obj);
        }
        return Unit.f18162a;
    }
}
