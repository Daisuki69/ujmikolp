package b1;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: b1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0855i implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0855i f8309a = new C0855i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f8310b = C2294b.c("eventTimeMs");
    public static final C2294b c = C2294b.c("eventCode");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f8311d = C2294b.c("complianceData");
    public static final C2294b e = C2294b.c("eventUptimeMs");
    public static final C2294b f = C2294b.c("sourceExtension");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2294b f8312g = C2294b.c("sourceExtensionJsonProto3");
    public static final C2294b h = C2294b.c("timezoneOffsetSeconds");
    public static final C2294b i = C2294b.c("networkConnectionInfo");
    public static final C2294b j = C2294b.c("experimentIds");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        u uVar = (u) ((G) obj);
        interfaceC2296d.add(f8310b, uVar.f8337a);
        interfaceC2296d.add(c, uVar.f8338b);
        interfaceC2296d.add(f8311d, uVar.c);
        interfaceC2296d.add(e, uVar.f8339d);
        interfaceC2296d.add(f, uVar.e);
        interfaceC2296d.add(f8312g, uVar.f);
        interfaceC2296d.add(h, uVar.f8340g);
        interfaceC2296d.add(i, uVar.h);
        interfaceC2296d.add(j, uVar.i);
    }
}
