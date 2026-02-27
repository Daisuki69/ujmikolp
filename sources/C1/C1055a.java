package c1;

import f1.C1455a;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;
import x2.C2454a;
import x2.InterfaceC2458e;

/* JADX INFO: renamed from: c1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1055a implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1055a f9212a = new C1055a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f9213b = new C2294b("window", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(1))));
    public static final C2294b c = new C2294b("logSourceMetrics", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f9214d = new C2294b("globalMetrics", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(3))));
    public static final C2294b e = new C2294b("appNamespace", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(4))));

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        C1455a c1455a = (C1455a) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(f9213b, c1455a.f16687a);
        interfaceC2296d.add(c, c1455a.f16688b);
        interfaceC2296d.add(f9214d, c1455a.c);
        interfaceC2296d.add(e, c1455a.f16689d);
    }
}
