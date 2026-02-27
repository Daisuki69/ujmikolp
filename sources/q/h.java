package q;

import android.graphics.Color;
import o.C1953a;
import t.C2264a;
import t.C2265b;
import v.AbstractC2327b;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements InterfaceC2157a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f19725b;
    public final i c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f19726d;
    public final i e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19727g = true;

    public h(InterfaceC2157a interfaceC2157a, AbstractC2327b abstractC2327b, Ci.b bVar) {
        this.f19724a = interfaceC2157a;
        e eVarF = ((C2264a) bVar.f785b).f();
        this.f19725b = (f) eVarF;
        eVarF.a(this);
        abstractC2327b.f(eVarF);
        e eVarF2 = ((C2265b) bVar.c).f();
        this.c = (i) eVarF2;
        eVarF2.a(this);
        abstractC2327b.f(eVarF2);
        e eVarF3 = ((C2265b) bVar.f786d).f();
        this.f19726d = (i) eVarF3;
        eVarF3.a(this);
        abstractC2327b.f(eVarF3);
        e eVarF4 = ((C2265b) bVar.e).f();
        this.e = (i) eVarF4;
        eVarF4.a(this);
        abstractC2327b.f(eVarF4);
        e eVarF5 = ((C2265b) bVar.f).f();
        this.f = (i) eVarF5;
        eVarF5.a(this);
        abstractC2327b.f(eVarF5);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, q.a] */
    @Override // q.InterfaceC2157a
    public final void a() {
        this.f19727g = true;
        this.f19724a.a();
    }

    public final void b(C1953a c1953a) {
        if (this.f19727g) {
            this.f19727g = false;
            double dFloatValue = ((double) ((Float) this.f19726d.f()).floatValue()) * 0.017453292519943295d;
            float fFloatValue = ((Float) this.e.f()).floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = ((Integer) this.f19725b.f()).intValue();
            c1953a.setShadowLayer(((Float) this.f.f()).floatValue(), fSin, fCos, Color.argb(Math.round(((Float) this.c.f()).floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public final void c(A.c cVar) {
        this.c.k(new g(cVar));
    }
}
