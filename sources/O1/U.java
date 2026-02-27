package O1;

import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public class U extends AbstractC0527v implements InterfaceC0515i0, Serializable {
    public final transient y0 e;
    public final transient int f;

    public U(y0 y0Var, int i) {
        this.e = y0Var;
        this.f = i;
    }

    @Override // O1.n0
    public final Collection a() {
        Collection c0499a0 = this.f9739a;
        if (c0499a0 == null) {
            c0499a0 = new C0499a0(this);
            this.f9739a = c0499a0;
        }
        return (M) c0499a0;
    }

    @Override // com.google.common.collect.a
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // O1.n0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public X b() {
        return this.e;
    }

    @Override // O1.n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final S get(Object obj) {
        S s9 = (S) this.e.get(obj);
        if (s9 != null) {
            return s9;
        }
        P p10 = S.f4555b;
        return t0.e;
    }

    @Override // O1.n0
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.a, O1.n0
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // O1.n0
    public final int size() {
        return this.f;
    }

    @Override // O1.n0
    public final Collection values() {
        Collection c0501b0 = this.c;
        if (c0501b0 == null) {
            c0501b0 = new C0501b0(this);
            this.c = c0501b0;
        }
        return (M) c0501b0;
    }
}
