package k2;

import io.flutter.plugins.firebase.crashlytics.Constants;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1732j implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1732j f17960a = new C1732j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f17961b = C2294b.c("generator");
    public static final C2294b c = C2294b.c(Constants.IDENTIFIER);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f17962d = C2294b.c("appQualitySessionId");
    public static final C2294b e = C2294b.c("startedAt");
    public static final C2294b f = C2294b.c("endedAt");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2294b f17963g = C2294b.c("crashed");
    public static final C2294b h = C2294b.c("app");
    public static final C2294b i = C2294b.c("user");
    public static final C2294b j = C2294b.c("os");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C2294b f17964k = C2294b.c("device");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C2294b f17965l = C2294b.c("events");
    public static final C2294b m = C2294b.c("generatorType");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1701K c1701k = (C1701K) ((O0) obj);
        interfaceC2296d.add(f17961b, c1701k.f17861a);
        interfaceC2296d.add(c, c1701k.f17862b.getBytes(P0.f17882a));
        interfaceC2296d.add(f17962d, c1701k.c);
        interfaceC2296d.add(e, c1701k.f17863d);
        interfaceC2296d.add(f, c1701k.e);
        interfaceC2296d.add(f17963g, c1701k.f);
        interfaceC2296d.add(h, c1701k.f17864g);
        interfaceC2296d.add(i, c1701k.h);
        interfaceC2296d.add(j, c1701k.i);
        interfaceC2296d.add(f17964k, c1701k.j);
        interfaceC2296d.add(f17965l, c1701k.f17865k);
        interfaceC2296d.add(m, c1701k.f17866l);
    }
}
