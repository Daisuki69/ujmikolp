package b1;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: b1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0856j implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0856j f8313a = new C0856j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f8314b = C2294b.c("requestTimeMs");
    public static final C2294b c = C2294b.c("requestUptimeMs");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f8315d = C2294b.c("clientInfo");
    public static final C2294b e = C2294b.c("logSource");
    public static final C2294b f = C2294b.c("logSourceName");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2294b f8316g = C2294b.c("logEvent");
    public static final C2294b h = C2294b.c("qosTier");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        v vVar = (v) ((H) obj);
        interfaceC2296d.add(f8314b, vVar.f8341a);
        interfaceC2296d.add(c, vVar.f8342b);
        interfaceC2296d.add(f8315d, vVar.c);
        interfaceC2296d.add(e, vVar.f8343d);
        interfaceC2296d.add(f, vVar.e);
        interfaceC2296d.add(f8316g, vVar.f);
        interfaceC2296d.add(h, L.f8289a);
    }
}
