package q;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends e {
    public final Object i;

    public p(A.c cVar, Object obj) {
        super(Collections.EMPTY_LIST);
        k(cVar);
        this.i = obj;
    }

    @Override // q.e
    public final float c() {
        return 1.0f;
    }

    @Override // q.e
    public final Object f() {
        A.c cVar = this.e;
        Object obj = this.i;
        return cVar.b(obj, obj);
    }

    @Override // q.e
    public final Object g(A.a aVar, float f) {
        return f();
    }

    @Override // q.e
    public final void i() {
        if (this.e != null) {
            super.i();
        }
    }

    @Override // q.e
    public final void j(float f) {
        this.f19722d = f;
    }
}
