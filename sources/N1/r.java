package N1;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements o {
    public static final q c = new q(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile o f3508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3509b;

    @Override // N1.o
    public final Object get() {
        o oVar = this.f3508a;
        q qVar = c;
        if (oVar != qVar) {
            synchronized (this) {
                try {
                    if (this.f3508a != qVar) {
                        Object obj = this.f3508a.get();
                        this.f3509b = obj;
                        this.f3508a = qVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f3509b;
    }

    public final String toString() {
        Object objM = this.f3508a;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (objM == c) {
            objM = androidx.camera.core.impl.a.m(new StringBuilder("<supplier that returned "), this.f3509b, ">");
        }
        return androidx.camera.core.impl.a.m(sb2, objM, ")");
    }
}
