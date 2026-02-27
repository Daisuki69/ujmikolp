package b1;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: b1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0851e implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0851e f8301a = new C0851e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f8302b = C2294b.c("privacyContext");
    public static final C2294b c = C2294b.c("productIdOrigin");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(f8302b, ((p) ((C) obj)).f8328a);
        interfaceC2296d.add(c, B.f8283a);
    }
}
