package a3;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: a3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0624a implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0624a f6983a = new C0624a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f6984b = C2294b.c("rolloutId");
    public static final C2294b c = C2294b.c("variantId");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f6985d = C2294b.c("parameterKey");
    public static final C2294b e = C2294b.c("parameterValue");
    public static final C2294b f = C2294b.c("templateVersion");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C0626c c0626c = (C0626c) ((AbstractC0628e) obj);
        interfaceC2296d.add(f6984b, c0626c.f6989b);
        interfaceC2296d.add(c, c0626c.c);
        interfaceC2296d.add(f6985d, c0626c.f6990d);
        interfaceC2296d.add(e, c0626c.e);
        interfaceC2296d.add(f, c0626c.f);
    }
}
