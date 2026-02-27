package c1;

import f1.C1458d;
import io.flutter.plugins.firebase.crashlytics.Constants;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;
import x2.C2454a;
import x2.InterfaceC2458e;

/* JADX INFO: renamed from: c1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1057c implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1057c f9217a = new C1057c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f9218b = new C2294b("eventsDroppedCount", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(1))));
    public static final C2294b c = new C2294b(Constants.REASON, androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(3))));

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        C1458d c1458d = (C1458d) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(f9218b, c1458d.f16695a);
        interfaceC2296d.add(c, c1458d.f16696b);
    }
}
