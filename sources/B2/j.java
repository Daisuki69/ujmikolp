package b2;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements B2.b {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f8366a = c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile B2.b f8367b;

    public j(B2.b bVar) {
        this.f8367b = bVar;
    }

    @Override // B2.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f8366a;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f8366a;
                if (obj == obj3) {
                    obj = this.f8367b.get();
                    this.f8366a = obj;
                    this.f8367b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
