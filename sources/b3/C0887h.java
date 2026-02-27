package b3;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: b3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0887h implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0887h f8461a = new C0887h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f8462b = C2294b.c("sessionId");
    public static final C2294b c = C2294b.c("firstSessionId");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f8463d = C2294b.c("sessionIndex");
    public static final C2294b e = C2294b.c("eventTimestampUs");
    public static final C2294b f = C2294b.c("dataCollectionStatus");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2294b f8464g = C2294b.c("firebaseInstallationId");
    public static final C2294b h = C2294b.c("firebaseAuthenticationToken");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        V v7 = (V) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(f8462b, v7.f8414a);
        interfaceC2296d.add(c, v7.f8415b);
        interfaceC2296d.add(f8463d, v7.c);
        interfaceC2296d.add(e, v7.f8416d);
        interfaceC2296d.add(f, v7.e);
        interfaceC2296d.add(f8464g, v7.f);
        interfaceC2296d.add(h, v7.f8417g);
    }
}
