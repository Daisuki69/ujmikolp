package k2;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1720d implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1720d f17928a = new C1720d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f17929b = C2294b.c("sdkVersion");
    public static final C2294b c = C2294b.c("gmpAppId");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f17930d = C2294b.c("platform");
    public static final C2294b e = C2294b.c("installationUuid");
    public static final C2294b f = C2294b.c("firebaseInstallationId");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2294b f17931g = C2294b.c("firebaseAuthenticationToken");
    public static final C2294b h = C2294b.c("appQualitySessionId");
    public static final C2294b i = C2294b.c("buildVersion");
    public static final C2294b j = C2294b.c("displayVersion");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C2294b f17932k = C2294b.c("session");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C2294b f17933l = C2294b.c("ndkPayload");
    public static final C2294b m = C2294b.c("appExitInfo");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1693C c1693c = (C1693C) ((P0) obj);
        interfaceC2296d.add(f17929b, c1693c.f17834b);
        interfaceC2296d.add(c, c1693c.c);
        interfaceC2296d.add(f17930d, c1693c.f17835d);
        interfaceC2296d.add(e, c1693c.e);
        interfaceC2296d.add(f, c1693c.f);
        interfaceC2296d.add(f17931g, c1693c.f17836g);
        interfaceC2296d.add(h, c1693c.h);
        interfaceC2296d.add(i, c1693c.i);
        interfaceC2296d.add(j, c1693c.j);
        interfaceC2296d.add(f17932k, c1693c.f17837k);
        interfaceC2296d.add(f17933l, c1693c.f17838l);
        interfaceC2296d.add(m, c1693c.m);
    }
}
