package q;

import dOYHB6.tiZVw8.numX49;
import z.AbstractC2543e;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends k {
    @Override // q.e
    public final Object g(A.a aVar, float f) {
        return Float.valueOf(m(aVar, f));
    }

    public final float l() {
        return m(b(), d());
    }

    public final float m(A.a aVar, float f) {
        if (aVar.f4b == null || aVar.c == null) {
            throw new IllegalStateException(numX49.tnTj78("b27V"));
        }
        A.c cVar = this.e;
        Object obj = aVar.f4b;
        if (cVar != null) {
            aVar.h.getClass();
            Object obj2 = aVar.c;
            e();
            Float f3 = (Float) cVar.b(obj, obj2);
            if (f3 != null) {
                return f3.floatValue();
            }
        }
        if (aVar.i == -3987645.8f) {
            aVar.i = ((Float) obj).floatValue();
        }
        float f7 = aVar.i;
        if (aVar.j == -3987645.8f) {
            aVar.j = ((Float) aVar.c).floatValue();
        }
        return AbstractC2543e.d(f7, aVar.j, f);
    }
}
