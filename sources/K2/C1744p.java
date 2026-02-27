package k2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1744p implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1744p f17997a = new C1744p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f17998b = C2294b.c(AppMeasurementSdk.ConditionalUserProperty.NAME);
    public static final C2294b c = C2294b.c("importance");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f17999d = C2294b.c("frames");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1713X c1713x = (C1713X) ((C0) obj);
        interfaceC2296d.add(f17998b, c1713x.f17901a);
        interfaceC2296d.add(c, c1713x.f17902b);
        interfaceC2296d.add(f17999d, c1713x.c);
    }
}
