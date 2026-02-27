package k2;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1751v implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1751v f18017a = new C1751v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f18018b = C2294b.c("rolloutVariant");
    public static final C2294b c = C2294b.c("parameterKey");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f18019d = C2294b.c("parameterValue");
    public static final C2294b e = C2294b.c("templateVersion");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1727g0 c1727g0 = (C1727g0) ((J0) obj);
        interfaceC2296d.add(f18018b, c1727g0.f17949a);
        interfaceC2296d.add(c, c1727g0.f17950b);
        interfaceC2296d.add(f18019d, c1727g0.c);
        interfaceC2296d.add(e, c1727g0.f17951d);
    }
}
