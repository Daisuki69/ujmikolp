package bg;

import ag.C0703m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bg.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0988a0 implements Xf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xf.b f8919a;

    public static void c(ArrayList arrayList, Function1 function1, Function1 function12) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (C0703m[] c0703mArr : ((C1018v) it.next()).f9130b) {
                ArrayList arrayList2 = new ArrayList();
                for (C0703m c0703m : c0703mArr) {
                    arrayList2.add(c0703m);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (((Boolean) function1.invoke((C0703m) obj)).booleanValue()) {
                        arrayList3.add(obj);
                    }
                }
                function12.invoke(arrayList3);
            }
        }
    }

    public abstract Object a();

    @Override // Xf.a
    public Map b() {
        try {
            Object objA = a();
            String areaName = d();
            kotlin.jvm.internal.j.h(areaName, "areaName");
            return cj.L.c(new Pair(areaName, objA));
        } catch (IllegalAccessException e) {
            Exception exc = new Exception("Permission Denial: " + e.getMessage());
            String areaName2 = d();
            String strC = X5.f.c(exc);
            kotlin.jvm.internal.j.h(areaName2, "areaName");
            return cj.L.c(new Pair(areaName2, strC));
        } catch (Exception e7) {
            Xf.b bVar = this.f8919a;
            if (bVar != null) {
                bVar.b("Core", e7, null);
            }
            String areaName3 = d();
            String strC2 = X5.f.c(e7);
            kotlin.jvm.internal.j.h(areaName3, "areaName");
            return cj.L.c(new Pair(areaName3, strC2));
        }
    }
}
