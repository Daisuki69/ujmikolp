package Dj;

import Bj.M0;
import gj.InterfaceC1526a;
import kotlin.Unit;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f1197k;

    public o(int i, a aVar) {
        super(i);
        this.f1197k = aVar;
        if (aVar != a.f1163a) {
            if (i < 1) {
                throw new IllegalArgumentException(We.s.g(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + z.a(e.class).c() + " instead").toString());
        }
    }

    public final Object K(Object obj, boolean z4) {
        m mVar;
        o oVar;
        Object obj2;
        if (this.f1197k == a.c) {
            Object objJ = super.j(obj);
            return (!(objJ instanceof k) || (objJ instanceof j)) ? objJ : Unit.f18162a;
        }
        M5.f fVar = g.f1179d;
        m mVar2 = (m) e.f.get(this);
        while (true) {
            long andIncrement = e.f1172b.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zV = v(andIncrement, false);
            int i = g.f1178b;
            long j6 = i;
            long j7 = j / j6;
            int i4 = (int) (j % j6);
            if (mVar2.c != j7) {
                m mVarA = e.a(this, j7, mVar2);
                if (mVarA != null) {
                    mVar = mVarA;
                    obj2 = obj;
                    oVar = this;
                } else if (zV) {
                    return new j(r());
                }
            } else {
                mVar = mVar2;
                oVar = this;
                obj2 = obj;
            }
            int iE = e.e(oVar, mVar, i4, obj2, j, fVar, zV);
            mVar2 = mVar;
            if (iE == 0) {
                mVar2.b();
                return Unit.f18162a;
            }
            if (iE == 1) {
                return Unit.f18162a;
            }
            if (iE == 2) {
                if (zV) {
                    mVar2.i();
                    return new j(r());
                }
                M0 m0 = fVar instanceof M0 ? (M0) fVar : null;
                if (m0 != null) {
                    m0.b(mVar2, i4 + i);
                }
                i((mVar2.c * j6) + ((long) i4));
                return Unit.f18162a;
            }
            if (iE == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iE == 4) {
                if (j < e.c.get(this)) {
                    mVar2.b();
                }
                return new j(r());
            }
            if (iE == 5) {
                mVar2.b();
            }
            obj = obj2;
        }
    }

    @Override // Dj.e, Dj.u
    public final Object j(Object obj) {
        return K(obj, false);
    }

    @Override // Dj.e, Dj.u
    public final Object m(InterfaceC1526a interfaceC1526a, Object obj) throws Throwable {
        if (K(obj, true) instanceof j) {
            throw r();
        }
        return Unit.f18162a;
    }

    @Override // Dj.e
    public final boolean y() {
        return this.f1197k == a.f1164b;
    }
}
