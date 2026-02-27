package N1;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements o, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f3505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile transient boolean f3506b;
    public transient Object c;

    public p(o oVar) {
        this.f3505a = oVar;
    }

    @Override // N1.o
    public final Object get() {
        if (!this.f3506b) {
            synchronized (this) {
                try {
                    if (!this.f3506b) {
                        Object obj = this.f3505a.get();
                        this.c = obj;
                        this.f3506b = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        return androidx.camera.core.impl.a.m(new StringBuilder("Suppliers.memoize("), this.f3506b ? androidx.camera.core.impl.a.m(new StringBuilder("<supplier that returned "), this.c, ">") : this.f3505a, ")");
    }
}
