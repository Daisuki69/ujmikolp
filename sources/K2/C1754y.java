package k2;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1754y implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1754y f18027a = new C1754y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f18028b = C2294b.c("platform");
    public static final C2294b c = C2294b.c("version");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f18029d = C2294b.c("buildVersion");
    public static final C2294b e = C2294b.c("jailbroken");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1735k0 c1735k0 = (C1735k0) ((M0) obj);
        interfaceC2296d.add(f18028b, c1735k0.f17973a);
        interfaceC2296d.add(c, c1735k0.f17974b);
        interfaceC2296d.add(f18029d, c1735k0.c);
        interfaceC2296d.add(e, c1735k0.f17975d);
    }
}
