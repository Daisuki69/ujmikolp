package k2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.flutter.plugins.firebase.crashlytics.Constants;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1746q implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1746q f18001a = new C1746q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f18002b = C2294b.c("pc");
    public static final C2294b c = C2294b.c("symbol");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f18003d = C2294b.c(Constants.FILE);
    public static final C2294b e = C2294b.c(TypedValues.CycleType.S_WAVE_OFFSET);
    public static final C2294b f = C2294b.c("importance");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        Z z4 = (Z) ((B0) obj);
        interfaceC2296d.add(f18002b, z4.f17906a);
        interfaceC2296d.add(c, z4.f17907b);
        interfaceC2296d.add(f18003d, z4.c);
        interfaceC2296d.add(e, z4.f17908d);
        interfaceC2296d.add(f, z4.e);
    }
}
