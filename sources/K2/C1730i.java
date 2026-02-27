package k2;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1730i implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1730i f17955a = new C1730i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f17956b = C2294b.c("arch");
    public static final C2294b c = C2294b.c("model");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f17957d = C2294b.c("cores");
    public static final C2294b e = C2294b.c("ram");
    public static final C2294b f = C2294b.c("diskSpace");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2294b f17958g = C2294b.c("simulator");
    public static final C2294b h = C2294b.c("state");
    public static final C2294b i = C2294b.c("manufacturer");
    public static final C2294b j = C2294b.c("modelClass");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1705O c1705o = (C1705O) ((x0) obj);
        interfaceC2296d.add(f17956b, c1705o.f17874a);
        interfaceC2296d.add(c, c1705o.f17875b);
        interfaceC2296d.add(f17957d, c1705o.c);
        interfaceC2296d.add(e, c1705o.f17876d);
        interfaceC2296d.add(f, c1705o.e);
        interfaceC2296d.add(f17958g, c1705o.f);
        interfaceC2296d.add(h, c1705o.f17877g);
        interfaceC2296d.add(i, c1705o.h);
        interfaceC2296d.add(j, c1705o.i);
    }
}
