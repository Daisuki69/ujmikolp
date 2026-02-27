package q;

import android.view.animation.Interpolator;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;
import n.AbstractC1876c;
import p0.C2004c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public final b c;
    public A.c e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19720a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19721b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f19722d = 0.0f;
    public Object f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f19723g = -1.0f;
    public float h = -1.0f;

    public e(List list) {
        b dVar;
        if (list.isEmpty()) {
            dVar = new C2004c();
        } else {
            dVar = list.size() == 1 ? new d(list) : new c(list);
        }
        this.c = dVar;
    }

    public final void a(InterfaceC2157a interfaceC2157a) {
        this.f19720a.add(interfaceC2157a);
    }

    public final A.a b() {
        A.a aVarB = this.c.b();
        AbstractC1876c.a();
        return aVarB;
    }

    public float c() {
        if (this.h == -1.0f) {
            this.h = this.c.e();
        }
        return this.h;
    }

    public final float d() {
        A.a aVarB = b();
        if (aVarB.c()) {
            return 0.0f;
        }
        return aVarB.f5d.getInterpolation(e());
    }

    public final float e() {
        if (this.f19721b) {
            return 0.0f;
        }
        A.a aVarB = b();
        if (aVarB.c()) {
            return 0.0f;
        }
        return (this.f19722d - aVarB.b()) / (aVarB.a() - aVarB.b());
    }

    public Object f() {
        Interpolator interpolator;
        float fE = e();
        if (this.e == null && this.c.a(fE)) {
            return this.f;
        }
        A.a aVarB = b();
        Interpolator interpolator2 = aVarB.e;
        Object objG = (interpolator2 == null || (interpolator = aVarB.f) == null) ? g(aVarB, d()) : h(aVarB, fE, interpolator2.getInterpolation(fE), interpolator.getInterpolation(fE));
        this.f = objG;
        return objG;
    }

    public abstract Object g(A.a aVar, float f);

    public Object h(A.a aVar, float f, float f3, float f7) {
        throw new UnsupportedOperationException(numX49.tnTj78("b27u"));
    }

    public void i() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f19720a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC2157a) arrayList.get(i)).a();
            i++;
        }
    }

    public void j(float f) {
        b bVar = this.c;
        if (bVar.isEmpty()) {
            return;
        }
        if (this.f19723g == -1.0f) {
            this.f19723g = bVar.d();
        }
        float f3 = this.f19723g;
        if (f < f3) {
            if (f3 == -1.0f) {
                this.f19723g = bVar.d();
            }
            f = this.f19723g;
        } else if (f > c()) {
            f = c();
        }
        if (f == this.f19722d) {
            return;
        }
        this.f19722d = f;
        if (bVar.c(f)) {
            i();
        }
    }

    public final void k(A.c cVar) {
        A.c cVar2 = this.e;
        if (cVar2 != null) {
            cVar2.getClass();
        }
        this.e = cVar;
    }
}
