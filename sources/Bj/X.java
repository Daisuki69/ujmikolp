package Bj;

import bj.AbstractC1039j;
import bj.C1037h;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class X extends p0 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ X(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // Bj.p0
    public final boolean i() {
        switch (this.e) {
        }
        return false;
    }

    @Override // Bj.p0
    public final void j(Throwable th2) {
        Object obj = this.f;
        switch (this.e) {
            case 0:
                ((W) obj).dispose();
                break;
            case 1:
                ((Function1) obj).invoke(th2);
                break;
            default:
                Object obj2 = u0.f643a.get(h());
                q0 q0Var = (q0) obj;
                if (!(obj2 instanceof C0162u)) {
                    C1037h.a aVar = C1037h.f9166b;
                    q0Var.resumeWith(H.B(obj2));
                } else {
                    C1037h.a aVar2 = C1037h.f9166b;
                    q0Var.resumeWith(AbstractC1039j.a(((C0162u) obj2).f642a));
                }
                break;
        }
    }
}
