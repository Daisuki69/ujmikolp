package k2;

import io.flutter.plugins.firebase.crashlytics.Constants;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1738m implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1738m f17980a = new C1738m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f17981b = C2294b.c("threads");
    public static final C2294b c = C2294b.c(Constants.EXCEPTION);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f17982d = C2294b.c("appExitInfo");
    public static final C2294b e = C2294b.c("signal");
    public static final C2294b f = C2294b.c("binaries");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1709T c1709t = (C1709T) ((D0) obj);
        interfaceC2296d.add(f17981b, c1709t.f17890a);
        interfaceC2296d.add(c, c1709t.f17891b);
        interfaceC2296d.add(f17982d, c1709t.c);
        interfaceC2296d.add(e, c1709t.f17892d);
        interfaceC2296d.add(f, c1709t.e);
    }
}
