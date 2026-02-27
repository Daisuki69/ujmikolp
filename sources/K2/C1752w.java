package k2;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1752w implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1752w f18023a = new C1752w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f18024b = C2294b.c("rolloutId");
    public static final C2294b c = C2294b.c("variantId");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1729h0 c1729h0 = (C1729h0) ((I0) obj);
        interfaceC2296d.add(f18024b, c1729h0.f17953a);
        interfaceC2296d.add(c, c1729h0.f17954b);
    }
}
