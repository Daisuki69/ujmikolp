package cg;

/* JADX INFO: renamed from: cg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1100a implements InterfaceC1101b {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile InterfaceC1101b f9363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f9364b;

    public static InterfaceC1101b a(InterfaceC1101b interfaceC1101b) {
        if (interfaceC1101b instanceof C1100a) {
            return interfaceC1101b;
        }
        C1100a c1100a = new C1100a();
        c1100a.f9364b = c;
        c1100a.f9363a = interfaceC1101b;
        return c1100a;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        Object obj;
        Object obj2 = this.f9364b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f9364b;
            if (obj == obj3) {
                obj = this.f9363a.get();
                Object obj4 = this.f9364b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f9364b = obj;
                this.f9363a = null;
            }
        }
        return obj;
    }
}
