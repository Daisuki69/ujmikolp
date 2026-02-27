package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import ih.EnumC1605c;

/* JADX INFO: renamed from: ph.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2121s1 extends ch.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2121s1 f19630b = new C2121s1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19631a;

    public /* synthetic */ C2121s1(int i) {
        this.f19631a = i;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19631a) {
            case 0:
                rVar.onSubscribe(EnumC1605c.f17150b);
                return;
            default:
                C2053b0 c2053b0 = new C2053b0(rVar);
                rVar.onSubscribe(c2053b0);
                try {
                    throw null;
                } catch (Throwable th2) {
                    of.p.F(th2);
                    if (EnumC1604b.b((InterfaceC1486b) c2053b0.get())) {
                        S1.s.r(th2);
                        return;
                    }
                    try {
                        c2053b0.f19414a.onError(th2);
                        return;
                    } finally {
                        EnumC1604b.a(c2053b0);
                    }
                }
        }
    }
}
