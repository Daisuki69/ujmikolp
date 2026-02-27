package e1;

import aj.InterfaceC0716a;

/* JADX INFO: renamed from: e1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1417a implements InterfaceC0716a {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile InterfaceC1418b f16549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f16550b;

    public static InterfaceC0716a a(InterfaceC1418b interfaceC1418b) {
        if (interfaceC1418b instanceof C1417a) {
            return interfaceC1418b;
        }
        C1417a c1417a = new C1417a();
        c1417a.f16550b = c;
        c1417a.f16549a = interfaceC1418b;
        return c1417a;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        Object obj;
        Object obj2 = this.f16550b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f16550b;
                if (obj == obj3) {
                    obj = this.f16549a.get();
                    Object obj4 = this.f16550b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f16550b = obj;
                    this.f16549a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
