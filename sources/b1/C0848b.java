package b1;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: b1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0848b implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0848b f8291a = new C0848b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f8292b = C2294b.c("sdkVersion");
    public static final C2294b c = C2294b.c("model");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f8293d = C2294b.c("hardware");
    public static final C2294b e = C2294b.c("device");
    public static final C2294b f = C2294b.c("product");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2294b f8294g = C2294b.c("osBuild");
    public static final C2294b h = C2294b.c("manufacturer");
    public static final C2294b i = C2294b.c("fingerprint");
    public static final C2294b j = C2294b.c("locale");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C2294b f8295k = C2294b.c("country");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C2294b f8296l = C2294b.c("mccMnc");
    public static final C2294b m = C2294b.c("applicationBuild");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        m mVar = (m) ((AbstractC0847a) obj);
        interfaceC2296d.add(f8292b, mVar.f8320a);
        interfaceC2296d.add(c, mVar.f8321b);
        interfaceC2296d.add(f8293d, mVar.c);
        interfaceC2296d.add(e, mVar.f8322d);
        interfaceC2296d.add(f, mVar.e);
        interfaceC2296d.add(f8294g, mVar.f);
        interfaceC2296d.add(h, mVar.f8323g);
        interfaceC2296d.add(i, mVar.h);
        interfaceC2296d.add(j, mVar.i);
        interfaceC2296d.add(f8295k, mVar.j);
        interfaceC2296d.add(f8296l, mVar.f8324k);
        interfaceC2296d.add(m, mVar.f8325l);
    }
}
