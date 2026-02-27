package b3;

import android.os.Build;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: b3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0883d implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0883d f8441a = new C0883d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f8442b = C2294b.c("appId");
    public static final C2294b c = C2294b.c("deviceModel");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f8443d = C2294b.c("sessionSdkVersion");
    public static final C2294b e = C2294b.c("osVersion");
    public static final C2294b f = C2294b.c("logEnvironment");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2294b f8444g = C2294b.c("androidAppInfo");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        C0881b c0881b = (C0881b) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(f8442b, c0881b.f8431a);
        interfaceC2296d.add(c, Build.MODEL);
        interfaceC2296d.add(f8443d, "3.0.2");
        interfaceC2296d.add(e, Build.VERSION.RELEASE);
        interfaceC2296d.add(f, EnumC0904y.f8503b);
        interfaceC2296d.add(f8444g, c0881b.f8432b);
    }
}
