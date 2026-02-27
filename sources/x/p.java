package x;

import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import n.C1880g;
import pg.C2038a;
import y.AbstractC2494a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2038a f20838a = C2038a.h(numX49.tnTj78("bbNPp"));

    public static ArrayList a(AbstractC2494a abstractC2494a, C1880g c1880g, float f, InterfaceC2445C interfaceC2445C, boolean z4) {
        AbstractC2494a abstractC2494a2;
        C1880g c1880g2;
        float f3;
        InterfaceC2445C interfaceC2445C2;
        boolean z5;
        ArrayList arrayList = new ArrayList();
        if (abstractC2494a.peek() == 6) {
            c1880g.a(numX49.tnTj78("bbNP0"));
            return arrayList;
        }
        abstractC2494a.c();
        while (abstractC2494a.i()) {
            if (abstractC2494a.w(f20838a) != 0) {
                abstractC2494a.z();
            } else if (abstractC2494a.peek() == 1) {
                abstractC2494a.b();
                if (abstractC2494a.peek() == 7) {
                    AbstractC2494a abstractC2494a3 = abstractC2494a;
                    C1880g c1880g3 = c1880g;
                    float f7 = f;
                    InterfaceC2445C interfaceC2445C3 = interfaceC2445C;
                    boolean z8 = z4;
                    A.a aVarB = o.b(abstractC2494a3, c1880g3, f7, interfaceC2445C3, false, z8);
                    abstractC2494a2 = abstractC2494a3;
                    c1880g2 = c1880g3;
                    f3 = f7;
                    interfaceC2445C2 = interfaceC2445C3;
                    z5 = z8;
                    arrayList.add(aVarB);
                } else {
                    abstractC2494a2 = abstractC2494a;
                    c1880g2 = c1880g;
                    f3 = f;
                    interfaceC2445C2 = interfaceC2445C;
                    z5 = z4;
                    while (abstractC2494a2.i()) {
                        arrayList.add(o.b(abstractC2494a2, c1880g2, f3, interfaceC2445C2, true, z5));
                    }
                }
                abstractC2494a2.f();
                abstractC2494a = abstractC2494a2;
                c1880g = c1880g2;
                f = f3;
                interfaceC2445C = interfaceC2445C2;
                z4 = z5;
            } else {
                AbstractC2494a abstractC2494a4 = abstractC2494a;
                arrayList.add(o.b(abstractC2494a4, c1880g, f, interfaceC2445C, false, z4));
                abstractC2494a = abstractC2494a4;
            }
        }
        abstractC2494a.g();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            i = size - 1;
            if (i4 >= i) {
                break;
            }
            A.a aVar = (A.a) arrayList.get(i4);
            i4++;
            A.a aVar2 = (A.a) arrayList.get(i4);
            aVar.h = Float.valueOf(aVar2.f6g);
            if (aVar.c == null && (obj = aVar2.f4b) != null) {
                aVar.c = obj;
                if (aVar instanceof q.l) {
                    ((q.l) aVar).d();
                }
            }
        }
        A.a aVar3 = (A.a) arrayList.get(i);
        if ((aVar3.f4b == null || aVar3.c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
