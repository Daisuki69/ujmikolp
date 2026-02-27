package k2;

import io.flutter.plugins.firebase.crashlytics.Constants;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1714a implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1714a f17909a = new C1714a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f17910b = C2294b.c("arch");
    public static final C2294b c = C2294b.c("libraryName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f17911d = C2294b.c(Constants.BUILD_ID);

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1696F c1696f = (C1696F) ((q0) obj);
        interfaceC2296d.add(f17910b, c1696f.f17847a);
        interfaceC2296d.add(c, c1696f.f17848b);
        interfaceC2296d.add(f17911d, c1696f.c);
    }
}
