package k2;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1747r implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1747r f18004a = new C1747r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f18005b = C2294b.c("processName");
    public static final C2294b c = C2294b.c("pid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f18006d = C2294b.c("importance");
    public static final C2294b e = C2294b.c("defaultProcess");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1717b0 c1717b0 = (C1717b0) ((E0) obj);
        interfaceC2296d.add(f18005b, c1717b0.f17919a);
        interfaceC2296d.add(c, c1717b0.f17920b);
        interfaceC2296d.add(f18006d, c1717b0.c);
        interfaceC2296d.add(e, c1717b0.f17921d);
    }
}
