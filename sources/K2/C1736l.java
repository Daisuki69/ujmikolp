package k2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1736l implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1736l f17976a = new C1736l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f17977b = C2294b.c("baseAddress");
    public static final C2294b c = C2294b.c("size");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f17978d = C2294b.c(AppMeasurementSdk.ConditionalUserProperty.NAME);
    public static final C2294b e = C2294b.c("uuid");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1710U c1710u = (C1710U) ((y0) obj);
        interfaceC2296d.add(f17977b, c1710u.f17893a);
        interfaceC2296d.add(c, c1710u.f17894b);
        interfaceC2296d.add(f17978d, c1710u.c);
        String str = c1710u.f17895d;
        interfaceC2296d.add(e, str != null ? str.getBytes(P0.f17882a) : null);
    }
}
