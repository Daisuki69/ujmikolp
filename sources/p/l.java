package p;

import D.A;
import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements m, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f18984a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f18985b = new Path();
    public final Path c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f18986d = new ArrayList();
    public final u.g e;

    public l(u.g gVar) {
        gVar.getClass();
        this.e = gVar;
    }

    public final void a(Path.Op op) {
        Matrix matrixE;
        Matrix matrixE2;
        Path path = this.f18985b;
        path.reset();
        Path path2 = this.f18984a;
        path2.reset();
        ArrayList arrayList = this.f18986d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            m mVar = (m) arrayList.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                ArrayList arrayList2 = (ArrayList) dVar.f();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((m) arrayList2.get(size2)).getPath();
                    A a8 = dVar.f18948k;
                    if (a8 != null) {
                        matrixE2 = a8.e();
                    } else {
                        matrixE2 = dVar.c;
                        matrixE2.reset();
                    }
                    path3.transform(matrixE2);
                    path.addPath(path3);
                }
            } else {
                path.addPath(mVar.getPath());
            }
        }
        int i = 0;
        m mVar2 = (m) arrayList.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List listF = dVar2.f();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listF;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((m) arrayList3.get(i)).getPath();
                A a10 = dVar2.f18948k;
                if (a10 != null) {
                    matrixE = a10.e();
                } else {
                    matrixE = dVar2.c;
                    matrixE.reset();
                }
                path4.transform(matrixE);
                path2.addPath(path4);
                i++;
            }
        } else {
            path2.set(mVar2.getPath());
        }
        this.c.op(path2, path, op);
    }

    @Override // p.c
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f18986d;
            if (i >= arrayList.size()) {
                return;
            }
            ((m) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // p.j
    public final void f(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVar = (c) listIterator.previous();
            if (cVar instanceof m) {
                this.f18986d.add((m) cVar);
                listIterator.remove();
            }
        }
    }

    @Override // p.m
    public final Path getPath() {
        Path path = this.c;
        path.reset();
        u.g gVar = this.e;
        if (!gVar.f20230b) {
            int iC = AbstractC2217b.c(gVar.f20229a);
            if (iC == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.f18986d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((m) arrayList.get(i)).getPath());
                    i++;
                }
            } else {
                if (iC == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (iC == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iC == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (iC == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
