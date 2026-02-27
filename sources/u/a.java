package U;

import Ag.l;
import Bj.E;
import Lh.c;
import V.d;
import V.e;
import bj.AbstractC1039j;
import dOYHB6.tiZVw8.numX49;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f5888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5889b;
    public final /* synthetic */ X.b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, String str, X.b bVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f5888a = cVar;
        this.f5889b = str;
        this.c = bVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new a(this.f5888a, this.f5889b, this.c, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Map] */
    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        T.b bVar = (T.b) ((l) this.f5888a.f2990b).invoke();
        String str = this.f5889b;
        j.g(str, numX49.tnTj78("bPtb"));
        List<e> list = (List) bVar.e.get(Q.a.f5194a);
        if (list != null) {
            for (e eVar : list) {
                Object objTnTj78 = eVar instanceof d ? Q.a.f5194a : eVar instanceof V.c ? Q.a.f5195b : eVar instanceof V.a ? Q.a.c : numX49.tnTj78("bPt2");
                if (eVar.b(str) != null) {
                    objTnTj78.toString();
                }
                if (eVar.c(str)) {
                    objTnTj78.toString();
                }
            }
        }
        this.c.invoke(str);
        return Unit.f18162a;
    }
}
