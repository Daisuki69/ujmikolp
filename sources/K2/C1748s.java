package k2;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1748s implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1748s f18007a = new C1748s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f18008b = C2294b.c("batteryLevel");
    public static final C2294b c = C2294b.c("batteryVelocity");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f18009d = C2294b.c("proximityOn");
    public static final C2294b e = C2294b.c("orientation");
    public static final C2294b f = C2294b.c("ramUsed");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2294b f18010g = C2294b.c("diskUsed");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1721d0 c1721d0 = (C1721d0) ((G0) obj);
        interfaceC2296d.add(f18008b, c1721d0.f17934a);
        interfaceC2296d.add(c, c1721d0.f17935b);
        interfaceC2296d.add(f18009d, c1721d0.c);
        interfaceC2296d.add(e, c1721d0.f17936d);
        interfaceC2296d.add(f, c1721d0.e);
        interfaceC2296d.add(f18010g, c1721d0.f);
    }
}
