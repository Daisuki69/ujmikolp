package x;

import android.graphics.PointF;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Collections;
import pg.C2038a;
import s.C2216a;
import y.AbstractC2494a;
import z.AbstractC2543e;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements InterfaceC2445C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f20848a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2038a f20849b = C2038a.h(numX49.tnTj78("bbNPT"), "v", numX49.tnTj78("bbNPA"), numX49.tnTj78("bbNPY"));

    @Override // x.InterfaceC2445C
    public final Object a(AbstractC2494a abstractC2494a, float f) {
        if (abstractC2494a.peek() == 1) {
            abstractC2494a.b();
        }
        abstractC2494a.c();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zK = false;
        while (abstractC2494a.i()) {
            int iW = abstractC2494a.w(f20849b);
            if (iW == 0) {
                zK = abstractC2494a.k();
            } else if (iW == 1) {
                arrayListC = n.c(abstractC2494a, f);
            } else if (iW == 2) {
                arrayListC2 = n.c(abstractC2494a, f);
            } else if (iW != 3) {
                abstractC2494a.y();
                abstractC2494a.z();
            } else {
                arrayListC3 = n.c(abstractC2494a, f);
            }
        }
        abstractC2494a.g();
        if (abstractC2494a.peek() == 2) {
            abstractC2494a.f();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bbNPR"));
        }
        if (arrayListC.isEmpty()) {
            return new u.j(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i4 = i - 1;
            arrayList.add(new C2216a(AbstractC2543e.a((PointF) arrayListC.get(i4), (PointF) arrayListC3.get(i4)), AbstractC2543e.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zK) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i6 = size - 1;
            arrayList.add(new C2216a(AbstractC2543e.a((PointF) arrayListC.get(i6), (PointF) arrayListC3.get(i6)), AbstractC2543e.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new u.j(pointF, zK, arrayList);
    }
}
