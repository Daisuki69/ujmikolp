package k2;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1724f implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1724f f17940a = new C1724f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f17941b = C2294b.c("filename");
    public static final C2294b c = C2294b.c("contents");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1699I c1699i = (C1699I) ((t0) obj);
        interfaceC2296d.add(f17941b, c1699i.f17853a);
        interfaceC2296d.add(c, c1699i.f17854b);
    }
}
