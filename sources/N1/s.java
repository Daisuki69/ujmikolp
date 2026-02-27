package N1;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements o, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3510a;

    public s(Object obj) {
        this.f3510a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return of.p.p(this.f3510a, ((s) obj).f3510a);
        }
        return false;
    }

    @Override // N1.o
    public final Object get() {
        return this.f3510a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3510a});
    }

    public final String toString() {
        return androidx.camera.core.impl.a.m(new StringBuilder("Suppliers.ofInstance("), this.f3510a, ")");
    }
}
