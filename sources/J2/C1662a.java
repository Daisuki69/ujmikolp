package j2;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: j2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1662a implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1662a f17670a = new C1662a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f17671b = C2294b.c("rolloutId");
    public static final C2294b c = C2294b.c("parameterKey");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f17672d = C2294b.c("parameterValue");
    public static final C2294b e = C2294b.c("variantId");
    public static final C2294b f = C2294b.c("templateVersion");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1663b c1663b = (C1663b) ((n) obj);
        interfaceC2296d.add(f17671b, c1663b.f17673b);
        interfaceC2296d.add(c, c1663b.c);
        interfaceC2296d.add(f17672d, c1663b.f17674d);
        interfaceC2296d.add(e, c1663b.e);
        interfaceC2296d.add(f, c1663b.f);
    }
}
