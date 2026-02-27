package q;

import android.graphics.Path;
import android.graphics.PointF;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;
import s.C2216a;
import z.AbstractC2540b;
import z.AbstractC2543e;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends e {
    public final u.j i;
    public final Path j;

    public n(List list) {
        super(list);
        this.i = new u.j();
        this.j = new Path();
    }

    @Override // q.e
    public final Object g(A.a aVar, float f) {
        u.j jVar = (u.j) aVar.f4b;
        u.j jVar2 = (u.j) aVar.c;
        u.j jVar3 = this.i;
        if (jVar3.f20239b == null) {
            jVar3.f20239b = new PointF();
        }
        jVar3.c = jVar.c || jVar2.c;
        ArrayList arrayList = jVar.f20238a;
        int size = arrayList.size();
        int size2 = jVar2.f20238a.size();
        ArrayList arrayList2 = jVar2.f20238a;
        if (size != size2) {
            AbstractC2540b.b(numX49.tnTj78("b27k") + arrayList.size() + numX49.tnTj78("b27B") + arrayList2.size());
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = jVar3.f20238a;
        if (arrayList3.size() < iMin) {
            for (int size3 = arrayList3.size(); size3 < iMin; size3++) {
                arrayList3.add(new C2216a());
            }
        } else if (arrayList3.size() > iMin) {
            for (int size4 = arrayList3.size() - 1; size4 >= iMin; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = jVar.f20239b;
        PointF pointF2 = jVar2.f20239b;
        float fD = AbstractC2543e.d(pointF.x, pointF2.x, f);
        float fD2 = AbstractC2543e.d(pointF.y, pointF2.y, f);
        if (jVar3.f20239b == null) {
            jVar3.f20239b = new PointF();
        }
        jVar3.f20239b.set(fD, fD2);
        for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
            C2216a c2216a = (C2216a) arrayList.get(size5);
            C2216a c2216a2 = (C2216a) arrayList2.get(size5);
            PointF pointF3 = c2216a.f19962a;
            PointF pointF4 = c2216a2.f19962a;
            ((C2216a) arrayList3.get(size5)).f19962a.set(AbstractC2543e.d(pointF3.x, pointF4.x, f), AbstractC2543e.d(pointF3.y, pointF4.y, f));
            C2216a c2216a3 = (C2216a) arrayList3.get(size5);
            PointF pointF5 = c2216a.f19963b;
            float f3 = pointF5.x;
            PointF pointF6 = c2216a2.f19963b;
            c2216a3.f19963b.set(AbstractC2543e.d(f3, pointF6.x, f), AbstractC2543e.d(pointF5.y, pointF6.y, f));
            C2216a c2216a4 = (C2216a) arrayList3.get(size5);
            PointF pointF7 = c2216a.c;
            float f7 = pointF7.x;
            PointF pointF8 = c2216a2.c;
            c2216a4.c.set(AbstractC2543e.d(f7, pointF8.x, f), AbstractC2543e.d(pointF7.y, pointF8.y, f));
        }
        Path path = this.j;
        path.reset();
        PointF pointF9 = jVar3.f20239b;
        path.moveTo(pointF9.x, pointF9.y);
        PointF pointF10 = AbstractC2543e.f21340a;
        pointF10.set(pointF9.x, pointF9.y);
        for (int i = 0; i < arrayList3.size(); i++) {
            C2216a c2216a5 = (C2216a) arrayList3.get(i);
            PointF pointF11 = c2216a5.f19962a;
            boolean zEquals = pointF11.equals(pointF10);
            PointF pointF12 = c2216a5.f19963b;
            PointF pointF13 = c2216a5.c;
            if (zEquals && pointF12.equals(pointF13)) {
                path.lineTo(pointF13.x, pointF13.y);
            } else {
                path.cubicTo(pointF11.x, pointF11.y, pointF12.x, pointF12.y, pointF13.x, pointF13.y);
            }
            pointF10.set(pointF13.x, pointF13.y);
        }
        if (jVar3.c) {
            path.close();
        }
        return path;
    }
}
