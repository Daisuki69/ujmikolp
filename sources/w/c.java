package W;

import Bj.E;
import Bj.H;
import Bj.I0;
import N9.f;
import bj.AbstractC1039j;
import cj.L;
import cj.M;
import cj.t;
import dOYHB6.tiZVw8.numX49;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6159b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ e e;
    public final /* synthetic */ Function1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X.b f6160g;
    public final /* synthetic */ f h;
    public final /* synthetic */ X.c i;
    public final /* synthetic */ X.c j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ArrayList arrayList, e eVar, Function1 function1, X.b bVar, f fVar, X.c cVar, X.c cVar2, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.c = arrayList;
        this.e = eVar;
        this.f = function1;
        this.f6160g = bVar;
        this.h = fVar;
        this.i = cVar;
        this.j = cVar2;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        c cVar = new c(this.c, this.e, this.f, this.f6160g, this.h, this.i, this.j, interfaceC1526a);
        cVar.f6159b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) throws Throwable {
        e eVar;
        Object objC;
        Map map;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f6158a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            E e = (E) this.f6159b;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.c;
            ArrayList<Pair> arrayList3 = new ArrayList(t.l(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new Pair(((Pair) it.next()).f18160a, Boolean.FALSE));
            }
            int iB = L.b(t.l(arrayList3, 10));
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
            for (Pair pair : arrayList3) {
                linkedHashMap.put(pair.f18160a, pair.f18161b);
            }
            LinkedHashMap linkedHashMapO = M.o(linkedHashMap);
            Iterator it2 = arrayList2.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                eVar = this.e;
                if (!zHasNext) {
                    break;
                }
                arrayList.add(H.g(e, null, new a(eVar, (Pair) it2.next(), this.f6160g, linkedHashMapO, this.h, this.i, this.j, null), 3));
            }
            b bVar = new b(arrayList, null);
            this.f6159b = linkedHashMapO;
            this.f6158a = 1;
            objC = I0.c(eVar.c, bVar, this);
            if (objC == enumC1578a) {
                return enumC1578a;
            }
            map = linkedHashMapO;
        } else {
            if (i != 1) {
                throw new IllegalStateException(numX49.tnTj78("bPw2"));
            }
            map = (Map) this.f6159b;
            AbstractC1039j.b(obj);
            objC = obj;
        }
        List list = (List) objC;
        Function1 function1 = this.f;
        if (list != null) {
            function1.invoke(M.l(list));
        } else {
            function1.invoke(map);
        }
        return Unit.f18162a;
    }
}
