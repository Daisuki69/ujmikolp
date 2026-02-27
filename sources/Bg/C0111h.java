package Bg;

import a.AbstractC0617a;
import bg.AbstractC0983W;
import bj.AbstractC1039j;
import cj.C1110A;
import cj.C1114E;
import dj.C1406d;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: Bg.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0111h extends AbstractC1616j implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Vg.e f529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0112i f530b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0111h(C0112i c0112i, InterfaceC1526a interfaceC1526a) {
        super(3, interfaceC1526a);
        this.f530b = c0112i;
    }

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C0111h c0111h = new C0111h(this.f530b, (InterfaceC1526a) obj3);
        c0111h.f529a = (Vg.e) obj;
        return c0111h.invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Set setZ;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        Vg.e eVar = this.f529a;
        String string = ((Jg.c) eVar.f6113a).f2520a.toString();
        C0110g c0110g = new C0110g();
        Jg.c cVar = (Jg.c) eVar.f6113a;
        Ng.n nVar = cVar.c;
        Ng.n nVar2 = c0110g.f526a;
        AbstractC0617a.m(nVar2, nVar);
        Map values = (Map) nVar2.f5552b;
        kotlin.jvm.internal.j.g(values, "values");
        Rg.h hVar = new Rg.h();
        for (Map.Entry entry : values.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add((String) list.get(i));
            }
            hVar.put(str, arrayList);
        }
        this.f530b.f532a.invoke(c0110g);
        Set setEntrySet = hVar.entrySet();
        kotlin.jvm.internal.j.g(setEntrySet, "<this>");
        Set<Map.Entry> setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        kotlin.jvm.internal.j.f(setUnmodifiableSet, "unmodifiableSet(...)");
        for (Map.Entry entry2 : setUnmodifiableSet) {
            String str2 = (String) entry2.getKey();
            List list2 = (List) entry2.getValue();
            List listC = nVar2.c(str2);
            if (listC == null) {
                nVar2.e(list2, str2);
            } else if (!listC.equals(list2)) {
                List list3 = Ng.q.f4436a;
                if (!str2.equals("Cookie")) {
                    values.remove(str2);
                    nVar2.e(list2, str2);
                    List list4 = listC;
                    List list5 = (List) values.get(str2);
                    if (list5 == null || (setZ = C1110A.Z(list5)) == null) {
                        setZ = C1114E.f9379a;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list4) {
                        if (!setZ.contains((String) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    nVar2.e(arrayList2, str2);
                }
            }
        }
        Ng.E eB = c0110g.f527b.b();
        C0105b c0105b = C0112i.f531b;
        Ng.A a8 = cVar.f2520a;
        if (a8.f4405d == null) {
            a8.f4405d = eB.f4416g;
        }
        if (a8.f4403a.length() <= 0) {
            Ng.A a10 = new Ng.A();
            kotlin.jvm.internal.j.g(a10, "<this>");
            a10.f4405d = eB.f4416g;
            String str3 = eB.f4413a;
            kotlin.jvm.internal.j.g(str3, "<set-?>");
            a10.f4403a = str3;
            a10.e(eB.a());
            Xh.i.C(a10, (String) eB.i.getValue());
            a10.e = (String) eB.f4417k.getValue();
            a10.f = (String) eB.f4418l.getValue();
            Ng.y yVar = new Ng.y(0);
            yVar.k(X5.f.x((String) eB.j.getValue()));
            a10.i = yVar;
            a10.j = new G6.w(yVar);
            String str4 = (String) eB.m.getValue();
            kotlin.jvm.internal.j.g(str4, "<set-?>");
            a10.f4406g = str4;
            a10.f4404b = eB.e;
            a10.f4405d = a8.f4405d;
            int i4 = a8.c;
            if (i4 != 0) {
                a10.e(i4);
            }
            List listA = a10.h;
            List list6 = a8.h;
            if (!list6.isEmpty()) {
                if (listA.isEmpty() || ((CharSequence) C1110A.A(list6)).length() == 0) {
                    listA = list6;
                } else {
                    C1406d c1406d = new C1406d((list6.size() + listA.size()) - 1);
                    int size2 = listA.size() - 1;
                    for (int i6 = 0; i6 < size2; i6++) {
                        c1406d.add(listA.get(i6));
                    }
                    c1406d.addAll(list6);
                    listA = cj.r.a(c1406d);
                }
            }
            a10.d(listA);
            if (a8.f4406g.length() > 0) {
                String str5 = a8.f4406g;
                kotlin.jvm.internal.j.g(str5, "<set-?>");
                a10.f4406g = str5;
            }
            Ng.y yVar2 = new Ng.y(0);
            AbstractC0617a.m(yVar2, a10.i);
            Ng.y value = a8.i;
            kotlin.jvm.internal.j.g(value, "value");
            a10.i = value;
            a10.j = new G6.w(value);
            for (Map.Entry entry3 : yVar2.a()) {
                String name = (String) entry3.getKey();
                List list7 = (List) entry3.getValue();
                Ng.y yVar3 = a10.i;
                yVar3.getClass();
                kotlin.jvm.internal.j.g(name, "name");
                if (!((Map) yVar3.f5552b).containsKey(name)) {
                    a10.i.e(list7, name);
                }
            }
            AbstractC0983W.F(a8, a10);
        }
        Rg.j jVar = c0110g.c;
        for (Rg.a aVar : C1110A.V(jVar.d().keySet())) {
            if (!cVar.f.b(aVar)) {
                cVar.f.f(aVar, jVar.c(aVar));
            }
        }
        cVar.c.l();
        cVar.c.k(new Ng.o(values));
        ok.b bVar = AbstractC0113j.f535a;
        StringBuilder sbW = We.s.w("Applied DefaultRequest to ", string, ". New url: ");
        sbW.append(cVar.f2520a);
        bVar.g(sbW.toString());
        return Unit.f18162a;
    }
}
