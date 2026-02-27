package k2;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1734k implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1734k f17969a = new C1734k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f17970b = C2294b.c("execution");
    public static final C2294b c = C2294b.c("customAttributes");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f17971d = C2294b.c("internalKeys");
    public static final C2294b e = C2294b.c("background");
    public static final C2294b f = C2294b.c("currentProcessDetails");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2294b f17972g = C2294b.c("appProcessDetails");
    public static final C2294b h = C2294b.c("uiOrientation");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1708S c1708s = (C1708S) ((F0) obj);
        interfaceC2296d.add(f17970b, c1708s.f17886a);
        interfaceC2296d.add(c, c1708s.f17887b);
        interfaceC2296d.add(f17971d, c1708s.c);
        interfaceC2296d.add(e, c1708s.f17888d);
        interfaceC2296d.add(f, c1708s.e);
        interfaceC2296d.add(f17972g, c1708s.f);
        interfaceC2296d.add(h, c1708s.f17889g);
    }
}
