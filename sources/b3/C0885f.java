package b3;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: b3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0885f implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0885f f8454a = new C0885f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f8455b = C2294b.c("processName");
    public static final C2294b c = C2294b.c("pid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f8456d = C2294b.c("importance");
    public static final C2294b e = C2294b.c("defaultProcess");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        C0865E c0865e = (C0865E) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(f8455b, c0865e.f8384a);
        interfaceC2296d.add(c, c0865e.f8385b);
        interfaceC2296d.add(f8456d, c0865e.c);
        interfaceC2296d.add(e, c0865e.f8386d);
    }
}
