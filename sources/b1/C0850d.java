package b1;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: b1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0850d implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0850d f8299a = new C0850d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f8300b = C2294b.c("clientType");
    public static final C2294b c = C2294b.c("androidClientInfo");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        o oVar = (o) ((AbstractC0846A) obj);
        oVar.getClass();
        interfaceC2296d.add(f8300b, z.f8347a);
        interfaceC2296d.add(c, oVar.f8327a);
    }
}
