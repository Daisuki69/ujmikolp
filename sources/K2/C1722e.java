package k2;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1722e implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1722e f17937a = new C1722e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f17938b = C2294b.c("files");
    public static final C2294b c = C2294b.c("orgId");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1698H c1698h = (C1698H) ((u0) obj);
        interfaceC2296d.add(f17938b, c1698h.f17851a);
        interfaceC2296d.add(c, c1698h.f17852b);
    }
}
