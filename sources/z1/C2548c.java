package z1;

import n1.AbstractC1898d;
import n1.t;
import n1.u;

/* JADX INFO: renamed from: z1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2548c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f21347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f21348b;

    public C2548c(t tVar, AbstractC1898d abstractC1898d) {
        this.f21347a = tVar;
        abstractC1898d.getClass();
        this.f21348b = new u();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2548c.class != obj.getClass()) {
            return false;
        }
        return this.f21347a.equals(((C2548c) obj).f21347a);
    }

    public final int hashCode() {
        return this.f21347a.hashCode();
    }
}
