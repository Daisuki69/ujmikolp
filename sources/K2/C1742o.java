package k2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1742o implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1742o f17991a = new C1742o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f17992b = C2294b.c(AppMeasurementSdk.ConditionalUserProperty.NAME);
    public static final C2294b c = C2294b.c("code");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f17993d = C2294b.c("address");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1712W c1712w = (C1712W) ((A0) obj);
        interfaceC2296d.add(f17992b, c1712w.f17899a);
        interfaceC2296d.add(c, c1712w.f17900b);
        interfaceC2296d.add(f17993d, c1712w.c);
    }
}
