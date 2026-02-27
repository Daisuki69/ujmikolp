package bg;

import ag.C0702l;
import ag.C0703m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Pair;

/* JADX INFO: renamed from: bg.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0954B extends AbstractC0988a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8650b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0954B(ArrayList _configurations, C0965G0 c0965g0) {
        super(c0965g0);
        kotlin.jvm.internal.j.h(_configurations, "_configurations");
        this.f8650b = _configurations;
    }

    @Override // bg.AbstractC0988a0
    public final Object a() {
        ArrayList arrayList;
        LinkedList linkedList = new LinkedList();
        for (C0703m c0703m : this.f8650b) {
            if (c0703m != null) {
                ArrayList arrayList2 = new ArrayList();
                switch (c0703m.f7216a) {
                    case 0:
                        ArrayList arrayList3 = c0703m.f7217b;
                        arrayList = new ArrayList(cj.t.l(arrayList3, 10));
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((C0702l) it.next()).f7213a));
                        }
                        break;
                    default:
                        ArrayList arrayList4 = c0703m.f7217b;
                        arrayList = new ArrayList(cj.t.l(arrayList4, 10));
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((C0960E) it2.next()).f8725a));
                        }
                        break;
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(String.valueOf(((Number) it3.next()).intValue()));
                }
                linkedList.add(cj.M.i(new Pair(c0703m.a().d(), arrayList2)));
            }
        }
        return linkedList;
    }

    @Override // Xf.a
    public final String d() {
        return "DataSetDescription";
    }
}
