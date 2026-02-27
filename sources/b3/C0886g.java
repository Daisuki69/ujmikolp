package b3;

import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: b3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0886g implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0886g f8458a = new C0886g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f8459b = C2294b.c("eventType");
    public static final C2294b c = C2294b.c("sessionData");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f8460d = C2294b.c("applicationInfo");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        C0873M c0873m = (C0873M) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        c0873m.getClass();
        interfaceC2296d.add(f8459b, EnumC0892m.f8484b);
        interfaceC2296d.add(c, c0873m.f8396a);
        interfaceC2296d.add(f8460d, c0873m.f8397b);
    }
}
