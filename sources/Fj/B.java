package Fj;

import Ej.V;
import Ej.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends V implements f0 {
    @Override // Ej.f0
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.h;
            kotlin.jvm.internal.j.d(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.i + ((long) ((int) ((n() + ((long) this.f1420k)) - this.i)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void u(int i) {
        synchronized (this) {
            Object[] objArr = this.h;
            kotlin.jvm.internal.j.d(objArr);
            b(Integer.valueOf(((Number) objArr[((int) ((this.i + ((long) ((int) ((n() + ((long) this.f1420k)) - this.i)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
