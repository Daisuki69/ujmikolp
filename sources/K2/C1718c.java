package k2;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1718c implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1718c f17922a = new C1718c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f17923b = C2294b.c("key");
    public static final C2294b c = C2294b.c("value");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1697G c1697g = (C1697G) ((s0) obj);
        interfaceC2296d.add(f17923b, c1697g.f17849a);
        interfaceC2296d.add(c, c1697g.f17850b);
    }
}
