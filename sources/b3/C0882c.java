package b3;

import android.os.Build;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: b3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0882c implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0882c f8435a = new C0882c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f8436b = C2294b.c("packageName");
    public static final C2294b c = C2294b.c("versionName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f8437d = C2294b.c("appBuildVersion");
    public static final C2294b e = C2294b.c("deviceManufacturer");
    public static final C2294b f = C2294b.c("currentProcessDetails");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2294b f8438g = C2294b.c("appProcessDetails");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        C0880a c0880a = (C0880a) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(f8436b, c0880a.f8426a);
        interfaceC2296d.add(c, c0880a.f8427b);
        interfaceC2296d.add(f8437d, c0880a.c);
        interfaceC2296d.add(e, Build.MANUFACTURER);
        interfaceC2296d.add(f, c0880a.f8428d);
        interfaceC2296d.add(f8438g, c0880a.e);
    }
}
