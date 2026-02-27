package F1;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements c {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile c f1518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f1519b;

    public static c a(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        b bVar = new b();
        bVar.f1519b = c;
        bVar.f1518a = cVar;
        return bVar;
    }

    @Override // F1.c
    public final Object zza() {
        Object objZza;
        Object obj = this.f1519b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.f1519b;
                if (objZza == obj2) {
                    objZza = this.f1518a.zza();
                    Object obj3 = this.f1519b;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.f1519b = objZza;
                    this.f1518a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objZza;
    }
}
