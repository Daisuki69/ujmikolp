package d3;

/* JADX INFO: renamed from: d3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1329a implements d {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile InterfaceC1330b f16256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f16257b;

    public static d a(InterfaceC1330b interfaceC1330b) {
        if (interfaceC1330b instanceof C1329a) {
            return interfaceC1330b;
        }
        C1329a c1329a = new C1329a();
        c1329a.f16257b = c;
        c1329a.f16256a = interfaceC1330b;
        return c1329a;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        Object obj;
        Object obj2 = this.f16257b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f16257b;
                if (obj == obj3) {
                    obj = this.f16256a.get();
                    Object obj4 = this.f16257b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f16257b = obj;
                    this.f16256a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
