package b1;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: b1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0852f implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0852f f8303a = new C0852f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f8304b = C2294b.c("clearBlob");
    public static final C2294b c = C2294b.c("encryptedBlob");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        q qVar = (q) ((D) obj);
        interfaceC2296d.add(f8304b, qVar.f8329a);
        interfaceC2296d.add(c, qVar.f8330b);
    }
}
