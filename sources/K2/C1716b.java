package k2;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1716b implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1716b f17915a = new C1716b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f17916b = C2294b.c("pid");
    public static final C2294b c = C2294b.c("processName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f17917d = C2294b.c("reasonCode");
    public static final C2294b e = C2294b.c("importance");
    public static final C2294b f = C2294b.c("pss");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2294b f17918g = C2294b.c("rss");
    public static final C2294b h = C2294b.c("timestamp");
    public static final C2294b i = C2294b.c("traceFile");
    public static final C2294b j = C2294b.c("buildIdMappingForArch");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1695E c1695e = (C1695E) ((r0) obj);
        interfaceC2296d.add(f17916b, c1695e.f17843a);
        interfaceC2296d.add(c, c1695e.f17844b);
        interfaceC2296d.add(f17917d, c1695e.c);
        interfaceC2296d.add(e, c1695e.f17845d);
        interfaceC2296d.add(f, c1695e.e);
        interfaceC2296d.add(f17918g, c1695e.f);
        interfaceC2296d.add(h, c1695e.f17846g);
        interfaceC2296d.add(i, c1695e.h);
        interfaceC2296d.add(j, c1695e.i);
    }
}
