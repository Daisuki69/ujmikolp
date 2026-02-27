package com.google.firebase.messaging;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;
import x2.C2454a;
import x2.InterfaceC2458e;

/* JADX INFO: renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1183a implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1183a f9766a = new C1183a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f9767b = new C2294b("projectNumber", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(1))));
    public static final C2294b c = new C2294b("messageId", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f9768d = new C2294b("instanceId", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(3))));
    public static final C2294b e = new C2294b("messageType", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(4))));
    public static final C2294b f = new C2294b("sdkPlatform", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(5))));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2294b f9769g = new C2294b("packageName", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(6))));
    public static final C2294b h = new C2294b("collapseKey", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(7))));
    public static final C2294b i = new C2294b("priority", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(8))));
    public static final C2294b j = new C2294b("ttl", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(9))));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C2294b f9770k = new C2294b("topic", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(10))));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C2294b f9771l = new C2294b("bulkId", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(11))));
    public static final C2294b m = new C2294b("event", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(12))));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2294b f9772n = new C2294b("analyticsLabel", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(13))));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2294b f9773o = new C2294b("campaignId", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(14))));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C2294b f9774p = new C2294b("composerLabel", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(15))));

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        H2.d dVar = (H2.d) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(f9767b, dVar.f2079a);
        interfaceC2296d.add(c, dVar.f2080b);
        interfaceC2296d.add(f9768d, dVar.c);
        interfaceC2296d.add(e, dVar.f2081d);
        interfaceC2296d.add(f, H2.c.ANDROID);
        interfaceC2296d.add(f9769g, dVar.e);
        interfaceC2296d.add(h, dVar.f);
        interfaceC2296d.add(i, dVar.f2082g);
        interfaceC2296d.add(j, dVar.h);
        interfaceC2296d.add(f9770k, dVar.i);
        interfaceC2296d.add(f9771l, 0L);
        interfaceC2296d.add(m, H2.a.MESSAGE_DELIVERED);
        interfaceC2296d.add(f9772n, dVar.j);
        interfaceC2296d.add(f9773o, 0L);
        interfaceC2296d.add(f9774p, dVar.f2083k);
    }
}
