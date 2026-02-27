package ph;

import fh.C1485a;
import hh.InterfaceC1568a;
import hh.InterfaceC1570c;
import hh.InterfaceC1573f;

/* JADX INFO: renamed from: ph.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2054b1 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19415b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19416d;
    public final Object e;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2054b1(ch.l lVar, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(lVar);
        this.f19415b = i;
        this.c = obj;
        this.f19416d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19415b) {
            case 0:
                X0 x02 = new X0(rVar, (hh.n) this.f19416d, (hh.n) this.e, (InterfaceC1570c) this.f, 0);
                rVar.onSubscribe(x02);
                C2050a1 c2050a1 = new C2050a1(x02, true);
                C1485a c1485a = x02.f19374d;
                c1485a.a(c2050a1);
                C2050a1 c2050a12 = new C2050a1(x02, false);
                c1485a.a(c2050a12);
                this.f19404a.subscribe(c2050a1);
                ((ch.p) this.c).subscribe(c2050a12);
                break;
            case 1:
                X0 x03 = new X0(rVar, (hh.n) this.f19416d, (hh.n) this.e, (InterfaceC1570c) this.f, 1);
                rVar.onSubscribe(x03);
                C2050a1 c2050a13 = new C2050a1(x03, true);
                C1485a c1485a2 = x03.f19374d;
                c1485a2.a(c2050a13);
                C2050a1 c2050a14 = new C2050a1(x03, false);
                c1485a2.a(c2050a14);
                this.f19404a.subscribe(c2050a13);
                ((ch.p) this.c).subscribe(c2050a14);
                break;
            default:
                this.f19404a.subscribe(new C2128u0(rVar, (InterfaceC1573f) this.c, (InterfaceC1573f) this.f19416d, (InterfaceC1568a) this.e, (InterfaceC1568a) this.f));
                break;
        }
    }
}
