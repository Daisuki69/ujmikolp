package bg;

import We.C0600d;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.Iterator;
import z.AbstractC2544f;

/* JADX INFO: renamed from: bg.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1006j0 implements cj.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9018a;

    public C1006j0(ArrayList arrayList) {
        this.f9018a = arrayList;
    }

    @Override // cj.F
    public Object a(Object obj) {
        return Integer.valueOf(((C0960E) obj).f8725a);
    }

    @Override // cj.F
    public Iterator b() {
        return this.f9018a.iterator();
    }

    public void c(Path path) {
        ArrayList arrayList = this.f9018a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p.s sVar = (p.s) arrayList.get(size);
            C0600d c0600d = AbstractC2544f.f21341a;
            if (sVar != null && !sVar.f19010a) {
                AbstractC2544f.a(path, sVar.f19012d.l() / 100.0f, sVar.e.l() / 100.0f, sVar.f.l() / 360.0f);
            }
        }
    }

    public C1006j0() {
        this.f9018a = new ArrayList();
    }
}
