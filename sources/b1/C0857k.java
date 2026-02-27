package b1;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: b1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0857k implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0857k f8317a = new C0857k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f8318b = C2294b.c("networkType");
    public static final C2294b c = C2294b.c("mobileSubtype");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        x xVar = (x) ((K) obj);
        interfaceC2296d.add(f8318b, xVar.f8345a);
        interfaceC2296d.add(c, xVar.f8346b);
    }
}
