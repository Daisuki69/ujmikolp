package c1;

import f1.C1459e;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;
import x2.C2454a;
import x2.InterfaceC2458e;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f9219a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f9220b = new C2294b("logSource", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(1))));
    public static final C2294b c = new C2294b("logEventDropped", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(2))));

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        C1459e c1459e = (C1459e) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(f9220b, c1459e.f16697a);
        interfaceC2296d.add(c, c1459e.f16698b);
    }
}
